package com.pinpai.serviceManagerImpl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pinpai.dao.PostDao;
import com.pinpai.domain.Post;
import com.pinpai.result.Dtype;
import com.pinpai.result.ResultMode;
import com.pinpai.serviceManager.PostManager;

@Component
public class PostManagerImpl extends BaseManagerImpl<Post> implements PostManager {
	
	private PostDao postDao;
	@Autowired
	public void setPostDao(PostDao postDao){
		this.postDao = postDao;
		super.baseDao = postDao;
		this.postDao = postDao;
	}

	@Override
	public void addPost(Post post) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPosts(List<Post> posts) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Post load(String sqlkey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> find(String sqlkey) {
		// TODO Auto-generated method stub
		return null;
	}
}
