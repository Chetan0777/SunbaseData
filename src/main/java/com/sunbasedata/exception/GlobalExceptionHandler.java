package com.sunbasedata.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDate;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomerException.class)
    public ResponseEntity<ErrorDetails> userExceptionHandler(CustomerException e, WebRequest wr){

        ErrorDetails err=new ErrorDetails();
        err.setLocalDate(LocalDate.now());
        err.setName(e.getMessage());
        err.setDesc(wr.getDescription(false));

        return new ResponseEntity<ErrorDetails>(err, HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(LoginException.class)
    public ResponseEntity<ErrorDetails> userExceptionHandler(LoginException e, WebRequest wr){

        ErrorDetails err=new ErrorDetails();
        err.setLocalDate(LocalDate.now());
        err.setName(e.getMessage());
        err.setDesc(wr.getDescription(false));

        return new ResponseEntity<ErrorDetails>(err, HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails> masterExceptionHandler(Exception e, WebRequest wr){

        ErrorDetails err=new ErrorDetails();
        err.setLocalDate(LocalDate.now());
        err.setName(e.getMessage());
        err.setDesc(wr.getDescription(false));

        return new ResponseEntity<ErrorDetails>(err, HttpStatus.BAD_REQUEST);

    }

}
