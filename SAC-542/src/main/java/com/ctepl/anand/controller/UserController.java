package com.ctepl.anand.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ctepl.anand.entity.User;
import com.ctepl.anand.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/user/findByUsernameAndPassword")
	public User findByUsernameAndPassword(@RequestParam String username, @RequestParam String password) {
		return userService.findByUsernameAndPassword(username, password);
	}
	
	@GetMapping("/user/findByUsername")
	public User findByUsername(@RequestParam String username) {
		return userService.findByUsername(username);
	}
	
	@GetMapping("/user/findByEmail")
	public User findByEmail(@RequestParam String email) {
		return userService.findByEmail(email);
	}
	
	@GetMapping("/user/findByPasswordResetToken")
	public User findByPasswordResetToken(@RequestParam String token) {
		return userService.findByPasswordResetToken(token);
	}
	
	@PostMapping("/user/save")
	public User save(User user) {
		return userService.save(user);
	}
	
}