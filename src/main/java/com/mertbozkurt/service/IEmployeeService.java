package com.mertbozkurt.service;

import java.util.List;

import com.mertbozkurt.dto.DtoEmployee;

public interface IEmployeeService {

	public List<DtoEmployee> findAllEmployees();
}
