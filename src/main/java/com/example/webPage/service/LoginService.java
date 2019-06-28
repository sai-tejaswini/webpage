/*
 * 
 */
package com.example.webPage.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webPage.repo.LoginRepo;
import com.example.webPage.entity.User;

// TODO: Auto-generated Javadoc
/**
 * The Class LoginService.
 */
@Service("loginservice")
public class LoginService {

	/** The login repo. */
	@Autowired
	LoginRepo loginRepo;
	
	/** The al. */
	ArrayList<User> al = new ArrayList<>();
	
	/**
	 * Creates the.
	 *
	 * @param user the user
	 * @return the user
	 */
	public User create(User user) {
		al.add(user);
		return loginRepo.save(user);
	}
	
	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the optional
	 */
	public Optional<User> findById(long id) {
		return loginRepo.findById(id);
	}
	
	/**
	 * Retrieve all.
	 *
	 * @return the array list
	 */
	public ArrayList<User> retrieveAll() {
		return loginRepo.all();
	}
	
	/**
	 * Update.
	 *
	 * @param user the user
	 * @return the user
	 */
	public User update(User user) {
		loginRepo.updateName(user.name , user.id);
		loginRepo.updateGender(user.gender , user.id);
		loginRepo.updateAge(user.age , user.id);
		return user;
	}
	
	/**
	 * Delete by id.
	 *
	 * @param id the id
	 */
	public void deleteById(long id) {
		loginRepo.deleteById(id);
	}
	
}
