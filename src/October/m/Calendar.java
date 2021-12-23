package October.m;

import java.sql.Date;
import java.util.List;

class User{
	Long userId;
	String emailId;
}
class Meeting
{
	User organizer;
	List<User> participants;
	Date fromdateTime;
	Date toDateTime;
}
public class Calendar {
	
	List<Meeting> meetings;

}
