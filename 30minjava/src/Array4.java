import java.util.Arrays;

//some methods of array 
public class Array4 
{
	public static void main(String[] args) 
	{
		int [] Array0=new int [5];
				//To fill
		Arrays.fill(Array0, 100);//To fill					
		for(int i=0;i<=Array0.length-1;i++)
		{
			System.out.println(Array0[i]);
		}
		
		int [] Array1= {20,10,40,30};
		int [] Array2= {20,10,40,30};
		
		//To compare
		Arrays.equals(Array1,Array2);//To compare
		System.out.println(Arrays.equals(Array1,Array2));
		
		//To sort
		Arrays.sort(Array1);//To sort
		for(int i=0;i<=Array1.length-1;i++)
		{
			System.out.println(Array1[i]);
		}
		
	}
}