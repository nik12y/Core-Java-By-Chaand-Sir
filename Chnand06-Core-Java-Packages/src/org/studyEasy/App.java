package org.studyEasy;

import org.studyEasy.platform.Java;

public class App {

	public static void main(String[] args) {
		Java platform=new Java();
		platform.usedFor(); 
		
		org.studyEasy.blog.Java blog=new org.studyEasy.blog.Java();
		blog.userFor();
	}
}
