package com.anurag.service;

import java.util.ArrayList;

import com.anurag.beans.Customer;
import com.anurag.dao.CustomerDao;

public class CustomerService {
	public ArrayList<Customer> getAllCustomers() {
		CustomerDao dao = new CustomerDao();
		return dao.getAllCustomers();

	}

	public boolean deleteCustomer(long customer_Id) {
		CustomerDao dao = new CustomerDao();
		return dao.deleteCustomer(customer_Id);
	}

	public boolean addCustomer(Customer customer) {
		CustomerDao dao = new CustomerDao();
		return dao.addCustomer(customer);

	}

	public ArrayList<Customer> getCustomer(String name,long customerId) {
		CustomerDao dao = new CustomerDao();
		return dao.getCustomer(name, customerId);

	}
	
	public boolean updateCustomer(Customer customer) {
		CustomerDao dao = new CustomerDao();
		return dao.updateCustomer(customer);

	}

	public Customer getOneCustomers(long id) {
		CustomerDao dao = new CustomerDao();
		return dao.getOneCustomers(id);

	}


}
