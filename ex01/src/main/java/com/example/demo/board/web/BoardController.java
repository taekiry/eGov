package com.example.demo.board.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.board.mapper.BoardMapper;

@Controller
public class BoardController {

	@Autowired
	BoardMapper boardMapper;

	@GetMapping("boardList")
	public String boardList(Model model) {

		model.addAttribute("boardList", boardMapper.selectBoard());
		return ("boardList");
	}

	@GetMapping("board")
	public String board(Model model, @RequestParam("bno") Long bno) {
		model.addAttribute("board", boardMapper.selectBoardByNo(bno));
		return "board";
	}

}
