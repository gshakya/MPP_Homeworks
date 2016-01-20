package week2.lab5_1;

import java.util.Calendar;

public class DateRange {
	Calendar startDate;
	Calendar endDate;

	public DateRange(Calendar startDate, Calendar endDate) {
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public boolean isInRange(Calendar date) {
		Calendar startOffset = startDate;
		startOffset.add(Calendar.DAY_OF_MONTH, -1);
		Calendar endOffset = endDate;
		endOffset.add(Calendar.DAY_OF_MONTH, 1);

		if (date.after(startOffset) & date.before(endOffset)) {
			return true;
		}
		return false;
	}
}
