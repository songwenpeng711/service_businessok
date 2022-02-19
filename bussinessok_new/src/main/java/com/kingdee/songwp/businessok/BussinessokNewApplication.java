package com.kingdee.songwp.businessok;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@MapperScan("com.kingdee.songwp.businessok.mapper")
public class BussinessokNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(BussinessokNewApplication.class, args);
	}

}
