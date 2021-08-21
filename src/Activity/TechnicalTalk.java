package Activity;
public class TechnicalTalk extends GuestLecture
{
	public TechnicalTalk(String name,String location,String resource_person,String person_designation)
	{
		super(name,location,resource_person,person_designation);
	}
	public void session()
	{
		System.out.println("Technical talk");
	}
	public Report getReport()
	{
		return new Report()
		{
			public String[] TakeNotes()
			{
				String[]s= {"Notes of Techtalk"};
				return s;
			}
			public String[] SubmitBill()
			{
				String[]bill= {"Your Bill is this:"};
				return bill;

			}
			public String[] Photos()
			{
				String[]pics= {"Techtalk.jpg is the photo"};
				return pics;
			}
		};
	}
}