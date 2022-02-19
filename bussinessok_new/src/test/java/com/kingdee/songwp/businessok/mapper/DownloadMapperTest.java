package com.kingdee.songwp.businessok.mapper;


import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kingdee.songwp.businessok.BussinessokNewApplication;
import com.kingdee.songwp.businessok.bean.Inventory;
import com.kingdee.songwp.businessok.bean.SOrderGoodStatic;
import com.kingdee.songwp.businessok.bean.SaleOrderParameter;
import com.kingdee.songwp.businessok.bean.SaleOrderStatic;
import com.kingdee.songwp.businessok.bean.SalePolicy;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BussinessokNewApplication.class)
@EnableAutoConfiguration()
public class DownloadMapperTest {
	
	@Autowired
	private DownloadMapper downloadMapper;
	
	
	public void getAllPolicyTest() {
		
		List<SalePolicy> salePolicys = downloadMapper.getSalePolicys();
		System.out.println(salePolicys);
	}
	
	public void getSaleOrderParameterTest() {
		List<SaleOrderParameter> parameterList = downloadMapper.getSaleOrderParameter("01");
		System.out.println(parameterList);
	}
	
	public void getSaleOrderStaticTest() {
		String startDate = "2010-01-01";
		String endDate = "2019-12-31";
		int empID = 286;
		List<SaleOrderStatic> staticList = downloadMapper.getSaleOrderStatic(startDate, endDate, empID);
		System.out.println(staticList);
	}
	
	public void getSOrderGoodStaticTest() {
		String startDate = "2010-01-01";
		String endDate = "2019-12-31";
		int empID = 286;
		List idList = Arrays.asList(new Integer[] {1467, 1470, 1471, 1472});
		List<SOrderGoodStatic> staticList = downloadMapper.getSOrderGoodStatic(startDate, endDate, empID,idList);
		System.out.println(staticList);
	}
	@Test
	public void getInventories() {
		List<Long> fItemIDs = new ArrayList<Long>();
		fItemIDs.add(5388L);
		fItemIDs.add(5389L);
		List<Long> stockIDs = new ArrayList<Long>();
		stockIDs.add(251L);
		stockIDs.add(252L);
		stockIDs.add(253L);
		List<Inventory> invList = downloadMapper.getInventories(null, null);
		System.out.println(invList);
	}

}
