/**
 * Creation Date:2017年12月24日-下午4:12:45
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.xiaoyong.lottery.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.xiaoyong.lottery.domain.LotterySetting;

/**
 * Description Of The Class<br/>
 * QQ:603470086
 * 
 * @author 	郁晓勇
 * @version 1.0.0, 2017年12月24日-下午4:12:45
 * @since 2017年12月24日-下午4:12:45
 */
public interface LotterySettingService {

	public Page<LotterySetting> findAll(Pageable pageable);
}

