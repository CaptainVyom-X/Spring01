package com.nt.service;

import com.nt.dto.CustomerDTO;

public interface ICustomerMgmtService {

	String calculateSimpleInterest(CustomerDTO dto) throws Exception;

}
