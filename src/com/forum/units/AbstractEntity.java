package com.forum.units;

import java.util.Date;

import com.forum.util.Utility;

public abstract class AbstractEntity {

	private Date created;
	private long id;

	/**
	 *
	 * Write a method called getId that requires no parameters and
	 * returns the id of this Abstract entity
	 *
	 * @return the id of this Abstract entity
	 */
	// Please write code for the s method here
	public long getId(){
		return id;
	}  // it take the id from the user with the help of (get)

	/**
	 *
	 * Write a method called setId that takes in a parameter and
	 * sets the id of this Abstract entity to the parameter.
	 *
	 * This method should return void.
	 *
	 * @param id: the id of this Abstract entity
	 */
	// Please write code for the setId method here
	public void setId(long id){
		this.id = id;
	} // it set the new id taken from user help of (set)
	/**
	 *
	 * Write an abstract method called autoGenerateId.
	 *
	 * This method doesn't require any parameters and returns void
	 *
	 */
	// Please write code for the autoGenerateId abstract method here
	abstract void autoGenerateId(); // it is abstract method captures common characteristics of subclasses

	public Date getCreated() {
		return created;
	}

	public void setCreated() {
		this.created = Utility.getCurrentDate();
	}
}
