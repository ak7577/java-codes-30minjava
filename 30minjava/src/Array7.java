import java.util.ArrayList;

class StringArray
{
	String [] days= {"monday","tuesday","wedensday","thursday","friday","saturday","sunday"};
	
	public void numberOfDays() 
	{
		System.out.println(days.length);
		
	}
	public void reverse1()
	{
	
		for(int i=days.length-1;i<=0;i--)
		{
			System.out.println(days[i]);
		}
		
	}
	
	public void highNumDay()
	{
		int i=0;
		if(days[i].length()>days[i+1].length())
			{
			System.out.println(days[i].length());
			}
		}
	public void dayWithMostChar()
	{
		String dwmc = " ";
		for (String newDay:days)
		{
		if(newDay.length()>dwmc.length())
			dwmc=newDay;
		}
		System.out.println("dayWithMostChar is"+" "+dwmc);
		}
}
 
 
public class Array7 
{
	public static void main(String[] args) 
	{
		StringArray sa=new StringArray();
		sa.numberOfDays();
		sa.reverse1();
		sa.dayWithMostChar();
	}
}
