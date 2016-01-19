package week1.extraCredit1;

import java.util.Calendar;
import java.util.Date;

public class Loan {

	private Member loaneeMem;
	private ItemCopy itm;
	private Date checkOutDate;
	private Date returnDate;

	public Member getLoaneeMem() {
		return loaneeMem;
	}

	public ItemCopy getItm() {
		return itm;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	private Loan(Member loaneeMem, ItemCopy itm) {

		this.loaneeMem = loaneeMem;
		this.itm = itm;
		checkOutDate = new Date();
		/*
		 * To add certain date to return date needs to be converted Calendar
		 * object
		 */

		Calendar cal = Calendar.getInstance();
		cal.setTime(checkOutDate);
		cal.add(Calendar.DATE, itm.getAnItem().getLimit());
		returnDate = cal.getTime();

	}

	public static Loan newInstance(Member loaneeMem, ItemCopy itm) {
		if (itm.isAvailable()) {
			return new Loan(loaneeMem, itm);
		}
		System.out.println("Copy Not Avaliable");
		return null;
	}

	@Override
	public String toString() {
		return "Loan [loaneeMem=" + loaneeMem + ", itm=" + itm + ", checkOutDate=" + checkOutDate + ", returnDate="
				+ returnDate + "]";
	}
	
	
}
