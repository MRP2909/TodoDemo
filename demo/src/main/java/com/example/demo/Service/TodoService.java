package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Todo;

@Service
public class TodoService {

	private List<Todo> list = new ArrayList<>();

	public Todo create(Todo todo) {
		list.add(todo);
		return todo;
	}
	
	public List<Todo> getList(){
		 
		return list ;
	}

}
