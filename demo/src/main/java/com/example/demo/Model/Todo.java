package com.example.demo.Model;

public class Todo {

	private int id;
	private String content;

	public Todo(int id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	public Todo() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
