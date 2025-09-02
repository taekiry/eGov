package com.example.demo.blog;

import lombok.Data;

@Data
public class Comment {
	private long id;
	private String post_id;
	private String name;
	private String comment;
}
