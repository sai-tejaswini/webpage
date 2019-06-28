/*
 * 
 */
package com.example.webPage.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.GetMapping;

// TODO: Auto-generated Javadoc
/**
 * The Class User.
 */
@Entity
public class User {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;
	
	/** The name. */
	public String name ;
	
	/** The gender. */
	public String gender ;
	
	/** The age. */
	public int age ;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	@GetMapping()

	public long getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(long id) {
		this.id = id;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the gender.
	 *
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	
	/**
	 * Sets the gender.
	 *
	 * @param gender the new gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	/**
	 * Gets the age.
	 *
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * Sets the age.
	 *
	 * @param age the new age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * Instantiates a new user.
	 *
	 * @param id the id
	 * @param name the name
	 * @param gender the gender
	 * @param age the age
	 */
	public User(long id,String name, String gender ,int age) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	/**
	 * Instantiates a new user.
	 */
	public User() {
		super();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return this.id + " " + this.name + " " + this.gender + " " + this.age;
	}
}
