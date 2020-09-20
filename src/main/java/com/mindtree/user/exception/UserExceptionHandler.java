package com.mindtree.user.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserExceptionHandler {

	@ExceptionHandler
	public String handleUserException(RuntimeException ex) {
		return ex.getMessage();
	}
}
