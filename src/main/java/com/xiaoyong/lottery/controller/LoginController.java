/**
 * Creation Date:2017年12月17日-下午8:48:17
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.xiaoyong.lottery.controller;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xiaoyong.lottery.Constants;
import com.xiaoyong.lottery.domain.LotteryUser;
import com.xiaoyong.lottery.exception.BusinessException;
import com.xiaoyong.lottery.model.Result;
import com.xiaoyong.lottery.model.SuccessResult;
import com.xiaoyong.lottery.service.LotteryUserService;

/**
 * Description Of The Class<br/>
 * QQ:603470086
 * 
 * @author 	郁晓勇
 * @version 1.0.0, 2017年12月17日-下午8:48:17
 * @since 2017年12月17日-下午8:48:17
 */
@RestController
@RequestMapping("/api/passport")
public class LoginController {

	@Autowired
	LotteryUserService lotteryUserService;
	
	@RequestMapping("/signin")
	Result<?> signIn(
			@RequestParam("username")String username, 
			@RequestParam("password")String password,
			HttpServletResponse response,
			HttpSession session) throws Exception{
		LotteryUser user = lotteryUserService.findByUsernameAndPassword(username, password);
		if(user  == null){
			throw new BusinessException("用户名或密码不正确");
		}
		session.setAttribute(Constants.SESSION_KEY, user);
//		Cookie cookie = new Cookie(Constants.SESSION_KEY, UUID.randomUUID().toString());
//		cookie.setPath("/");
//		response.addCookie(cookie);
		return new SuccessResult<>(user);
	}
	
}

