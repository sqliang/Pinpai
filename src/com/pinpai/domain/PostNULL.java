package com.pinpai.domain;

import java.sql.Date;

public class PostNULL extends Post {
	
	private static final long serialVersionUID = 1L;

	@Override
	public void setAddr_id(String addr_id) {
		throw new IllegalArgumentException("试图向NULLVO设置数据，NULLVO不允许此操作！");
	}
	
	@Override
	public void setAuthor(String author) {
		throw new IllegalArgumentException("试图向NULLVO设置数据，NULLVO不允许此操作！");
	}
	
	@Override
	public void setAuthorurl(String authorurl) {
		throw new IllegalArgumentException("试图向NULLVO设置数据，NULLVO不允许此操作！");
	}
	
	@Override
	public void setCraw_time(Date craw_time) {
		throw new IllegalArgumentException("试图向NULLVO设置数据，NULLVO不允许此操作！");
	}
	
	@Override
	public void setFinal_time(String final_time) {
		throw new IllegalArgumentException("试图向NULLVO设置数据，NULLVO不允许此操作！");
	}
	
	@Override
	public void setId(String id) {
		throw new IllegalArgumentException("试图向NULLVO设置数据，NULLVO不允许此操作！");
	}
	
	@Override
	public void setIs_crawler(long is_crawler) {
		throw new IllegalArgumentException("试图向NULLVO设置数据，NULLVO不允许此操作！");
	}
	
	@Override
	public void setIsExtracted(long isExtracted) {
		throw new IllegalArgumentException("试图向NULLVO设置数据，NULLVO不允许此操作！");
	}
	
	@Override
	public void setResponse(long response) {
		throw new IllegalArgumentException("试图向NULLVO设置数据，NULLVO不允许此操作！");
	}
	
	@Override
	public void setTime(Date time) {
		throw new IllegalArgumentException("试图向NULLVO设置数据，NULLVO不允许此操作！");
	}
	
	@Override
	public void setTitle(String title) {
		throw new IllegalArgumentException("试图向NULLVO设置数据，NULLVO不允许此操作！");
	}
	
	@Override
	public void setUrl(String url) {
		throw new IllegalArgumentException("试图向NULLVO设置数据，NULLVO不允许此操作！");
	}
	
	@Override
	public void setView(long view) {
		throw new IllegalArgumentException("试图向NULLVO设置数据，NULLVO不允许此操作！");
	}
}
