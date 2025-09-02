package com.example.demo.blog;

import lombok.Data;

@Data
public class Author {
	private long id;
	private String username;
	private String password;
	private String email;
	private long bio;
	private String favouriteSection;
}
