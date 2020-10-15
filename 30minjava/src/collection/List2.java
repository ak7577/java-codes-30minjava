package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List2 
{
	public static void main(String[] args)
	{
		List <String> word=List.of("apple","bat","cat");
		List <String> word1=new ArrayList<String>(word);
		
		
		Iterator<String> iterator=word1.iterator();
		
		while (iterator.hasNext())
		{
			if(iterator.next().endsWith("at"))
			{
				iterator.remove();
			}	
		}
		System.out.println(word1);
}
}
