package com.example.demo.board.mapper;

import java.util.List;

import com.example.demo.board.service.ReplyVO;

public interface ReplyMapper {
	//단건조회
	ReplyVO read(Long bno);
	
	//댓글 등록
	int insert(ReplyVO reply);
	
	// 삭제
	int delete(Long rno);
	
	// 수정
	int update(ReplyVO reply);
		
	//댓글 조회
	List<ReplyVO>getList(ReplyVO reply);
	
	//갯수
	int getCountByBno(Long bno);
}
