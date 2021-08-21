package Activity;
public class GuestLecture extends event
{		
	public GuestLecture(String name,String location,String resource_person,String person_designation)
	{
		super(name,location,resource_person,person_designation);
	}
	public void session()
	{
		System.out.println("Guest talk");
	}
	public Report getReport()
	{
		return new Report()
				{
			public String[] TakeNotes()
			{
				String[]s= {"Notes of Guest Lecture"};
				return s;
			}
			public String[] SubmitBill()
			{
				String[]bill= {"Your Bill is this:"};
				return bill;

			}
			public String[] Photos()
			{
				String[]pics= {"GuestLecture.jpg is the photo"};
				return pics;
			}
		};
	}
}