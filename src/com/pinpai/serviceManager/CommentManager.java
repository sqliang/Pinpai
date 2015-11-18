package com.pinpai.serviceManager;

import java.util.List;

import com.pinpai.domain.Comment;

public interface CommentManager extends BaseManager<Comment> {
	
	public void addComment(Comment comment);
	
	public void addComments(List<Comment> comments);
	
	public Comment load(String sqlkey);
	
	public List<Comment> find(String sqlkey);
}
