package com.interceptop.interceptordemo.handler;

import com.interceptop.interceptordemo.exception.InvalidHeaderException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserExceptionHandler {
  @ExceptionHandler
  public ResponseEntity<String> handleInvalidHeader(InvalidHeaderException exception){
    return new ResponseEntity<>(exception.getMessage(), HttpStatus.PRECONDITION_FAILED);
  }
}
