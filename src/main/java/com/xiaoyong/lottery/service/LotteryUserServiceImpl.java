/**
 * Creation Date:2017年12月17日-下午8:46:27
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.xiaoyong.lottery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaoyong.lottery.domain.LotteryUser;
import com.xiaoyong.lottery.repositry.LotteryUserRepository;

/**
 * Description Of The Class<br/>
 * QQ:603470086
 * 
 * @author 	郁晓勇
 * @version 1.0.0, 2017年12月17日-下午8:46:27
 * @since 2017年12月17日-下午8:46:27
 */
@Service
public class LotteryUserServiceImpl implements LotteryUserService {

	@Autowired
	LotteryUserRepository lotteryUserRepository;
	
	@Override
	public LotteryUser findByUsernameAndPassword(String username, String password) {
		return lotteryUserRepository.findByUsernameAndPassword(username, password);
	}

}

