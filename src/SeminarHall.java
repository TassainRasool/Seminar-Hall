import Activity.*;
import College.*;
public class SeminarHall
{
	public static void main(String args[])
	{
		TechnicalTalk First = new TechnicalTalk("CCA","Ramanujan","NAVEEN SIVADASAN ","IIT lecturer");
		
		
		hall FirstHall = hall.getobject();
		try
		{
			int a=FirstHall.availability();
			if(a==0)
			{
				throw new Exception ("e");
			}
		}
		catch(Exception e)
		{
			System.out.println("Hall not available");
		}
		
		faculty FirstFaculty=new faculty("xyz","CSE","Vasavi College of Engineering");
		try 
		{
			int b=FirstFaculty.availability();
			if(b==0)
			throw new Exception("e");
		}
		catch(Exception e)
		{
			System.out.println("Resource person cancelled. Event postponed to next week");
		}
		First.display();
		FirstHall.display();
		FirstFaculty.display();
	}
}