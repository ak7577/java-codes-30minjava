package collection;

import java.util.*;

public class Demo1 {

	public static void main(String[] args) 
	{
		List <String> words= List.of("apple","bannana","bat");
		
	/*		words.add("app");    // error>>
	  	
	  	java.lang.UnsupportedOperationException due to immutable
	    List.of - is an immutable string
		
	*/
		System.out.println(words);
		
	/*
	 	ArrayList words=new ArrayList(List.of("apple","bannana","bat"));
			words.add("boot");
			words.add("app");
			words.add("app2");
			System.out.println(words);
	 */
	}

}
