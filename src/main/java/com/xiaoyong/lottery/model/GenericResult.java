/**
 * Creation Date:2017年12月13日-上午9:48:16
 * 
 * Copyright 2010-2017 © 中格软件 Inc. All Rights Reserved
 */
package com.xiaoyong.lottery.model;

import java.util.HashMap;

/**
 * Description Of The Class<br/>
 * QQ:603470086
 * 
 * @author 	郁晓勇
 * @version 1.0.0, 2017年12月13日-上午9:48:16
 * @since 2017年12月13日-上午9:48:16
 */
public class GenericResult extends HashMap<String, Object> implements Result<Object>{

	private static final long serialVersionUID = -990708291455597721L;

	public GenericResult() {
		this.put(ERRCODE_KEY, ERRCODE_SUCCESS);
		this.put(ERRMSG_KEY, ERRMSG_SUCCESS);
		this.put(SUCCESS_KEY, true);
		this.put(INFO_KEY, ERRMSG_SUCCESS);
	}
	
	public GenericResult(int errcode, String errmsg) {
		this.put(ERRCODE_KEY, errcode);
		this.put(ERRMSG_KEY, errmsg);
		this.put(SUCCESS_KEY, errcode == ERRCODE_SUCCESS);
		this.put(INFO_KEY, errmsg);
	}
	
	public GenericResult setAttr(String key, Object value){
		this.put(key, value);
		return this;
	}
	
	@Override
	public int getErrcode() {
		return (Integer)this.get(ERRCODE_KEY);
	}

	@Override
	public String getErrmsg() {
		return (String)this.get(ERRMSG_KEY);
	}

	public void setErrcode(int errcode) {
		this.put(ERRCODE_KEY, errcode);
	}

	public void setErrmsg(String errmsg) {
		this.put(ERRMSG_KEY, errmsg);
	}
	@Override
	public String getInfo() {
		return null;
	}
	@Override
	public boolean isSuccess() {
		return false;
	}
}

