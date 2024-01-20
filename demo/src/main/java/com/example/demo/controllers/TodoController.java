package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Todo;
import com.example.demo.Service.TodoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/todo")
public class TodoController {

	@Autowired
	TodoService todoService;

	@PostMapping("/create")
	public Todo createTodo(@Valid @RequestBody Todo todo) {

		return todoService.create(todo);
		// "Successfully created";
	}

	@GetMapping("/getAll")
	public List<Todo> getAll() {
		
		return todoService.getList();

	}

}
