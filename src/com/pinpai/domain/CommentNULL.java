package com.pinpai.domain;

import java.sql.Date;

public class CommentNULL extends Comment {
	
	private static final long serialVersionUID = 1L;

	@Override
	public void setComm_id(String comm_id) {
		throw new IllegalArgumentException("试图向NULLVO设置数据，NULLVO不允许此操作！");
	}
	
	@Override
	public void setComm_author(String comm_author) {
		throw new IllegalArgumentException("试图向NULLVO设置数据，NULLVO不允许此操作！");
	}
	
	@Override
	public void setComm_authorid(String comm_authorid) {
		throw new IllegalArgumentException("试图向NULLVO设置数据，NULLVO不允许此操作！");
	}
	
	@Override
	public void setComm_authorurl(String comm_authorurl) {
		throw new IllegalArgumentException("试图向NULLVO设置数据，NULLVO不允许此操作！");
	}
	
	@Override
	public void setComm_content(String comm_content) {
		throw new IllegalArgumentException("试图向NULLVO设置数据，NULLVO不允许此操作！");
	}
	
	@Override
	public void setComm_time(String comm_time) {
		throw new IllegalArgumentException("试图向NULLVO设置数据，NULLVO不允许此操作！");
	}
	
	@Override
	public void setComm_urlid(String comm_urlid) {
		throw new IllegalArgumentException("试图向NULLVO设置数据，NULLVO不允许此操作！");
	}
	
	@Override
	public void setCraw_time(Date craw_time) {
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
	public void setPost_comm_urlid(Post post_comm_urlid) {
		throw new IllegalArgumentException("试图向NULLVO设置数据，NULLVO不允许此操作！");
	}
}
