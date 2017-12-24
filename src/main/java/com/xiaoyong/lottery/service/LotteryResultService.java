/**
 * Creation Date:2017年12月24日-下午4:17:43
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.xiaoyong.lottery.service;

import com.xiaoyong.lottery.domain.LotteryResult;

/**
 * Description Of The Class<br/>
 * QQ:603470086
 * 
 * @author 	郁晓勇
 * @version 1.0.0, 2017年12月24日-下午4:17:43
 * @since 2017年12月24日-下午4:17:43
 */
public interface LotteryResultService {

	public LotteryResult createLotteryResult(LotteryResult result);
	
	public LotteryResult getLotteryResultByUserIdAndSettingId(int userId, int settingId);
	
}

