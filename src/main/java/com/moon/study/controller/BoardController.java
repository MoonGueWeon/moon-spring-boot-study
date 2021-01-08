package com.moon.study.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.moon.study.dao.BoardMapper;
import com.moon.study.domain.Board;


@RestController
public class BoardController {

	@Autowired
	private BoardMapper mapper;
	
	@RequestMapping("/boardTitle")
	public @ResponseBody String boardTitle() throws Exception {
		
		String title = mapper.getBoardTitle("1");

		System.out.println("==== Moon Step ================title====" + title);
		
		return title;
	}

	@RequestMapping("/board")
	public @ResponseBody Board boardInfo() throws Exception {
		
		Board board = mapper.getBoardInfo("1");

		System.out.println("==== Moon Step ================board====" + board.getBoard_title());
		System.out.println("==== Moon Step ================board====" + board.getBoard_cont());
		System.out.println("==== Moon Step ================board====" + board.getCreate_user());
		System.out.println("==== Moon Step ================board====" + board.getCreate_date());
		
		return board;
	}

	@RequestMapping("/board/{boardId}")
	public @ResponseBody Board boardIdInfo(@PathVariable String boardId) throws Exception {
		
		Board board = mapper.getBoardInfo(boardId);

		System.out.println("==== Moon Step ================board====" + board.toString());
		
		return board;
	}
	
	
}
