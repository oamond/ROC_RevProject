 package com.brokebankapp.dao;

import java.util.Date;

import com.brokebankapp.exception.BusinessException;
import com.brokebankapp.model.Customer;

public interface CustomerCrudDAO {
	// to create cutomer could use more work
	public Customer CreateCustomer(int cxid, String username, String password, String full_name)throws BusinessException;
	

	
//	public Customer CustomerId(int cxid) throws BusinessException;
//	public Customer Customerusername(String username) throws BusinessException;
//	public Customer CustomerPassword(String password) throws BusinessException;
//	//public Customer CustomerAccountId(int account_id) throws BusinessException;
//	//public Customer CustomerBalance(double balance) throws BusinessException;
//	public Customer CustomeFullName(String full_name) throws BusinessException;
//	public Customer CustomeDob(Date dob) throws BusinessException;
	

}
