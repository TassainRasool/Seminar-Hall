package College;
public class hall extends Exception
{
	private static hall obj = null;
	private hall(){} 
	public static hall getobject()
	{
		if(obj==null)
		{
			obj=new hall();
			return obj;
		}
		else 
		{
			return obj;
		}
	}

	final int capacity = 132;
	String branch ="CSE";
	String location = "Ramanujan Block";
	int cost= 0;
	hall slot_ho[] ={null,null,null,null,null,null};
	int slot_hi[] = {0,0,0,0,0,0};
	public int availability()
	{
		if (obj==null)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	int bookslot()
	{
		return 0;
	}
	public void display()
	{
		System.out.println("Hall capacity: "+capacity);
		System.out.println("Hall belongs to: "+branch);
		System.out.println("Hall location: "+location);
		System.out.println("Hall cost: "+cost);
	}  
}
