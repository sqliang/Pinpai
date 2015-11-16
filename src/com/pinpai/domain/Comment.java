package com.pinpai.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comment")
public class Comment {
	
	private String comm_id;//评论id
	private String comm_urlid;//评论所属帖子的id
	private String comm_authorid;//评论作者id
	private String comm_author;//评论作者名字
	private String comm_authorurl;//评论作者url
	private String comm_time;//评论时间
	private String comm_content;//评论内容
	private Date craw_time;//爬取时间
	private long is_crawler;
	private long isExtracted;
	
	@Id
	@Column(name="comm_id",length=60,nullable = false)
	public String getComm_id() {
		return comm_id;
	}
	public void setComm_id(String comm_id) {
		this.comm_id = comm_id;
	}
	@Column(name="comm_urlid",length=100)
	public String getComm_urlid() {
		return comm_urlid;
	}
	public void setComm_urlid(String comm_urlid) {
		this.comm_urlid = comm_urlid;
	}
	@Column(name="comm_authorid",length=80)
	public String getComm_authorid() {
		return comm_authorid;
	}
	public void setComm_authorid(String comm_authorid) {
		this.comm_authorid = comm_authorid;
	}
	@Column(name="comm_author",length=100)
	public String getComm_author() {
		return comm_author;
	}
	public void setComm_author(String comm_author) {
		this.comm_author = comm_author;
	}
	@Column(name="comm_authorurl",length=200)
	public String getComm_authorurl() {
		return comm_authorurl;
	}
	public void setComm_authorurl(String comm_authorurl) {
		this.comm_authorurl = comm_authorurl;
	}
	@Column(name="comm_time",length=40)
	public String getComm_time() {
		return comm_time;
	}
	public void setComm_time(String comm_time) {
		this.comm_time = comm_time;
	}
	@Column(name="comm_content",length=40000)
	public String getComm_content() {
		return comm_content;
	}
	public void setComm_content(String comm_content) {
		this.comm_content = comm_content;
	}
	@Column(name="craw_time",length=7)
	public Date getCraw_time() {
		return craw_time;
	}
	public void setCraw_time(Date craw_time) {
		this.craw_time = craw_time;
	}
	@Column(name="is_crawler",length=22)
	public long getIs_crawler() {
		return is_crawler;
	}
	public void setIs_crawler(long is_crawler) {
		this.is_crawler = is_crawler;
	}
	@Column(name="isExtracted",length=22)
	public long getIsExtracted() {
		return isExtracted;
	}
	public void setIsExtracted(long isExtracted) {
		this.isExtracted = isExtracted;
	}
}
