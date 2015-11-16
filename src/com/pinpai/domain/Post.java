package com.pinpai.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="posts")
public class Post {
	
	private String id;//论坛帖子id
	private String addr_id;//论坛地址id
	private String url;//帖子地址url
	private String title;//帖子标题
	private String author;//发帖作者
	private Date time;//发帖时间
	private long view;//查看数
	private long response;//回复数
	private String authorurl;//发帖作者url
	private Date craw_time;//帖子爬取时间
	private String final_time;//
	private long is_crawler;
	private long isExtracted;
	
	
	@Id
	@Column(name="id",length=200,nullable = false)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Column(name="addr_id",length=200)
	public String getAddr_id() {
		return addr_id;
	}
	public void setAddr_id(String addr_id) {
		this.addr_id = addr_id;
	}
	@Column(name="url",length=20000)
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Column(name="title",length=1000)
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Column(name="author",length=100)
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Column(name="time",length=7)
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	@Column(name="view",length=22)
	public long getView() {
		return view;
	}
	public void setView(long view) {
		this.view = view;
	}
	@Column(name="response",length=22)
	public long getResponse() {
		return response;
	}
	public void setResponse(long response) {
		this.response = response;
	}
	@Column(name="authorurl",length=200)
	public String getAuthorurl() {
		return authorurl;
	}
	public void setAuthorurl(String authorurl) {
		this.authorurl = authorurl;
	}
	@Column(name="craw_time",length=7)
	public Date getCraw_time() {
		return craw_time;
	}
	public void setCraw_time(Date craw_time) {
		this.craw_time = craw_time;
	}
	@Column(name="final_time",length=80)
	public String getFinal_time() {
		return final_time;
	}
	public void setFinal_time(String final_time) {
		this.final_time = final_time;
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
