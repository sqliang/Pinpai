package com.pinpai.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.pinpai.serviceManager.CommentManager;
import com.pinpai.serviceManager.JManager;
import com.pinpai.serviceManager.PostManager;
import com.pinpai.util.bean.BeanUtil;
import com.pinpai.util.json.JsonUtil;


@Entity
@Table(name="posts")
public class Post implements Serializable {
	private static final long serialVersionUID = 1L;
	
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
	
	//对应从表comments
	private List<Comment> commentids;
	public static final Comment NULL = new CommentNULL();
	
	public List<Comment> loadCommentids(String sqlkey,String... propertys){
		CommentManager commentManager = (CommentManager)BeanUtil.load("commentManagerImpl");
		if(commentids==null){
			if (id == "" || id == null) {
				commentids = new ArrayList();
			} else {
				if(propertys!=null&&propertys.length!=0){
					StringBuffer hql = new StringBuffer("select  ");
					for(int i = 0;i<propertys.length;i++){
						hql.append("a."+propertys[i]);
						if(i!=propertys.length-1){
							hql.append(",");
						}
					}
					hql.append(" from Commtent a where id = ?");
					JManager jManager = (JManager)BeanUtil.load("jManagerImpl");
					commentids = (List<Comment>) JsonUtil.toList(jManager.getJsonArray(hql.toString(), id),Comment.class);
				}else{

					commentids = commentManager.findbyHql(" and id="+id + sqlkey);
				}
			}
		}
		return commentids;
	}
	
	@Transient
	public List<Comment> getCommentids() {
		return commentids;
	}
	public void setCommentids(List<Comment> commentids) {
		this.commentids = commentids;
	}
	public  void reloadForegnKey(){
		if(commentids!=null){
			for(Comment comment : commentids){
				comment.setComm_urlid(id);
			}
		}

	}
	public static Post load(Serializable id){
		PostManager postManager = (PostManager) BeanUtil.load("postManagerImpl");
		Post post = postManager.get(id);
		return post;
	}
	
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
