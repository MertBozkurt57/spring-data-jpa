package com.mertbozkurt.controller;

import com.mertbozkurt.dto.DtoCustomer;

public interface ICustomerController {

	public DtoCustomer findCustomerById(Long id);
}
