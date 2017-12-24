/**
 * Creation Date:2017年11月20日-上午11:08:18
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.xiaoyong.lottery.model;

/**
 * Description Of The Class<br/>
 * QQ:603470086
 * 
 * @author 	郁晓勇
 * @version 1.0.0, 2017年11月20日-上午11:08:18
 * @since 2017年11月20日-上午11:08:18
 */
public class FailureResult extends GenericResult {
	
	private static final long serialVersionUID = 7089648641214432166L;
	
	public FailureResult(int errcode, String errmsg) {
		super(errcode, errmsg);
	}
	
}

