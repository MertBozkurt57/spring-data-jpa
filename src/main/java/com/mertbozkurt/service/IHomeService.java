package com.mertbozkurt.service;

import com.mertbozkurt.dto.DtoHome;

public interface IHomeService {

	public DtoHome findHomeById(Long id);
}
