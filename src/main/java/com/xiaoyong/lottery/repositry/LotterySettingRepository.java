/**
 * Creation Date:2017年12月24日-下午3:52:05
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.xiaoyong.lottery.repositry;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.xiaoyong.lottery.domain.LotterySetting;

/**
 * Description Of The Class<br/>
 * QQ:603470086
 * 
 * @author 	郁晓勇
 * @version 1.0.0, 2017年12月24日-下午3:52:05
 * @since 2017年12月24日-下午3:52:05
 */
public interface LotterySettingRepository extends
		PagingAndSortingRepository<LotterySetting, Integer> {

}

