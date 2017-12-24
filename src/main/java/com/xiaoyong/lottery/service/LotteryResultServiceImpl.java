/**
 * Creation Date:2017年12月24日-下午4:19:19
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.xiaoyong.lottery.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaoyong.lottery.domain.LotteryResult;
import com.xiaoyong.lottery.repositry.LotteryResultRepository;

/**
 * Description Of The Class<br/>
 * QQ:603470086
 * 
 * @author 	郁晓勇
 * @version 1.0.0, 2017年12月24日-下午4:19:19
 * @since 2017年12月24日-下午4:19:19
 */
@Service
public class LotteryResultServiceImpl implements LotteryResultService {

	@Autowired
	LotteryResultRepository lotteryResultRepository;
	
	@Override
	public LotteryResult createLotteryResult(LotteryResult result) {
		result.setCreatedTime(new Date());
		result.setUpdatedTime(new Date());
		return lotteryResultRepository.save(result);
	}

	@Override
	public LotteryResult getLotteryResultByUserIdAndSettingId(int userId,
			int settingId) {
		return lotteryResultRepository.findByUserIdAndSettingId(userId, settingId);
	}

}

