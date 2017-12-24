/**
 * Creation Date:2017年12月24日-下午3:15:45
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.xiaoyong.lottery.task;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.xiaoyong.lottery.domain.LotteryPrizePool;
import com.xiaoyong.lottery.domain.LotterySetting;
import com.xiaoyong.lottery.service.LotteryPrizePoolService;
import com.xiaoyong.lottery.service.LotterySettingService;
import com.xiaoyong.lottery.util.PrizePoolHolder;

/**
 * Description Of The Class<br/>
 * QQ:603470086
 * 
 * @author 	郁晓勇
 * @version 1.0.0, 2017年12月24日-下午3:15:45
 * @since 2017年12月24日-下午3:15:45
 */
@Service
public class PrizePoolSyncTask {
	
	@Autowired
	LotterySettingService lotterySettingService;
	@Autowired
	LotteryPrizePoolService lotteryPrizePoolService;
	
	
	@Scheduled(initialDelay = 0, fixedRate = 10000)
	public void synchronizePrizePool(){
		loadPoolFromDB();
		persistPoolToDB();
	}
	
	private void loadPoolFromDB(){
		Page<LotterySetting> settings = lotterySettingService.findAll(new PageRequest(0, Integer.MAX_VALUE));
		
		for(LotterySetting setting: settings.getContent()){
			if(!setting.isStarted()){
				continue;
			}
			LotteryPrizePool pool = PrizePoolHolder.getPool(setting.getId());
			if(pool == null){
				pool = lotteryPrizePoolService.getPrizePoolBySettingId(setting.getId());
			}
			if(pool == null){
				pool = new LotteryPrizePool();
				pool.setSetting(setting);
				pool.setTotal(setting.getTotal());
				pool.setPrizeINum(setting.getPrizeINum());
				pool.setPrizeIINum(setting.getPrizeIINum());
				pool.setPrizeIIINum(setting.getPrizeIIINum());
				pool.setPrizeIVNum(setting.getPrizeIVNum());
				pool.setPrizeVNum(setting.getPrizeVNum());
				pool.setPrizeVINum(setting.getPrizeVINum());
				lotteryPrizePoolService.createPrizePool(pool);
			}
			if(pool != null){
				PrizePoolHolder.setPool(pool);
			}
		}
	}
	
	private void persistPoolToDB(){
		Collection<LotteryPrizePool> pools = PrizePoolHolder.getPools();
		for(LotteryPrizePool pool: pools){
			lotteryPrizePoolService.updatePrizePool(pool);
		}
	}
}

