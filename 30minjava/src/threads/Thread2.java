package threads;
class Task extends Thread
{
	public void run() //to remember 
	{
		System.out.println("task1 started");
		for(int i=1;i<=20;i++) 
		{
			System.out.print(i+" ");
		}
		System.out.println("task1 ended");
	}
}
class Task2 implements Runnable
{
	public void run()
	{
		System.out.println("task2 started");
		for(int i=21;i<=30;i++) 
		{
			System.out.print(i+" ");
		}
		System.out.println("task2 started");
	}
}

class Task3 implements Runnable
{
	public void run()
	{
		System.out.println("task3 started");
		for(int i=31;i<=40;i++) 
		{
			System.out.print(i+" ");
		}
		System.out.println("task3 started");
	}
}
public class Thread2 
{
	public static void main(String[] args) 
	{
		Task t1=new Task();
		t1.start();
		
		Task2 t2=new Task2();
		
		Thread threadt2=new Thread(t2);
		threadt2.start();
		
		Task3 t3=new Task3();
		Thread thraedt3=new Thread(t3);
		thraedt3.start();
	}
}
