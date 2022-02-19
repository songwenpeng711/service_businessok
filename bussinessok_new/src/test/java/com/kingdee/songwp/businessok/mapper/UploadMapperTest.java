package com.kingdee.songwp.businessok.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kingdee.songwp.businessok.BussinessokNewApplication;
import com.kingdee.songwp.businessok.bean.Organization;
import com.kingdee.songwp.businessok.bean.SaleOrder;
import com.kingdee.songwp.businessok.bean.SaleOrderEntry;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BussinessokNewApplication.class)
@EnableAutoConfiguration()
public class UploadMapperTest {

	@Autowired
	private UploadMapper uploadMapper;
	
	
	public void getBillIDTest() {
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("fBillType", 81);
		map.put("billID", "");
		uploadMapper.getBillID(map);
		System.out.println(map);
	}
	
	public void getICMaxNumTest() {
	   Map<String,Object> map = new HashMap<String, Object>();
	   map.put("tableName", "SEOrder");
	   map.put("userID", "16399");
	   map.put("fInterID", "");
	   uploadMapper.getICMaxNum(map);
	   System.out.println(map);
	}
	
	public void insertSaleOrderTest() {
//		SaleOrder saleOrder = new SaleOrder(1949,"SEORD000821",2775,new Date(),
//				101,2501,287,16394,new Date(),20302,2,"PHONE00023");
//		uploadMapper.insertSaleOrder(saleOrder);
	}
	
	public void insertSaleOrderEntryTest() {
		SaleOrderEntry entry = new SaleOrderEntry(1949,276,4800,3.333f,16000,"赠品",new Date(),
				    249,80,200,new Date());
		List<SaleOrderEntry> entryList = new ArrayList<SaleOrderEntry>();
		entryList.add(entry);
		entryList.add(entry);
		uploadMapper.insertSaleOrderEntry(entryList);
	}
	
	public void getUpStockWhenSaveTest() {
		Integer state = uploadMapper.getUpStockWhenSave();
		System.out.println(state);
	}
	@Test
	public void updateOrganizationTest() {
		Organization org = new Organization();
		org.setfItemID(976);
		org.setFName("aaa金城路");
		org.setfAddress("aaa福满家(金城路)");
		org.setfPhone("66198888");
		org.setfContact("张经理");
		Integer state = uploadMapper.updateOrganization(org);
		System.out.println(state);
	}
}
