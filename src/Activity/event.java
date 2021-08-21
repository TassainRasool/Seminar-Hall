package Activity;
abstract public class event implements Report
{
	String name;
	String location;
	String resource_person;
	String eventname;
	String person_designation;
	public void bill()
	{

	}
	event(String name,String location,String resource_person,String person_designation)
	{
		this.name = name;
		this.location = location;
		this.resource_person = resource_person;
		this.person_designation = person_designation;
	}	
	public String[] TakeNotes()
	{
		String[] s={"Notes taken"};
		return s;
	}
	public String[] SubmitBill()
	{
		String[] bill={"Bill amount is this:"};
		return bill;
	}
	public String [] Photos()
	{
		String [] pics={"Pic1.jpeg"};
		return pics;
	}
	public void display()
	{
		System.out.println("Event name: "+name);
		System.out.println("Event location: " +location);
		System.out.println("Resource person of Event: " +resource_person);
		System.out.println("Resource person's designation: " +person_designation);
	}
	public abstract void session();

}


