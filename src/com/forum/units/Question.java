package com.forum.units;

public class Question extends AbstractEntity {

	//brief description of question
	private String title;
	//detail question
	private String message;
	//user who asked the question
	private User user;
	//number of upvotes for the question.
	private int upvoteCount = 0;
	//id of the last question asked on discussion forum
	private static Long lastEntry = 0L;
	private String titile;

	public void autoGenerateId() {
		lastEntry = lastEntry + 1L;

		// please write your code below and follow this instruction:
		// 1. Call the parent class' setId method and pass in lastEntry as the method variable;
		this.setId(lastEntry);  // it setting variable help of setId and passes in lastEntry
	}

	/**
	 * This method returns the title of the question
	 *
	 * @return the title of the question
	 */
	public String getTitle() {
		// please write your code here
		// you should return the instance variable title of this question
		return title; // it return the title becuse method has return type String in it
	}


	/**
	 * This method sets the title of the question
	 *
	 * @param title: the title that we want to give to this question
	 */
	public void setTitle(String title) {
		// please write your code here
		// Set the instance variable title to the parameter variable title
		this.title = titile; // it instancate the variable using the (this) keyword help to diffentiate the variable
	}

	/**
	 * This method returns the details of this question
	 *
	 * @return details of the question
	 */
	public String getMessage() {
		// please write your code here
		// You should return the instance variable message of this question
		return message; // this return the message variable this method has return type String
	}

	/**
	 * This method sets the message of the question
	 *
	 * @param message: the message that we want to set the details of this question to
	 */
	public void setMessage(String message) {
		// please write your code here
		// you should set the instance variable message to the parameter variable message
		this.message = message;  //instanceting the variable with the help of (this) keyword
	}

	/**
	 * This method returns the user who wrote this question
	 *
	 * @return user who wrote this question
	 */
	public User getUser() {
		// please write your code here
		// You should return the instance variable user of this question
		return user; // returning the variable of method type of return User.
	}

	/**
	 * This method sets the user who wrote this question
	 *
	 * @param user: the user who wrote this question
	 */
	public void setUser(User user) {
		// please write your code here
		// You should set the instance variable user to the parameter variable user
		this.user = user;  // instancing the variable user
	}

	/**
	 * This method returns the number of upvotes this question has received
	 *
	 * @return the number of upvotes this question has received
	 */
	public int getUpvoteCount() {
		// please write your code here
		// You should return the instance variable upvoteCount
		return upvoteCount; // return the upvoteCount in method getUpvoteCount with return type integer
	}

	/**
	 * This question increases the number of upvotes by one
	 */
	public void increaseUpvoteCount() {
		// write your code here
		// Increase the number stored in the instance variable upvoteCount by 1
		this.upvoteCount = (upvoteCount + 1); // increasing the vote by one
	}

}
