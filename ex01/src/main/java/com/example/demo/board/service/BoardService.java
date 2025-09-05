package com.example.demo.board.service;

import java.util.List;


public interface BoardService {
	
	List<BoardVO> selectBoard(BoardVO board);

	BoardVO selectBoardByNo(Long bno);

	Long selectCount();
	
	int insertBoard(BoardVO board);
	
	int deleteBoard(Long bno);
}
