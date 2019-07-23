package com.stackroot.dao;

import com.stackroot.dto.Customer;

public interface CustomerDAO {
	Customer selectCustomer(int customerId);

	int insert(Customer c);

	int deleteCustomer(int customerId);

	void updateCustomer(Customer customer);
}
