/**
 * Creation Date:2017年12月17日-下午8:44:58
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.xiaoyong.lottery.service;

import com.xiaoyong.lottery.domain.LotteryUser;

/**
 * Description Of The Class<br/>
 * QQ:603470086
 * 
 * @author 	郁晓勇
 * @version 1.0.0, 2017年12月17日-下午8:44:58
 * @since 2017年12月17日-下午8:44:58
 */
public interface LotteryUserService {
	
	/**
	 * 根据用户名与密码找到用户信息
	 * 
	 * @author 	郁晓勇
	 * @version 1.0.0, 2017年12月17日-下午8:45:34
	 * @param username
	 * @param password
	 * @return SysUser
	 */
	public LotteryUser findByUsernameAndPassword(String username, String password);
}

