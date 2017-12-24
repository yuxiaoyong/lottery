/**
 * Creation Date:2017年12月24日-下午2:58:19
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.xiaoyong.lottery.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Description Of The Class<br/>
 * QQ:603470086
 * 
 * @author 	郁晓勇
 * @version 1.0.0, 2017年12月24日-下午2:58:19
 * @since 2017年12月24日-下午2:58:19
 */
@Entity
@Table(name = "lottery_prize_pool")
public class LotteryPrizePool extends BaseEntity{
	
	private static final long serialVersionUID = 7056815137039980246L;
	private int total;
	private int prizeINum;
	private int prizeIINum;
	private int prizeIIINum;
	private int prizeIVNum;
	private int prizeVNum;
	private int prizeVINum;
	private LotterySetting setting;
	
	@Column(name = "total")
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	@Column(name = "prizei_num")
	public int getPrizeINum() {
		return prizeINum;
	}
	public void setPrizeINum(int prizeINum) {
		this.prizeINum = prizeINum;
	}
	
	@Column(name = "prizeii_num")
	public int getPrizeIINum() {
		return prizeIINum;
	}
	public void setPrizeIINum(int prizeIINum) {
		this.prizeIINum = prizeIINum;
	}
	
	@Column(name = "prizeiii_num")
	public int getPrizeIIINum() {
		return prizeIIINum;
	}
	public void setPrizeIIINum(int prizeIIINum) {
		this.prizeIIINum = prizeIIINum;
	}
	
	@Column(name = "prizeiv_num")
	public int getPrizeIVNum() {
		return prizeIVNum;
	}
	public void setPrizeIVNum(int prizeIVNum) {
		this.prizeIVNum = prizeIVNum;
	}
	
	@Column(name = "prizev_num")
	public int getPrizeVNum() {
		return prizeVNum;
	}
	public void setPrizeVNum(int prizeVNum) {
		this.prizeVNum = prizeVNum;
	}
	
	@Column(name = "prizevi_num")
	public int getPrizeVINum() {
		return prizeVINum;
	}
	public void setPrizeVINum(int prizeVINum) {
		this.prizeVINum = prizeVINum;
	}
	
	@OneToOne
	@JoinColumn(name = "setting_id")
	public LotterySetting getSetting() {
		return setting;
	}
	public void setSetting(LotterySetting setting) {
		this.setting = setting;
	}
	
}

