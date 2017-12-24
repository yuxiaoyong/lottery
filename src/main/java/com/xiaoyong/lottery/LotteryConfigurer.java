/**
 * Creation Date:2017年12月24日-下午6:58:24
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.xiaoyong.lottery;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.xiaoyong.lottery.interceptor.SessionInterceptor;

/**
 * Description Of The Class<br/>
 * QQ:603470086
 * 
 * @author 	郁晓勇
 * @version 1.0.0, 2017年12月24日-下午6:58:24
 * @since 2017年12月24日-下午6:58:24
 */
@Configuration
public class LotteryConfigurer extends WebMvcConfigurerAdapter {
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new SessionInterceptor())
		        .addPathPatterns("/**")
		        .excludePathPatterns("/api/passport/**");
		super.addInterceptors(registry);
	}
}

