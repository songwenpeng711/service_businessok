package com.kingdee.songwp.businessok.utils;

import java.util.HashMap;

import com.alibaba.fastjson.JSONObject;

/**
 * 错误信息类
 * @author songwenpeng 20180924
 *
 */
public class ErrorInfo {
	
	public static final String GET_PRI_KEY_ERROR = "001";
	public static final String PARAM_TOKEN_ERROR = "002";
	public static final String PARAM_INFO_ERROR = "003";
	public static final String NO_USER_ERROR = "004";
	public static final String NO_MOBILE_REGIST = "005";
	public static final String PASSWORD_ERROR = "006";
	public static final String FORBIDDEN_USER_ERROR = "007";
	
	private static HashMap<String,String> errorMap = new HashMap<String,String>();
	static {
		errorMap.put(GET_PRI_KEY_ERROR, "服务器获取密钥错误");
		errorMap.put(PARAM_TOKEN_ERROR, "服务器解析Token错误");
		errorMap.put(PARAM_INFO_ERROR, "服务器解析信息错误");
		errorMap.put(NO_USER_ERROR, "该用户不存在");
		errorMap.put(NO_MOBILE_REGIST, "该用户手机没有注册");
		errorMap.put(PASSWORD_ERROR, "该用户密码错误");
		errorMap.put(FORBIDDEN_USER_ERROR, "该用户被禁用");
	}
	/**
	 * 通过错误代码获取错误信息
	 * @param errorCode
	 * @return
	 */
	public static String getMessage(String errorCode) {
		
		return errorMap.get(errorCode);
	}
    /**
     * 生成Json格式错误信息
     * @param errorCode 错误代码
     * @return
     */
	public static String getErrJsonStr(String errorCode) {
		
		JSONObject errJsonObj = new JSONObject();
		errJsonObj.put("errorCode", errorCode);
		errJsonObj.put("message", getMessage(errorCode));
		String errStr = errJsonObj.toJSONString();
		return errStr;
	}
}
