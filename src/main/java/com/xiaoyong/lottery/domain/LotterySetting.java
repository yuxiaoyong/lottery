/**
 * Creation Date:2017年12月24日-下午3:33:31
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.xiaoyong.lottery.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Description Of The Class<br/>
 * QQ:603470086
 * 
 * @author 	郁晓勇
 * @version 1.0.0, 2017年12月24日-下午3:33:31
 * @since 2017年12月24日-下午3:33:31
 */
@Entity
@Table(name = "lottery_setting")
public class LotterySetting extends BaseEntity {

	private static final long serialVersionUID = -8126736424845236146L;
	
	private String name;
	private int total;
	private int prizeINum;
	private int prizeIINum;
	private int prizeIIINum;
	private int prizeIVNum;
	private int prizeVNum;
	private int prizeVINum;
	
	private boolean started;
	private boolean finished;
	
	@Column(name = "name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
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
	
	@Column(name = "is_started")
	public boolean isStarted() {
		return started;
	}
	public void setStarted(boolean started) {
		this.started = started;
	}
	
	@Column(name = "is_finished")
	public boolean isFinished() {
		return finished;
	}
	public void setFinished(boolean finished) {
		this.finished = finished;
	}
}

