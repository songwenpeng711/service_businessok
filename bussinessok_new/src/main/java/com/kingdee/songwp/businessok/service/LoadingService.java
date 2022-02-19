package com.kingdee.songwp.businessok.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kingdee.songwp.businessok.bean.Employee;

import com.kingdee.songwp.businessok.mapper.LoadingMapper;

@Service("loadingService")
public class LoadingService {
	
	@Autowired
	private LoadingMapper loadingMapper;
	
	public Employee validateEmp(String fEmpNumber,String mobilePhone,String password) {
		if(mobilePhone != null) {
			mobilePhone = mobilePhone.trim();
			int phoneLength = mobilePhone.length();
			if(phoneLength > 11) {
				mobilePhone = mobilePhone.substring(phoneLength - 11);
			}
		}		
		return loadingMapper.getEmployee(fEmpNumber, mobilePhone, password);
		
	}
	
	public int updatePassword(String fUserId, String newPassword) {
		
		return loadingMapper.updatePassword(fUserId, newPassword);
	}

	public Integer isForbidden(Integer fUserID) {
		
		return loadingMapper.isForbidden(fUserID);
	}

}
