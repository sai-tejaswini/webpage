/*
 * 
 */
package com.example.webPage.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webPage.entity.User;
import com.example.webPage.service.LoginService;

// TODO: Auto-generated Javadoc
/**
 * The Class Controller.
 */
@RestController
public class Controller {
	
	/** The login service. */
	@Autowired
	LoginService loginService;
	
	/**
	 * Hello.
	 *
	 * @return the string
	 */
	@RequestMapping("/")
	public String hello() {
		return "Hello";
	}
	
	/**
	 * Retrieve.
	 *
	 * @return the array list
	 */
	@GetMapping("/retrieve")
	public ArrayList<User> retrieve() {
		return loginService.retrieveAll();
	}
	
	/**
	 * Creates the user.
	 *
	 * @param user the user
	 * @return the user
	 */
	@PostMapping("/post")
	public User createUser(@RequestBody User user) {
		return loginService.create(user);
	}
	
	/**
	 * Update user.
	 *
	 * @param user the user
	 * @return the user
	 */
	@PutMapping("/put")
	public User updateUser(@RequestBody User user) {
		return loginService.update(user);
	}
	
	/**
	 * Delete by id.
	 *
	 * @param id the id
	 */
	@DeleteMapping("/delete")
	public void deleteById(@RequestBody long id) {
		loginService.deleteById(id);
	}
}