package com.mertbozkurt.service;

import com.mertbozkurt.dto.DtoCustomer;

public interface ICustomerService {

	public DtoCustomer findCustomerById(Long id);
}
