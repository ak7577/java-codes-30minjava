 class Students
{
	String name;
	int marks[];
	
	 Students(String name,int [] marks)
	 	{
		 this.name=name;
		 this.marks=marks;
	 	}
	 
	 public int numbeOfMarks()
	 	{
		 int n =marks.length;
		 return n;
	 	}
	 
	 public int totalNumberOfMarks()
	 	{
		 int n=marks[0]+marks[1]+marks[2]+marks[3];
		 return n;
	 	}
	 
	public int maxMarks() 
		{
		int max = Integer.MIN_VALUE;
		for (int i=0;i<=marks.length-1;i++)
		{
			if (marks[i]>max)
			{
				max=marks[i];
			}
		}
		return max;
	}

	public int minMarks() 
	{
		int min = Integer.MAX_VALUE;
		for (int i=0;i<=marks.length-1;i++)
		{
			if(marks[i]<min)
			{
				min=marks[i];
			}
		}
		return min;
	}

	public float avgMarks() 
	{
		float a=totalNumberOfMarks()/numbeOfMarks();
		
		return a;
	}
}
 
public class Array3 
{
	public static void main(String[] args) 
	{
		 int marks[]= {60,90,30,43};
		Students s=new Students("Anil", marks);
		System.out.println("totalNumberOfMarks"+"="+s.totalNumberOfMarks());
		System.out.println("numbeOfMarks"+"="+s.numbeOfMarks());
		System.out.println("maxMarks"+"="+s.maxMarks());
		System.out.println("minMarks"+"="+s.minMarks());
		System.out.println("avgMarks"+"="+s.avgMarks());
	}
}