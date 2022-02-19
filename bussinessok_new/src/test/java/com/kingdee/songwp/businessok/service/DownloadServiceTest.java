package com.kingdee.songwp.businessok.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kingdee.songwp.businessok.BussinessokNewApplication;
import com.kingdee.songwp.businessok.bean.SaleOrderStatic;
import com.kingdee.songwp.businessok.mapper.DownloadMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BussinessokNewApplication.class)
@EnableAutoConfiguration()
public class DownloadServiceTest {
	
	@Autowired
	private DownloadService downloadService;
	
	@Test
	public void getSOrderGoodStaticTest() {
		String startDate = "2010-01-01";
		String endDate = "2019-12-31";
		int empID = 286;
		List<SaleOrderStatic> sList = downloadService.getSOrderGoodStatic(startDate, endDate, empID);
		
		System.out.println(sList);
	}

}
