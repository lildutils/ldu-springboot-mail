package com.lildutils.springboot.mail.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.lildutils.springboot.mail.sender.ex.LDuMailSenderException;

@ControllerAdvice
public class LDuMailSenderControllerAdvice extends ResponseEntityExceptionHandler
{
	@ExceptionHandler(LDuMailSenderException.class)
	@ResponseBody
	ResponseEntity<?> handleLDuMailSenderException( LDuMailSenderException e )
	{
		return super.handleExceptionInternal( e, e.getMessage(), null, HttpStatus.BAD_REQUEST, null );
	}

}
