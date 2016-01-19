package week2.lab5_1;

import java.util.Calendar;

public class DateRange {
	Calendar startDate;
	Calendar endDate;

	public DateRange(Calendar startDate, Calendar endDate) {
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public boolean isInRange(Calendar date){
		if(date.after(startDate) & date.before(endDate)){
			return true;
		}
		return false;
	}
}
