package com.example.springh2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springh2.entity.User;
import com.example.springh2.service.UserService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/home/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return userService.createUser(user);
    }
	
	@PostMapping("/addUsers")
	public List<User> addUsers(@RequestBody List<User> users) {
		return userService.createUsers(users);
    }	
	
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userService.getUsers();
	}
	
	@PutMapping("/updateuser")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	@DeleteMapping("/user/{id}")
	public String deleteUser(@PathVariable int id) {
		return userService.deleteUserById(id);
	}
}