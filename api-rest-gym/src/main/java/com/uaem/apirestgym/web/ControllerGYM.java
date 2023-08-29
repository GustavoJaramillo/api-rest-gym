package com.uaem.apirestgym.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uaem.apirestgym.domain.User;
import com.uaem.apirestgym.service.IUserService;

@RestController
public class ControllerGYM {
	
	private IUserService userService;
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		userService.save(user);
		return "User add";
	}
	
	@GetMapping("/listUsers")
	public List<User> listUsers(){
		return userService.listUser();
	}
	
	
	
	
	
	
}
