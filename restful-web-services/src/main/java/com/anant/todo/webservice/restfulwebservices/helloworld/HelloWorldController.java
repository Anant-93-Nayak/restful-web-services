package com.anant.todo.webservice.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
//localhost:4200
@RestController
@CrossOrigin(origins="http://localhost:4200")
public class HelloWorldController {
 
	@GetMapping(path="/hello-world")
	public String printContent() {
		return"Hello-World";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello-World-Bean");
	}
	
	@GetMapping(path="/hello-world-bean/{name}")
	public HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name) {
		//throw new RuntimeException("Something went wrong");
		return new HelloWorldBean(String.format("Hello-World, %s", name));
	}
}
