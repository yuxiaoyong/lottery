/**
 * Creation Date:2017年12月17日-下午8:22:25
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.xiaoyong.lottery.domain;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;

/**
 * Description Of The Class<br/>
 * QQ:603470086
 * 
 * @author 	郁晓勇
 * @version 1.0.0, 2017年12月17日-下午8:22:25
 * @since 2017年12月17日-下午8:22:25
 */
@Entity
@Table(name = "lottery_user")
public class LotteryUser extends BaseEntity {
	
	private static final long serialVersionUID = 6442346429310344329L;
	
	private String name;//中文名
	private String ename;//英文名
	private String username;//用户名
	private String password;//密码
	
	@Column(name = "name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "ename")
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	@Column(name = "username")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Column(name = "password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

