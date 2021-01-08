package com.moon.study.domain;

public class Board {

	@Override
	public String toString() {
		return "Board [board_id=" + board_id + ", board_title=" + board_title + ", board_cont=" + board_cont
				+ ", create_user=" + create_user + ", create_date=" + create_date + "]";
	}
	private String board_id;
	private String board_title;
	private String board_cont;
	private String create_user;
	private String create_date;
	
	public String getBoard_id() {
		return board_id;
	}
	public void setBoard_id(String board_id) {
		this.board_id = board_id;
	}
	public String getBoard_title() {
		return board_title;
	}
	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}
	public String getBoard_cont() {
		return board_cont;
	}
	public void setBoard_cont(String board_cont) {
		this.board_cont = board_cont;
	}
	public String getCreate_user() {
		return create_user;
	}
	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	
}
