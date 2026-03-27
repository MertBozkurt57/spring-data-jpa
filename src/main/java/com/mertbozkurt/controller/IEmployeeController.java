package com.mertbozkurt.controller;

import java.util.List;

import com.mertbozkurt.dto.DtoEmployee;

public interface IEmployeeController {
	
	public List<DtoEmployee> findAllEmployees();
}
