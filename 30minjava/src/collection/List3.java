package collection;

class Student 
{
	private String name ;
	private int []marks;
	
	public Student(String string, int[] marks) 
	{
		this.name =name;
		this.marks=marks;
		
		System.out.println(name);
	}

	
	public void disp()
	{
		System.out.println(this.marks);
	}
}

public class List3 
{
	public static void main(String[] args) 
	{
		int[] marks={10,20,30,40};
		Student s=new Student("ak",marks);
	}
}
