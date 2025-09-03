package com.example.demo.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.board.mapper.BoardMapper;
import com.example.demo.board.service.BoardService;
import com.example.demo.board.service.BoardVO;

import lombok.RequiredArgsConstructor;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired BoardMapper boardMapper;
	
	
	@Override
	public List<BoardVO> selectBoard(BoardVO board) {
		return boardMapper.selectBoard(board);
		
	}

	@Override
	public BoardVO selectBoardByNo(Long bno) {
		
		return boardMapper.selectBoardByNo(bno);
	}

	@Override
	public Long selectCount() {
		return boardMapper.selectCount();
	}

}
