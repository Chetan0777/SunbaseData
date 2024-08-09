package com.sunbasedata.controller;

import com.sunbasedata.entity.Login;
import com.sunbasedata.exception.LoginException;
import com.sunbasedata.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AuthUserController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/authenticate")
    public ResponseEntity<String> authenticateUser(@RequestBody Login request) throws LoginException {
        String token = customerService.authenticateUser(request.getLoginId(), request.getPassword());
        return new ResponseEntity<>(token, HttpStatus.OK);
    }

}
