package com.kingdee.songwp.businessok.mapper;

import org.apache.ibatis.annotations.Param;

import com.kingdee.songwp.businessok.bean.Employee;

/**
 * 登陆验证接口
 * @author songwenpeng 20180916
 *
 */
public interface LoadingMapper {
	/**
	 * 获取职工信息
	 * @param fEmpNumber 职工编号
	 * @return
	 */
	Employee getEmployee(@Param("fEmpNumber") String fEmpNumber,@Param("mobilePhone") String mobilePhone,@Param("fClientPwd") String fClientPwd);
	/**
	    *      员工是否被禁用
	 * @param fUserID
	 * @return
	 */
	Integer isForbidden(@Param("fUserID") Integer fUserID);
	/**
	 * 更改密码
	 * @param fEmpNumber 职工编号
	 * @param password 新密码
	 */
	int updatePassword(@Param("FUserID") String fUserID, @Param("password") String password);

}
