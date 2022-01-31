package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.ICustomerDAO;
import com.nt.dto.CustomerDTO;

public class CustomerMgmtServiceImpl implements ICustomerMgmtService {

	private ICustomerDAO dao;

	public CustomerMgmtServiceImpl(ICustomerDAO dao) {
		System.out.println("CustomerMgmtServiceImpl : 1-param constructor");
		this.dao = dao;
	}

	@Override
	public String calculateSimpleInterest(CustomerDTO dto) throws Exception {
		float simpleInterest = 0.0f;
		int count = 0;
		CustomerBO bo = null;
		// calculate simple interest
		simpleInterest = ((dto.getPrincipalAmt()) * (dto.getTime()) * (dto.getRateOfInterest())) / (100.0f);
		// prepare BO
		bo = new CustomerBO();
		bo.setCustomerName(dto.getCustomerName());
		bo.setCustomerAddr(dto.getCustomerAddr());
		bo.setPrincipalAmt(dto.getPrincipalAmt());
		bo.setRateOfInterest(dto.getRateOfInterest());
		bo.setTime(dto.getTime());
		bo.setInterestAmt(simpleInterest);
		// use DAO
		count = dao.insert(bo);
		if (count == 0)
			return "Customer Details Insertion Failed";
		else
			return "Customer Details Inserted & Simple Interest Amt is " + simpleInterest;
	}// calculateSimpleInterest(-)

}// class
