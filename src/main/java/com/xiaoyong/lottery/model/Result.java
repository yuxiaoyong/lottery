/**
 * Creation Date:2017年11月20日-上午10:03:41
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.xiaoyong.lottery.model;

/**
 * Description Of The Class<br/>
 * QQ:603470086
 * 
 * @author 	郁晓勇
 * @version 1.0.0, 2017年11月20日-上午10:03:41
 * @since 2017年11月20日-上午10:03:41
 */
public interface Result<T> {
	
	public static final int ERRCODE_SUCCESS = 0;
	public static final int ERRCODE_FAILURE = 400;
	public static final String ERRMSG_SUCCESS = "ok";
	
	public static final String ERRCODE_KEY = "errcode";
	public static final String ERRMSG_KEY = "errmsg";
	public static final String SUCCESS_KEY = "success";
	public static final String INFO_KEY = "info";
	
	int getErrcode();
	String getErrmsg();
	boolean isSuccess();
	String getInfo();
}

