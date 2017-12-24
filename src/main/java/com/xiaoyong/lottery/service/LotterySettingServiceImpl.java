/**
 * Creation Date:2017年12月24日-下午4:18:21
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.xiaoyong.lottery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.xiaoyong.lottery.domain.LotterySetting;
import com.xiaoyong.lottery.repositry.LotterySettingRepository;

/**
 * Description Of The Class<br/>
 * QQ:603470086
 * 
 * @author 	郁晓勇
 * @version 1.0.0, 2017年12月24日-下午4:18:21
 * @since 2017年12月24日-下午4:18:21
 */
/**
 * Description Of The Class<br/>
 * QQ:603470086
 * 
 * @author 	郁晓勇
 * @version 1.0.0, 2017年12月24日-下午4:54:53
 * @since 2017年12月24日-下午4:54:53
 */
@Service
public class LotterySettingServiceImpl implements LotterySettingService {

	@Autowired
	LotterySettingRepository lotterySettingRepository;
	
	@Override
	public Page<LotterySetting> findAll(Pageable pageable) {
		return lotterySettingRepository.findAll(pageable);
	}

}

