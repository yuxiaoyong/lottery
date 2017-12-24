/**
 * Creation Date:2017年12月24日-下午3:51:16
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.xiaoyong.lottery.repositry;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.xiaoyong.lottery.domain.LotteryResult;

/**
 * Description Of The Class<br/>
 * QQ:603470086
 * 
 * @author 	郁晓勇
 * @version 1.0.0, 2017年12月24日-下午3:51:16
 * @since 2017年12月24日-下午3:51:16
 */
public interface LotteryResultRepository extends
		PagingAndSortingRepository<LotteryResult, Integer> {

	@Query("from LotteryResult a where a.user.id=:userId and a.setting.id=:settingId")
	public LotteryResult findByUserIdAndSettingId(@Param("userId")int userId, @Param("settingId")int settingId);
	
}

