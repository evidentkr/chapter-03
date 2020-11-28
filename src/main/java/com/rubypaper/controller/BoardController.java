package com.rubypaper.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rubypaper.domain.BoardVO;

@RestController
public class BoardController {
	public BoardController() {
		System.out.println("===> BoardController 생성");
	}

	@GetMapping("/hello")
	public String hello(String name) {
		return "Hello : " + name;
	}

	@GetMapping("/getBoard")
	public BoardVO getBoard() {
		BoardVO board = new BoardVO();

		board.setCnt(0);
		board.setContent("content");
		board.setCreateDate(new Date());
		board.setSeq(1);
		board.setTitle("title");
		board.setWriter("writer");

		return board;
	}

	@GetMapping("/getBoardList")
	public List<BoardVO> getBoardList() {
		List<BoardVO> boardList = new ArrayList<BoardVO>();

		for (int i = 1; i <= 10; i++) {

			BoardVO board = new BoardVO();

			board.setCnt(0);
			board.setContent("content");
			board.setCreateDate(new Date());
			board.setSeq(i);
			board.setTitle("title");
			board.setWriter("writer");

			boardList.add(board);
		}
		return boardList;
	}
}
