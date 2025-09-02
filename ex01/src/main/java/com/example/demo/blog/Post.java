package com.example.demo.blog;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Post {
	private long id;
	private long blog_id;
	private long author_id;
	private String section;
	private String subject;
	private String body;
	private String draft;
	private Date createdOn;
	
	private Author autjor;
	
	List<Comment> comments;
	
	List<Tag> tags;
}
