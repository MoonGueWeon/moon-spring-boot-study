package com.moon.study.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.moon.study.domain.Board;

public interface BoardMapper {
	
	@Select("select board_title from TB_BOARD where board_id=#{boardId}")
	public String getBoardTitle(@Param("boardId") String boardId) throws Exception;
	
	public Board getBoardInfo(@Param("boardId") String boardId) throws Exception;

	@Select("select * from TB_BOARD limit 100")
	public List<Board> getBoards();
}
