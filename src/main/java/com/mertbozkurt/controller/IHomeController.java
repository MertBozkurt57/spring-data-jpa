package com.mertbozkurt.controller;

import com.mertbozkurt.dto.DtoHome;

public interface IHomeController {

	public DtoHome findHomeById(Long id);
}
