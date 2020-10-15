package collection;

import java.util.List;
public class List1 
{
	public static void main(String[] args) 
	{
		List <String> word=List.of("apple","bat","cat");
		System.out.println(word);
		word.add("samp");
		System.out.println(word);
		
		/*
		System.out.println(word.contains("cat"));
		System.out.println(word.contains("dog"));
		System.out.println(word.indexOf("apple"));
		 */
		}

}
