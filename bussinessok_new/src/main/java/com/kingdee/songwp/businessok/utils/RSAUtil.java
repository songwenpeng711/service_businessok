package com.kingdee.songwp.businessok.utils;

import java.io.File;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * 非对称加密工具类
 * @author songwenpeng 20180919
 *
 */
public class RSAUtil {
	
	private static final Logger logger = LogManager.getLogger(RSAUtil.class);
	
	public static final int PRIVATE_KEY = 0;
	public static final int PUBLIC_KEY = 1;
	public static final int ENCRYPT_MODE = Cipher.ENCRYPT_MODE;
	public static final int DECRYPT_MODE = Cipher.DECRYPT_MODE;
	
	//非对称密钥算法
    private static final String KEY_ALGORITHM = "RSA";
    //密钥长度
    private static final int KEY_SIZE = 1024;
    //加密字符串编码
    private static final String ENCODING = "utf-8";
    
    /**
     * 生成私有秘钥与共有秘钥的文件
     * @param priFilePath 私有秘钥文件路径
     * @param pubFilePath 公有秘钥文件路径
     */
    public static void initKey(String priFilePath,String pubFilePath) {
    	
		try {
			//生成秘钥对
	        KeyPairGenerator keyPairGenerator;
			keyPairGenerator = KeyPairGenerator.getInstance(KEY_ALGORITHM);
			keyPairGenerator.initialize(KEY_SIZE);
	        KeyPair keyPair = keyPairGenerator.generateKeyPair();
	        //生成密钥字符串
	        byte[] priKeyBytes = keyPair.getPrivate().getEncoded();
	        String priKeyStr = Base64.encodeBase64String(priKeyBytes);
	        byte[] pubKeyBytes = keyPair.getPublic().getEncoded();
	        String pubKeyStr = Base64.encodeBase64String(pubKeyBytes);
	        System.out.println("公有密钥----"+pubKeyStr);
	        //生成私有密钥文件
	        FileUtils.writeStringToFile(new File(priFilePath), priKeyStr,ENCODING);
	        //生成公有密钥文件
	        FileUtils.writeStringToFile(new File(pubFilePath), pubKeyStr,ENCODING);
	        
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(e.getMessage());
		} 
        
    }
    
    /**
     * 通过文件获取密钥
     * @param priFilePath 私有秘钥文件地址
     * @return
     */
    public static byte[] getKey(String filePath) {
    	
    	//获取私有秘钥字符串
    	try {
			String keyStr = FileUtils.readFileToString(new File(filePath),ENCODING);
			return  Base64.decodeBase64(keyStr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(e.getMessage());
		}
    	return null;
    }
    
    /**
     * 秘钥加密/解密
     * @param key 秘钥
     * @param data 加密的数据
     * @param keyType 密钥类型
     * @param doType 加密操作类型
     * @return
     */
    public static String encrypt(byte[] keyBytes, String data, int keyType) {
    	
    	//实例化密钥工厂
        KeyFactory keyFactory;
		try {
			keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
			//初始化密钥
	        EncodedKeySpec encodeKeySpec = null;
	        Key key = null;
	        switch(keyType) {
	          case  PRIVATE_KEY :
	        	  encodeKeySpec = new PKCS8EncodedKeySpec(keyBytes);
	        	  key = keyFactory.generatePrivate(encodeKeySpec);
	        	  break;
	          case PUBLIC_KEY :
	        	  encodeKeySpec = new X509EncodedKeySpec(keyBytes);
	        	  key = keyFactory.generatePublic(encodeKeySpec);
	        }
	        
	        //数据加密
	        Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
	        cipher.init(Cipher.ENCRYPT_MODE, key);
	        byte[] enBytes = cipher.doFinal(data.getBytes());
	        return Base64.encodeBase64String(enBytes);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (InvalidKeySpecException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (NoSuchPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (IllegalBlockSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(e.getMessage());
		}
        
    	
    	return null;
    	
    }
    
    public static String decrypt(byte[] keyBytes, String data, int keyType) {
    	
    	byte[] dataBytes = Base64.decodeBase64(data);
    	//实例化密钥工厂
        KeyFactory keyFactory;
		try {
			keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
			//初始化密钥
	        EncodedKeySpec encodeKeySpec = null;
	        Key key = null;
	        switch(keyType) {
	          case  PRIVATE_KEY :
	        	  encodeKeySpec = new PKCS8EncodedKeySpec(keyBytes);
	        	  key = keyFactory.generatePrivate(encodeKeySpec);
	        	  break;
	          case PUBLIC_KEY :
	        	  encodeKeySpec = new X509EncodedKeySpec(keyBytes);
	        	  key = keyFactory.generatePublic(encodeKeySpec);
	        }
	        
	        //数据加密
	        Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
	        cipher.init(Cipher.DECRYPT_MODE, key);
	        byte[] enBytes = cipher.doFinal(dataBytes);
	        return new String(enBytes);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (InvalidKeySpecException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (NoSuchPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (IllegalBlockSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(e.getMessage());
		}
        
    	
    	return null;
    	
    }
    
   
    
    public static void main(String[] args) {
		
    	String priKey = "/Users/songwenpeng/keys/privateKey.key";
    	String pubKey = "/Users/songwenpeng/keys/publicKey.key";
    	//生成密钥
    	initKey(priKey,pubKey);
    	//获取密钥
    	byte[] priKeys = getKey(priKey);
    	byte[] pubKeys = getKey(pubKey);
    	String data =  "好好学习，天天向上"	;
    	String enStr = encrypt(pubKeys,data,PUBLIC_KEY);
      	System.out.println(enStr);
    	String deStr = decrypt(priKeys,enStr,PRIVATE_KEY);
    	System.out.println(deStr);
    	
	}
    

}
