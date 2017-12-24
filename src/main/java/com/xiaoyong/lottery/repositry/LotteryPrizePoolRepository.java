/**
 * Creation Date:2017年12月24日-下午3:52:34
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.xiaoyong.lottery.repositry;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.xiaoyong.lottery.domain.LotteryPrizePool;

/**
 * Description Of The Class<br/>
 * QQ:603470086
 * 
 * @author 	郁晓勇
 * @version 1.0.0, 2017年12月24日-下午3:52:34
 * @since 2017年12月24日-下午3:52:34
 */
public interface LotteryPrizePoolRepository extends
		PagingAndSortingRepository<LotteryPrizePool, Integer> {

	@Query("from LotteryPrizePool a where a.setting.id=:settingId")
	public LotteryPrizePool findBySettingId(@Param("settingId")int settingId);
}

