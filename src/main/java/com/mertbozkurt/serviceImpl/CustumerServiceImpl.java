package com.mertbozkurt.serviceImpl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mertbozkurt.dto.DtoAddress;
import com.mertbozkurt.dto.DtoCustomer;
import com.mertbozkurt.entities.Address;
import com.mertbozkurt.entities.Customer;
import com.mertbozkurt.repository.CustomerRepository;
import com.mertbozkurt.service.ICustomerService;

@Service
public class CustumerServiceImpl implements ICustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public DtoCustomer findCustomerById(Long id) {

		DtoCustomer dtoCustomer = new DtoCustomer();
		DtoAddress dtoAddress = new DtoAddress();

		Optional<Customer> optional = customerRepository.findById(id);
		if (optional.isEmpty()) {
			return null;
		}

		Customer customer = optional.get();
		Address address = optional.get().getAddress();

		BeanUtils.copyProperties(customer, dtoCustomer);
		BeanUtils.copyProperties(address, dtoAddress);
		
		dtoCustomer.setAddress(dtoAddress);
		
		return dtoCustomer;

	}

}
