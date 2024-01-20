package com.example.demo.Model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Todo {

	//@NotEmpty(message = "Id should not be null or empty....!")
	@Size(min = 5,max = 17)
	private int id;
	
	@NotEmpty(message = "content should not be null or empty....")
	@Size(min = 2,max = 5)
	private String content;

	

	
}
