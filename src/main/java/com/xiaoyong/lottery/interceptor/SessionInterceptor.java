/**
 * Creation Date:2017年12月24日-下午7:00:02
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.xiaoyong.lottery.interceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.xiaoyong.lottery.Constants;
import com.xiaoyong.lottery.exception.BusinessException;

/**
 * Description Of The Class<br/>
 * QQ:603470086
 * 
 * @author 	郁晓勇
 * @version 1.0.0, 2017年12月24日-下午7:00:02
 * @since 2017年12月24日-下午7:00:02
 */
public class SessionInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		if(request.getSession().getAttribute(Constants.SESSION_KEY) == null){
			throw new BusinessException("session_invalid");
		}
//		Cookie[] cookies = request.getCookies();
//		if(cookies == null || cookies.length == 0){
//			throw new BusinessException("session_invalid");
//		}
//		for(Cookie cookie: cookies){
//			if(StringUtils.equalsIgnoreCase(cookie.getName(), Constants.SESSION_KEY)){
//				return true;
//			}
//		}
		return true;
	}

}

