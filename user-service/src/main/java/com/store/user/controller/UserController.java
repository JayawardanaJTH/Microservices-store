package com.store.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.user.entity.User;
import com.store.user.services.UserServices;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserServices userService;
	
	//save user to the temporary database
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	//get user by user id
	@GetMapping("/{id}")
	public User getUserById(@PathVariable("id") Long userID) {
		return userService.getUserById(userID);
	}
	
	//get all users details as a list
	@GetMapping("/")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	//delete user by id
	@DeleteMapping("/{id}")
	public boolean deleteUserById(@PathVariable("id") Long userID) {
		return userService.deleteUserById(userID);
	}
	
	@PutMapping("/")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}

}
