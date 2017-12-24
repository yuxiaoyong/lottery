/**
 * Creation Date:2017年12月24日-下午4:57:22
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.xiaoyong.lottery.util;

import java.util.Random;

import com.xiaoyong.lottery.domain.LotteryPrizePool;
import com.xiaoyong.lottery.domain.LotteryResult;

/**
 * Description Of The Class<br/>
 * QQ:603470086
 * 
 * @author 	郁晓勇
 * @version 1.0.0, 2017年12月24日-下午4:57:22
 * @since 2017年12月24日-下午4:57:22
 */
public final class PrizeCalcUtils {
	
	private static Random randomx = new Random();

	public synchronized static int getPrizeRank(LotteryPrizePool pool){
		
		int random = randomx.nextInt(pool.getTotal());
//		if(random >= 
//				(pool.getTotal() - count6(pool))){
//				System.out.println("未中奖:"+i);
//			return LotteryResult.RANK_NONE;
//		}
		pool.setTotal(pool.getTotal()-1);
		if(random >= count5(pool) && random < count6(pool)){
			System.out.println("六等奖:");
			pool.setPrizeVINum(pool.getPrizeVINum()-1);
			return LotteryResult.RANK_VI;
		}
		if(random >= count4(pool) && random < count5(pool)){
			System.out.println("五等奖:");
			pool.setPrizeVNum(pool.getPrizeVNum()-1);
			return LotteryResult.RANK_V;
		}
		if(random >= count3(pool) && random < count4(pool)){
			System.out.println("四等奖:");
			pool.setPrizeIVNum(pool.getPrizeIVNum()-1);
			return LotteryResult.RANK_IV;
		}
		if(random >= count2(pool) && random < count3(pool)){
			System.out.println("三等奖:");
			pool.setPrizeIIINum(pool.getPrizeIIINum()-1);
			return LotteryResult.RANK_III;
		}
		if(random >= count1(pool) && random < count2(pool)){
			System.out.println("二等奖:");
			pool.setPrizeIINum(pool.getPrizeIINum()-1);
			return LotteryResult.RANK_II;
		}
		if(random >= 0 && random < count1(pool)){
			System.out.println("一等奖:");
			pool.setPrizeINum(pool.getPrizeINum()-1);
			return LotteryResult.RANK_I;
		}
		return LotteryResult.RANK_NONE;
	}
	
	private static int count1(LotteryPrizePool pool){
		return pool.getPrizeINum();
	}
	
	private static int count2(LotteryPrizePool pool){
		return count1(pool)+pool.getPrizeIINum();
	}
	
	private static int count3(LotteryPrizePool pool){
		return count2(pool)+pool.getPrizeIIINum();
	}
	
	private static int count4(LotteryPrizePool pool){
		return count3(pool)+pool.getPrizeIVNum();
	}
	
	private static int count5(LotteryPrizePool pool){
		return count4(pool)+pool.getPrizeVNum();
	}
	
	private static int count6(LotteryPrizePool pool){
		return count5(pool)+pool.getPrizeVINum();
	}
	
}

