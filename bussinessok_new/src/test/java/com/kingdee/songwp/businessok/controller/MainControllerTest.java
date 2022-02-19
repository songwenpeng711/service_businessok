package com.kingdee.songwp.businessok.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.alibaba.fastjson.JSONObject;
import com.kingdee.songwp.businessok.BussinessokNewApplication;
import com.kingdee.songwp.businessok.utils.AESUtil;
import com.kingdee.songwp.businessok.utils.RSAUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BussinessokNewApplication.class)
@WebAppConfiguration
public class MainControllerTest {

	@Autowired
    protected WebApplicationContext wac;
	
	private MockMvc mockMvc;
	
	@Before
	public void setUp() throws Exception {
		// mvc = MockMvcBuilders.standaloneSetup(new TestController()).build();
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();// 建议使用这种
	}

	//@Test
	public void downloadTest() {

		Map<String, Object> jsonMap = new LinkedHashMap<String, Object>();
		jsonMap.put("BType", "download");
		jsonMap.put("BTName", "t_ICItem");
		String dateStr = DateFormatUtils.format(new Date(), "yyyyMMddhhmm");
		jsonMap.put("BTime", dateStr);
		jsonMap.put("EMPhone", "1234567890");
		jsonMap.put("FEmpNumber", "01");
		jsonMap.put("FUserID", "16398");
		jsonMap.put("Content", "");
		String randomKey = AESUtil.createPassword();
		System.out.println("client:randomKey------>" + randomKey);
		AESUtil.encodeMap(randomKey, jsonMap);
		String pubKey = "F:/BaiduNetdiskDownload/keys/publicKey.key";
		byte[] pubKeys = RSAUtil.getKey(pubKey);
		String deStr = RSAUtil.encrypt(pubKeys, randomKey, RSAUtil.PUBLIC_KEY);
		jsonMap.put("Token", deStr);
		String reqStr = JSONObject.toJSONString(jsonMap);
		System.out.println(reqStr);
		reqStr = Base64.encodeBase64String(reqStr.getBytes());

		MvcResult mvcResult;
		try {
			mvcResult = mockMvc
					.perform(post("/web/download").contentType(MediaType.APPLICATION_JSON).param("requestStr", reqStr))
					.andReturn();
			String rspStr = mvcResult.getResponse().getContentAsString();
			System.out.println(rspStr);
			String res = new String(Base64.decodeBase64(rspStr));
			//解析Json
			JSONObject jsonObject = JSONObject.parseObject(res);
			Map<String,Object> map = jsonObject.toJavaObject(Map.class);
			map.remove("Token");
			Map<String,Object> infoMap =  AESUtil.decodeMap(randomKey, map);
			System.out.println(infoMap);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public void loginTest() {
		
		Map<String, Object> jsonMap = new LinkedHashMap<String, Object>();
		jsonMap.put("BType", "login");
		String dateStr = DateFormatUtils.format(new Date(), "yyyyMMddhhmm");
		jsonMap.put("BTime", dateStr);
		jsonMap.put("EMPhone", "12345678");
		jsonMap.put("FEmpNumber", "02");
		jsonMap.put("FClientPwd", "123456");
		jsonMap.put("Content", "");
		String randomKey = AESUtil.createPassword();
		System.out.println("client:randomKey------>" + randomKey);
		AESUtil.encodeMap(randomKey, jsonMap);
		String pubKey = "F:/BaiduNetdiskDownload/keys/publicKey.key";
		byte[] pubKeys = RSAUtil.getKey(pubKey);
		String deStr = RSAUtil.encrypt(pubKeys, randomKey, RSAUtil.PUBLIC_KEY);
		jsonMap.put("Token", deStr);
		String reqStr = JSONObject.toJSONString(jsonMap);
		System.out.println(reqStr);
		reqStr = Base64.encodeBase64String(reqStr.getBytes());

		MvcResult mvcResult;
		try {
			mvcResult = mockMvc
					.perform(post("/web/login").contentType(MediaType.APPLICATION_JSON).param("requestStr", reqStr))
					.andReturn();
			String rspStr = mvcResult.getResponse().getContentAsString();
			System.out.println(rspStr);
			String res = new String(Base64.decodeBase64(rspStr));
			//解析Json
			JSONObject jsonObject = JSONObject.parseObject(res);
			Map<String,Object> map = jsonObject.toJavaObject(Map.class);
			String encodeKey = (String)map.get("Token");
			String key = RSAUtil.decrypt(pubKeys, encodeKey, RSAUtil.PUBLIC_KEY);
			map.remove("Token");
			Map<String,Object> infoMap =  AESUtil.decodeMap(key, map);
			System.out.println(infoMap);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	public void downloadStaticTest() {
		
		Map<String, Object> jsonMap = new LinkedHashMap<String, Object>();
		jsonMap.put("BType", "downloadStatic");
		String dateStr = DateFormatUtils.format(new Date(), "yyyyMMddhhmm");
		jsonMap.put("BTime", dateStr);
		jsonMap.put("empID", "286");
		jsonMap.put("startDate", "2010-01-01");
		jsonMap.put("endDate", "2019-12-31");
		jsonMap.put("staticType", "other");
		String randomKey = AESUtil.createPassword();
		System.out.println("client:randomKey------>" + randomKey);
		AESUtil.encodeMap(randomKey, jsonMap);
		String pubKey = "F:/BaiduNetdiskDownload/keys/publicKey.key";
		byte[] pubKeys = RSAUtil.getKey(pubKey);
		String deStr = RSAUtil.encrypt(pubKeys, randomKey, RSAUtil.PUBLIC_KEY);
		jsonMap.put("Token", deStr);
		String reqStr = JSONObject.toJSONString(jsonMap);
		System.out.println(reqStr);
		reqStr = Base64.encodeBase64String(reqStr.getBytes());

		MvcResult mvcResult;
		try {
			mvcResult = mockMvc
					.perform(post("/web/downloadStatic").contentType(MediaType.APPLICATION_JSON).param("requestStr", reqStr))
					.andReturn();
			String rspStr = mvcResult.getResponse().getContentAsString();
			System.out.println(rspStr);
			String res = new String(Base64.decodeBase64(rspStr));
			//解析Json
			JSONObject jsonObject = JSONObject.parseObject(res);
			Map<String,Object> map = jsonObject.toJavaObject(Map.class);
			String encodeKey = (String)map.get("Token");
			String key = RSAUtil.decrypt(pubKeys, encodeKey, RSAUtil.PUBLIC_KEY);
			map.remove("Token");
			Map<String,Object> infoMap =  AESUtil.decodeMap(key, map);
			System.out.println(infoMap);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
