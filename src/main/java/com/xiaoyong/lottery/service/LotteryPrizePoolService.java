/**
 * Creation Date:2017年12月24日-下午4:08:24
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.xiaoyong.lottery.service;

import com.xiaoyong.lottery.domain.LotteryPrizePool;

/**
 * Description Of The Class<br/>
 * QQ:603470086
 * 
 * @author 	郁晓勇
 * @version 1.0.0, 2017年12月24日-下午4:08:24
 * @since 2017年12月24日-下午4:08:24
 */
public interface LotteryPrizePoolService {

	/**
	 * 根据setting获取奖池信息
	 * 
	 * @author 	郁晓勇
	 * @version 1.0.0, 2017年12月24日-下午4:10:57
	 * @param settingId
	 * @return LotteryPrizePool
	 */
	public LotteryPrizePool getPrizePoolBySettingId(int settingId);
	
	/**
	 * 创建奖池信息
	 * 
	 * @author 	郁晓勇
	 * @version 1.0.0, 2017年12月24日-下午4:11:31
	 * @param prizePool
	 * @return LotteryPrizePool
	 */
	public LotteryPrizePool createPrizePool(LotteryPrizePool prizePool);
	
	/**
	 * 更新奖池信息
	 * 
	 * @author 	郁晓勇
	 * @version 1.0.0, 2017年12月24日-下午4:11:43
	 * @param prizePool
	 * @return LotteryPrizePool
	 */
	public LotteryPrizePool updatePrizePool(LotteryPrizePool prizePool);
	
	
}

