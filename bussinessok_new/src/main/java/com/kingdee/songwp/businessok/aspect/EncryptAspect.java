package com.kingdee.songwp.businessok.aspect;

import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.codec.binary.Base64;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.kingdee.songwp.businessok.utils.AESUtil;
import com.kingdee.songwp.businessok.utils.AESUtil2;
import com.kingdee.songwp.businessok.utils.ErrorInfo;
import com.kingdee.songwp.businessok.utils.RSAUtil;


/**
 * 进行web service 接口方法的加密与解密的切面类
 * @author songwenpeng 20180922
 *
 */
@Aspect
@Component("encryptAspect")
public class EncryptAspect {
	
	private static final Logger logger = LogManager.getLogger(EncryptAspect.class);
	
	@Value("${application.private_key_path}")
	private String privatekey_path;
	
	@Pointcut(value = "execution(* com.kingdee.songwp.businessok.controller.*.*(..))")
	public void requestPointcut() {
		
	}
	@Around("requestPointcut()")
	public Object decrypt(ProceedingJoinPoint joinpoint) {
		
		Object[] args = joinpoint.getArgs();
		String str = (String) args[0];
		logger.debug("Request network source data:\b\n" + str);
		//Base64解密
		byte[] reqStr_type = Base64.decodeBase64(str);
		String reqStr_dec = new String(reqStr_type);
		String reqStr_dec_bak = reqStr_dec;
		logger.debug("Request DEBase64 data:\b\n" + reqStr_dec);
		//解析Json
		JSONObject jsonObject = JSONObject.parseObject(reqStr_dec);
		Map<String,Object> map = jsonObject.toJavaObject(Map.class);
		//获取同步加密密钥
		String encodeKey = jsonObject.getString("Token");
		//String priKey = "/Users/songwenpeng/keys/privateKey.key";
		byte[] priKeys = RSAUtil.getKey(privatekey_path);
		if(priKeys == null) {
			String errStr = ErrorInfo.getErrJsonStr(ErrorInfo.GET_PRI_KEY_ERROR);
			jsonObject.put("Content", errStr);
			errStr = Base64.encodeBase64String(errStr.getBytes());
			logger.error("Request RSA private key is not existed.");
			return errStr;
		}
		String enKeyStr = RSAUtil.decrypt(priKeys,encodeKey,RSAUtil.PRIVATE_KEY);
		logger.debug("Request Token :" + enKeyStr);
		if(enKeyStr == null) {
			String errStr = ErrorInfo.getErrJsonStr(ErrorInfo.PARAM_TOKEN_ERROR);
			jsonObject.put("Content", errStr);
			errStr = Base64.encodeBase64String(errStr.getBytes());
			logger.error("Request AES token is not existed.");
			return errStr;
		}
		//解密数据
		map.remove("Token");
		Map<String,Object> infoMap =  AESUtil2.decodeMap(enKeyStr, map);
		if(infoMap == null) {
			String errStr = ErrorInfo.getErrJsonStr(ErrorInfo.PARAM_INFO_ERROR);
			jsonObject.put("Content", errStr);
			errStr = Base64.encodeBase64String(errStr.getBytes());
			logger.error("Request AES decode error.");
			return errStr;
		}
		map.put("Token", encodeKey);
		JSONObject srcJsonObj = JSONObject.parseObject(JSON.toJSONString(map));
		String decodeStr = srcJsonObj.toJSONString();
		logger.debug("Request AES decode after data:\b\n" + decodeStr);
	    try { 
			Object res  = joinpoint.proceed(new Object[] {decodeStr});
			//加密返回数据
			JSONObject jsonObj = JSONObject.parseObject(res.toString());
			String content = jsonObj.getString("Content");
			logger.debug("response source content:\b\n" + content);
			content = AESUtil2.encrypt(content, enKeyStr);
			logger.debug("response AES encode after content:\b\n" + content);
			JSONObject jsonObject_bak = JSONObject.parseObject(reqStr_dec_bak);
			jsonObject_bak.put("Content", content);
			encodeKey = RSAUtil.encrypt(priKeys, enKeyStr, RSAUtil.PRIVATE_KEY);
			logger.debug("response RSA decode Token:" + encodeKey);
			jsonObject_bak.put("Token", encodeKey);
			String encodeStr = jsonObject_bak.toJSONString();
			logger.debug("response Base64 before encode :\b\n" + encodeStr);
			res = Base64.encodeBase64String(encodeStr.getBytes());
			logger.debug("response Base64 after encode :\b\n" + res);
			return res;
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.debug(e.getMessage());
		}
		return null;
	}

	public void setPrivatekey_path(String privatekey_path) {
		this.privatekey_path = privatekey_path;
	}

	

	
}
