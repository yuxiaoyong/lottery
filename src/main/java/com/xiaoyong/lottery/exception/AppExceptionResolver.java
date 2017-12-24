/**
 * Creation Date:2015年7月16日-下午8:07:26
 * 
 * Copyright 2010-2015 © 中格软件 Inc. All Rights Reserved
 */
package com.xiaoyong.lottery.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.xiaoyong.lottery.model.GenericResult;



/**
 * Description Of The Class<br/>
 * QQ:603470086
 * 
 * @author 	郁晓勇
 * @version 1.0.0, 2015年7月16日-下午8:07:26
 * @since 2015年7月16日-下午8:07:26
 */

@ControllerAdvice 
public class AppExceptionResolver {

	private Logger logger = Logger.getLogger(getClass());

	@ExceptionHandler
	public ResponseEntity<?> resolveException(HttpServletRequest request, HttpServletResponse response,
			Object obj, Exception ex) {
		String message = ex.getMessage();
		logger.error(ex.getMessage(), ex);
		GenericResult result = new GenericResult(HttpServletResponse.SC_BAD_REQUEST, message);
		return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
	}

}

