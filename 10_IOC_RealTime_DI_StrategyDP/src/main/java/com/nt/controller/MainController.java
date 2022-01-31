package com.nt.controller;

import com.nt.dto.CustomerDTO;
import com.nt.service.ICustomerMgmtService;
import com.nt.vo.CustomerVO;

public class MainController {

	private ICustomerMgmtService service;

	public MainController(ICustomerMgmtService service) {
		System.out.println("MainController : 1-param constructor");
		this.service = service;
	}

	public String processCustomer(CustomerVO vo) throws Exception {
		CustomerDTO dto = null;
		String result = null;
		// prepare DTO
		dto = new CustomerDTO();
		dto.setCustomerName(vo.getCustomerName());
		dto.setCustomerAddr(vo.getCustomerAddr());
		dto.setPrincipalAmt(Float.valueOf(vo.getPrincipalAmt()));
		dto.setRateOfInterest(Float.valueOf(vo.getRateOfInterest()));
		dto.setTime(Float.valueOf(vo.getTime()));
		// use service
		result = service.calculateSimpleInterest(dto);
		return result;
	}// processCustomer(-)

}// class
