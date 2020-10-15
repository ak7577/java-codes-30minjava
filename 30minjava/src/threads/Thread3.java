package threads;

class TaskA extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.print(i+ " ");
		}
		System.out.println("\ntask1 done");
	}
}


public class Thread3 
{
	
	public static void main(String[] args) 
	{
		TaskA t1= new TaskA();
		t1.start();
		
		for(int i=100;i<=200;i++)
		{
			System.out.print(i+ " ");
		}
		
	

	}

}
