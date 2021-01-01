/*
 * Copyright (c) 2005-2020 Example Corporation. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Example Corporation ("Confidential Information"). You shall
 * not disclose such Confidential Information and shall use it
 * only in accordance with the terms of the license agreement you
 * entered into with Example Corporation.
 */

package com.example.project.app;

/**
 * Hello world.
 *
 * @author Rahul Amaram
 */
public class HelloWorld {
	/**
	 * Main Method.
	 *
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld();
		System.out.println(helloWorld.getWelcomeMessage());
	}

	public String getWelcomeMessage() {
		return "Hello World!";
	}
}
