/**
 * Creation Date:2017年12月24日-下午2:36:53
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.xiaoyong.lottery;

import java.util.Random;

/**
 * Description Of The Class<br/>
 * QQ:603470086
 * 
 * @author 	郁晓勇
 * @version 1.0.0, 2017年12月24日-下午2:36:53
 * @since 2017年12月24日-下午2:36:53
 */
public class AppConfig {
	
	private int totalCount;
	private int prizeVCount;
	private int prizeIVCount;
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getPrizeVCount() {
		return prizeVCount;
	}
	public void setPrizeVCount(int prizeVCount) {
		this.prizeVCount = prizeVCount;
	}
	public int getPrizeIVCount() {
		return prizeIVCount;
	}
	public void setPrizeIVCount(int prizeIVCount) {
		this.prizeIVCount = prizeIVCount;
	}
	
}

