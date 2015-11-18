package com.pinpai.serviceManagerImpl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pinpai.dao.CommentDao;
import com.pinpai.domain.Comment;
import com.pinpai.result.Dtype;
import com.pinpai.result.ResultMode;
import com.pinpai.serviceManager.CommentManager;

@Component
public class CommentManagerImpl extends BaseManagerImpl<Comment> implements CommentManager {
	
	private CommentDao commentDao;
	
	@Autowired
	public void setCommentDao(CommentDao commentDao){
		this.commentDao = commentDao;
		super.baseDao = commentDao;
		this.commentDao = commentDao;
	}
	@Override
	public void addComment(Comment comment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addComments(List<Comment> comments) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Comment load(String sqlkey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> find(String sqlkey) {
		// TODO Auto-generated method stub
		return null;
	}
}
