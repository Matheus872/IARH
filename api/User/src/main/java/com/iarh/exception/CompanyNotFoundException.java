package com.iarh.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CompanyNotFoundException extends Exception {
    public CompanyNotFoundException(Long id) {
        super("Company not found with id " + id);
    }
}
