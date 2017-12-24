/**
 * Creation Date:2017年11月20日-上午11:06:13
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.xiaoyong.lottery.model;



/**
 * Description Of The Class<br/>
 * QQ:603470086
 * 
 * @author 	郁晓勇
 * @version 1.0.0, 2017年11月20日-上午11:06:13
 * @since 2017年11月20日-上午11:06:13
 */
public class SuccessResult<T> extends GenericResult {

	private static final long serialVersionUID = 9203728906262443547L;
	
	public SuccessResult() {}
	
	public SuccessResult(T content) {
		super();
		this.put("content", content);
	}
	
}

