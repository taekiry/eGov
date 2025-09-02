package com.example.demo.blog;

import java.util.List;

import lombok.Data;

@Data
public class Blog {
	private long id;
	private String title;
	private long authorId;
	private Author author;
	private List<Post> posts;
}
