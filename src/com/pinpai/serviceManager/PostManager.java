package com.pinpai.serviceManager;

import java.util.List;

import com.pinpai.domain.Post;

public interface PostManager extends BaseManager<Post> {
	
	public void addPost(Post post);
	
	public void addPosts(List<Post> posts);
	
	public Post load(String sqlkey);
	
	public List<Post> find(String sqlkey);

}
