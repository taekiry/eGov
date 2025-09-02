package com.example.demo.board.service;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReplyVO {
	private String rno;
	private String bno;
	private String reply;
	private String replyer;
	private Date replyDate;
	private Date updateDate;
}
