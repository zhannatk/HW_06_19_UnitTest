package com.example.calculator.Exc;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DivisionByZeroException extends IllegalArgumentException {
    public DivisionByZeroException(String message) {
        super(message);
    }
}
