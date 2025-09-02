package com.example.demo.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.board.service.BoardVO;
import com.example.demo.board.service.ReplyVO;
import com.example.demo.emp.service.EmpVO;

@Mapper
public interface BoardMapper {
	List<BoardVO> selectBoard(BoardVO board);

	BoardVO selectBoardByNo(Long bno);

	Long selectCount();
}
