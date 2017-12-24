/**
 * Creation Date:2017年12月18日-下午9:33:11
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.xiaoyong.lottery.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Description Of The Class<br/>
 * QQ:603470086
 * 
 * @author 	郁晓勇
 * @version 1.0.0, 2017年12月18日-下午9:33:11
 * @since 2017年12月18日-下午9:33:11
 */
@Entity
@Table(name = "lottery_result")
public class LotteryResult extends BaseEntity {

	private static final long serialVersionUID = -4220060917538207472L;

	public static final int RANK_NONE = -1;
	public static final int RANK_I = 1;
	public static final int RANK_II = 2;
	public static final int RANK_III = 3;
	public static final int RANK_IV = 4;
	public static final int RANK_V = 5;
	public static final int RANK_VI = 6;
	
	private LotteryUser user;
	private int rank;
	private LotterySetting setting;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	public LotteryUser getUser() {
		return user;
	}
	public void setUser(LotteryUser user) {
		this.user = user;
	}
	
	@Column(name = "rank")
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	@ManyToOne
	@JoinColumn(name = "setting_id")
	public LotterySetting getSetting() {
		return setting;
	}
	public void setSetting(LotterySetting setting) {
		this.setting = setting;
	}

}

