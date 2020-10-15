package threads;
class Task1 extends Thread
{
	public void run() //to remember 
	{
		System.out.println("task1 started");
		for(int i=1;i<=10;i++) 
		{
			System.out.print(i+" ");
		}
		System.out.println("task1 ended");
	}
}
public class Threads1 
{
	public static void main(String[] args) 
	{
		Task1 t1=new Task1();
		t1.start();
		
		System.out.println("task2 started");
		for(int i=11;i<=20;i++) 
		{
			System.out.print(i+" ");
		}

		System.out.println("task3 started");
		for(int i=21;i<=30;i++) 
		{
			System.out.print(i+" ");
		}
	}
}
