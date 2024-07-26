package com.sunbasedata.service;

import com.sunbasedata.entity.Customer;
import com.sunbasedata.exception.CustomerException;
import com.sunbasedata.exception.LoginException;

import java.util.List;

public interface CustomerService {

    String authenticateUser(String loginId, String password) throws LoginException;
    void createCustomer(Customer customer, String token) throws CustomerException;
    List<Object> getCustomerList(String token);
    boolean deleteCustomer(String token, String uuid);
    void updateCustomer(String token, String uuid, Customer customer) throws CustomerException;

}
