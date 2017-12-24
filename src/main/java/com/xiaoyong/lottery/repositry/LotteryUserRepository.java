/**
 * Creation Date:2017年12月17日-下午8:44:17
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.xiaoyong.lottery.repositry;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.xiaoyong.lottery.domain.LotteryUser;

/**
 * Description Of The Class<br/>
 * QQ:603470086
 * 
 * @author 	郁晓勇
 * @version 1.0.0, 2017年12月17日-下午8:44:17
 * @since 2017年12月17日-下午8:44:17
 */
public interface LotteryUserRepository extends PagingAndSortingRepository<LotteryUser, Integer> {
	
	public LotteryUser findByUsernameAndPassword(String username, String password);
	
}

