/*
 * 
 */
package com.example.webPage.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.webPage.entity.User;

// TODO: Auto-generated Javadoc
/**
 * The Interface LoginRepo.
 */
public interface LoginRepo extends JpaRepository<User, Long> {

	/* (non-Javadoc)
	 * @see org.springframework.data.repository.CrudRepository#save(S)
	 */
	@SuppressWarnings("unchecked")
	User save(User user);

	/**
	 * All.
	 *
	 * @return the array list
	 */
	@Query("select user from User user")
	ArrayList<User> all();
	
	/**
	 * Update name.
	 *
	 * @param name the name
	 * @param id the id
	 */
	@Transactional
	@Modifying
	@Query("update User user set user.name =:name where user.id =:id")
	void updateName(@Param("name") String name,@Param("id") long id);

	/**
	 * Update gender.
	 *
	 * @param gender the gender
	 * @param id the id
	 */
	@Transactional
	@Modifying
	@Query("update User user set user.gender =:gender where user.id =:id")
	void updateGender(@Param("gender") String gender,@Param("id") long id);
	
	/**
	 * Update age.
	 *
	 * @param age the age
	 * @param id the id
	 */
	@Transactional
	@Modifying
	@Query("update User user set user.age =:age where user.id =:id")
	void updateAge(@Param("age") int age,@Param("id") long id);
}
