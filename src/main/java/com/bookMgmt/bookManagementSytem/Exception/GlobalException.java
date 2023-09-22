package com.bookMgmt.bookManagementSytem.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

@ExceptionHandler(BookNotFoundException.class)
    public ResponseEntity<String> handleBookNotFound(BookNotFoundException e){
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Book with given id not found. "+e.getMessage());
}
}
