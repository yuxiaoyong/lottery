/**
 * Creation Date:2017年12月24日-下午4:01:45
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.xiaoyong.lottery.util;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.xiaoyong.lottery.domain.LotteryPrizePool;

/**
 * Description Of The Class<br/>
 * QQ:603470086
 * 
 * @author 	郁晓勇
 * @version 1.0.0, 2017年12月24日-下午4:01:45
 * @since 2017年12月24日-下午4:01:45
 */
public final class PrizePoolHolder {
	
	private PrizePoolHolder() {}
	
	private static Map<Integer, LotteryPrizePool> pools = new ConcurrentHashMap<Integer, LotteryPrizePool>();
	
	public static LotteryPrizePool getPool(int id){
		return pools.get(id);
	}
	
	public static void setPool(LotteryPrizePool pool){
		pools.put(pool.getSetting().getId(), pool);
	}
	
	public static Collection<LotteryPrizePool> getPools(){
		return pools.values();
	}
}

