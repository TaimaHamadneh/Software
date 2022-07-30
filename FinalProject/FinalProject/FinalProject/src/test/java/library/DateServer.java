package library;

import java.util.Calendar;

public class DateServer {

	public Calendar GetDate()
	{
		 Calendar now = Calendar.getInstance();
		 now.get(Calendar.DATE);
		 return now;
	}
	
}
