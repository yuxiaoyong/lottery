/**
 * Creation Date:2017年12月24日-下午4:12:09
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.xiaoyong.lottery.service;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaoyong.lottery.domain.LotteryPrizePool;
import com.xiaoyong.lottery.repositry.LotteryPrizePoolRepository;

/**
 * Description Of The Class<br/>
 * QQ:603470086
 * 
 * @author 	郁晓勇
 * @version 1.0.0, 2017年12月24日-下午4:12:09
 * @since 2017年12月24日-下午4:12:09
 */
@Service
public class LotteryPrizePoolServiceImpl implements LotteryPrizePoolService {

	@Autowired
	LotteryPrizePoolRepository lotteryPrizePoolRepository;
	
	@Override
	public LotteryPrizePool getPrizePoolBySettingId(int settingId) {
		return lotteryPrizePoolRepository.findBySettingId(settingId);
	}

	@Transactional
	@Override
	public LotteryPrizePool createPrizePool(LotteryPrizePool prizePool) {
		prizePool.setCreatedTime(new Date());
		prizePool.setUpdatedTime(new Date());
		return lotteryPrizePoolRepository.save(prizePool);
	}

	@Transactional
	@Override
	public LotteryPrizePool updatePrizePool(LotteryPrizePool prizePool) {
		prizePool.setUpdatedTime(new Date());
		return lotteryPrizePoolRepository.save(prizePool);
	}

}

