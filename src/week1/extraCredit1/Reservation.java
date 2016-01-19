package week1.extraCredit1;

import java.util.Date;

public class Reservation {
	private Date reservationDate;
	private Member reservedByMember;
	private AItem item;

	private Reservation(Member mem, AItem item) {
		this.reservedByMember = mem;
		this.item = item;
	}

	public static Reservation newInstance(Member mem, AItem item) {
		if (!item.checkAvailability()) {
			return new Reservation(mem, item);
		}
		System.out.println("Item Available Please loan the item");
		return null;
	}

	public Date getReservationDate() {
		return reservationDate;
	}

	public Member getReservedByMember() {
		return reservedByMember;
	}

	public AItem getItem() {
		return item;
	}

}
