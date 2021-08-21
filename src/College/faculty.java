package College;
public class faculty extends Exception
{
	String name;
	String branch;
	String clg_name;
	int slots_fi[] = {0,0,0,0,0,0};
	public int availability()
	{
		return 1;
	}
	public int bookslot()
	{
		return 0;
	}
	public faculty(String name,String branch,String clg_name)
	{
		this.name = name;
		this.branch = branch;
		this.clg_name = clg_name;		
	}
	public void display()
	{
		System.out.println("Faculty name: "+name);
		System.out.println("Faculty branch: "+branch);
		System.out.println("Faculty college name: "+clg_name);	
	}			
}