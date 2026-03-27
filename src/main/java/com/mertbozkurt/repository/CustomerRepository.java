package com.mertbozkurt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mertbozkurt.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	
}
