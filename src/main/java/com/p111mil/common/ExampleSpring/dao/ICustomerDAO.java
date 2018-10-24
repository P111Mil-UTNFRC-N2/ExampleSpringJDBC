/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.p111mil.common.ExampleSpring.dao;

import com.p111mil.common.ExampleSpring.model.Customer;
/**
 *
 * @author Ruben
 */
public interface ICustomerDAO {
    	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);
}
