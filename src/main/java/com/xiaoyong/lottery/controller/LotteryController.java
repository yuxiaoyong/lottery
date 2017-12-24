/**
 * Creation Date:2017年12月17日-下午8:48:32
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.xiaoyong.lottery.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xiaoyong.lottery.Constants;
import com.xiaoyong.lottery.domain.LotteryPrizePool;
import com.xiaoyong.lottery.domain.LotteryResult;
import com.xiaoyong.lottery.domain.LotteryUser;
import com.xiaoyong.lottery.exception.BusinessException;
import com.xiaoyong.lottery.model.Result;
import com.xiaoyong.lottery.model.SuccessResult;
import com.xiaoyong.lottery.service.LotteryResultService;
import com.xiaoyong.lottery.service.LotterySettingService;
import com.xiaoyong.lottery.util.PrizeCalcUtils;
import com.xiaoyong.lottery.util.PrizePoolHolder;

/**
 * Description Of The Class<br/>
 * QQ:603470086
 * 
 * @author 	郁晓勇
 * @version 1.0.0, 2017年12月17日-下午8:48:32
 * @since 2017年12月17日-下午8:48:32
 */
@RestController
@RequestMapping("/api/lottery")
public class LotteryController {
	
	@Autowired
	LotteryResultService lotteryResultService;
	@Autowired
	LotterySettingService lotterySettingService;
	
	@RequestMapping("/status")
	public Result<?> getPrizeStatus(@RequestParam("id")int id, HttpSession session){
		LotteryPrizePool pool = PrizePoolHolder.getPool(id);
		LotteryUser user = (LotteryUser)session.getAttribute(Constants.SESSION_KEY);
		LotteryResult result = lotteryResultService.getLotteryResultByUserIdAndSettingId(user.getId(), pool.getSetting().getId());
		return new SuccessResult<>()
				.setAttr("total", pool.getSetting().getTotal()-pool.getTotal())
				.setAttr("result", result);
	}
	
	@RequestMapping("/rank")
	public Result<?> getPrizeRank(@RequestParam("id")int id, HttpSession session){
		
		LotteryPrizePool pool = PrizePoolHolder.getPool(id);
		if(pool == null){
			throw new BusinessException("抽奖失败，请重新抽奖");
		}
		
		LotteryUser user = (LotteryUser)session.getAttribute(Constants.SESSION_KEY);
		
		if(isUserPlayed(user.getId(), pool.getSetting().getId())){
			throw new BusinessException("您已参加过抽奖");
		}
		
		int rank = PrizeCalcUtils.getPrizeRank(pool);
		
		LotteryResult result = new LotteryResult();
		result.setRank(rank);
		result.setUser(user);
		result.setSetting(pool.getSetting());
		lotteryResultService.createLotteryResult(result);
		
		return new SuccessResult<>().setAttr("rank", rank);
	}
	
	private boolean isUserPlayed(int userId, int settingId){
		LotteryResult result = lotteryResultService.getLotteryResultByUserIdAndSettingId(userId, settingId);
		return result != null;
	}
}

