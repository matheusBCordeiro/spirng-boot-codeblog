package com.spring.blog.serviceInterface;

import com.spring.blog.model.Post;

import java.util.List;

public interface InterfaceBlogService {
	List<Post> findAll();
	Post findById(long id);
	Post save(Post post);
}

