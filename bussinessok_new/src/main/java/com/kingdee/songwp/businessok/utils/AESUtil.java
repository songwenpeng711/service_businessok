package com.kingdee.songwp.businessok.utils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.alibaba.druid.util.StringUtils;

/**
 * 对称加密工具类
 * 
 * @author songwenpeng 20180921
 *
 */
public class AESUtil {
	
	private static final Logger logger = LogManager.getLogger(AESUtil.class);

	/**
	 * 对称加密
	 * 
	 * @param key     密钥
	 * @param content 加密内容
	 * @return
	 */
	public static String AESEncode(String keyStr, String content) {

		try {
			Key key = createKey2(keyStr);
			// 6.根据指定算法AES自成密码器
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			// 7.初始化密码器，第一个参数为加密(Encrypt_mode)或者解密解密(Decrypt_mode)操作，第二个参数为使用的KEY
			IvParameterSpec iv = new IvParameterSpec("0102030405060708".getBytes());
			cipher.init(Cipher.ENCRYPT_MODE, key, iv);
			// 8.获取加密内容的字节数组(这里要设置为utf-8)不然内容中如果有中文和英文混合中文就会解密为乱码
			byte[] byte_encode = content.getBytes("utf-8");
			// 9.根据密码器的初始化方式--加密：将数据加密
			byte[] byte_AES = cipher.doFinal(byte_encode);
			// 10.将加密后的数据转换为字符串
			String encodeStr = Base64.encodeBase64String(byte_AES);
			// 11.将字符串返回
			return encodeStr;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (InvalidKeyException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (BadPaddingException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (InvalidAlgorithmParameterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		return null;

	}

	/**
	 * 对称解密
	 * 
	 * @param keyStr  密钥
	 * @param content 解密内容
	 * @return
	 */
	public static String AESDncode(String keyStr, String content) {

		try {
			Key key = createKey2(keyStr);
			// 6.根据指定算法AES自成密码器
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			// 7.初始化密码器，第一个参数为加密(Encrypt_mode)或者解密(Decrypt_mode)操作，第二个参数为使用的KEY
			IvParameterSpec iv = new IvParameterSpec("0102030405060708".getBytes());
			cipher.init(Cipher.DECRYPT_MODE, key, iv);
			// 8.将加密并编码后的内容解码成字节数组
			byte[] byte_content = Base64.decodeBase64(content);
			/*
			 * 解密
			 */
			byte[] byte_decode = cipher.doFinal(byte_content);
			String AES_decode = new String(byte_decode, "utf-8");
			return AES_decode;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (InvalidKeyException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (BadPaddingException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (InvalidAlgorithmParameterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		return null;
	}


	/**
	 * 对map的value值进行加密
	 * 
	 * @param key 密钥
	 * @param map
	 */
	public static void encodeMap(String key, Map<String, Object> map) {

		for (Entry<String, Object> entry : map.entrySet()) {
			Object value = entry.getValue();
			if (value instanceof String && !StringUtils.isEmpty(value.toString())) {
				value = AESEncode(key, value.toString());
				entry.setValue(value);
			}
		}
	}

	/**
	 * 对map的value值进行解密
	 * 
	 * @param key 密钥
	 * @param map
	 */
	public static Map<String,Object> decodeMap(String key, Map<String, Object> map) {

		for (Entry<String, Object> entry : map.entrySet()) {
			Object value = entry.getValue();
			if (value instanceof String && value != null && !StringUtils.isEmpty(value.toString())) {
				value = AESDncode(key, value.toString());
				if(value == null)
					return null;
				entry.setValue(value);
			}
		}
		return map;
	}

	private static Key createKey(String password) {

		KeyGenerator kgen;
		try {
			kgen = KeyGenerator.getInstance("AES");
			SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
			secureRandom.setSeed(password.getBytes());

			kgen.init(128, secureRandom);// 利用用户密码作为随机数初始化出
											// 128位的key生产者
			// 加密没关系，SecureRandom是生成安全随机数序列，password.getBytes()是种子，只要种子相同，序列就一样，所以解密只要有password就行

			SecretKey secretKey = kgen.generateKey();// 根据用户密码，生成一个密钥

			byte[] enCodeFormat = secretKey.getEncoded();// 返回基本编码格式的密钥，如果此密钥不支持编码，则返回
															// null。

			SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");// 转换为AES专用密钥
			return key;
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 创建AES的Key生产者

		return null;
	}

	private static Key createKey2(String password) {

        SecretKeySpec key = new SecretKeySpec(password.getBytes(), "AES");
        return key;

    }
	/**
	 * 产生一个随机密钥
	 * 
	 * @return
	 */
	public static String createPassword() {

		return UUID.randomUUID().toString().replace("-", "");

	}

	public static void main(String[] args) {

		String key = createPassword();
		String encodeStr = AESEncode(key, "好好学校，天天向上");
		String res = AESDncode(key, encodeStr);
		System.out.println(res);
	}
}
