package com.kingdee.songwp.businessok.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kingdee.songwp.businessok.BussinessokNewApplication;
import com.kingdee.songwp.businessok.bean.SaleOrder;
import com.kingdee.songwp.businessok.bean.SaleOrderEntry;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BussinessokNewApplication.class)
@EnableAutoConfiguration()
public class UploadServiceTest {
	
	@Autowired
	private UploadService uploadService;
	
	@Test
	public void uploadSaleOrderTest() {
//		
//		SaleOrder saleOrder = new SaleOrder(-1,"SEORD000821",2775,new Date(),
//				101,2501,287,16394,new Date(),20302,2,"PHONE00023");
//		SaleOrderEntry entry = new SaleOrderEntry(1949,276,4800,3.333f,16000,"赠品",new Date(),
//			    249,80,200,new Date());
//	    List<SaleOrderEntry> entryList = new ArrayList<SaleOrderEntry>();
//	    entryList.add(entry);
//	    entryList.add(entry);
//	    entryList.add(entry);
//	    saleOrder.setSaleOrderEntryList(entryList);
//	    for(int i=0; i < 2; i++) {
//	    	
//	    	new Thread(new Runnable() {
//
//				@Override
//				public void run() {
//					
//					uploadService.uploadSaleOrder(saleOrder);
//					
//				}
//		    	
//		    }).start();
//	    }  
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
