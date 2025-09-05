package com.example.demo.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.board.mapper.BoardMapper;
import com.example.demo.board.service.BoardService;
import com.example.demo.board.service.BoardVO;
import com.example.demo.common.aop.PrintExecutionTime;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired BoardMapper boardMapper;
	
	
	@Override
	
	public List<BoardVO> selectBoard(BoardVO board) {
		return boardMapper.selectBoard(board);
		
	}
	
	@PrintExecutionTime
	@Override
	public BoardVO selectBoardByNo(Long bno) {
		
		return boardMapper.selectBoardByNo(bno);
	}

	@Override
	public Long selectCount() {
		return boardMapper.selectCount();
	}

	@Override
	public int insertBoard(BoardVO board) {
		return boardMapper.insertBoard(board);
	}

	@Override
	@Transactional // 트랜잭션 관리(커밋,롤백) 알아서해줌
	public int deleteBoard(Long bno) {
		
		//게시글 삭제시 댓글, 첨부파일 정보도 삭제해야함
		// 댓글 삭제
		
		// 첨부파일 삭제
		
		// 게시글 삭제
		
		return 0;
	}

}
