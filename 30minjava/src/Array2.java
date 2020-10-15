import java.util.Arrays;

public class Array2 
{
	public static void main(String[] args) 
	{
		int marks[]= {50,60,70,80};
		
		for (int i=0;i<=marks.length-1;i++)
		{
		System.out.println(marks[i]);	//to print array values
		}
		System.out.println(Arrays.toString(marks));//to print array by ref
	}
}