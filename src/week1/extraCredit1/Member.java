package week1.extraCredit1;

import java.util.ArrayList;

public class Member {
	private int id;
	private String name;
	private String address;
	private String phone;
	private ArrayList<Loan> loanedItems;
	private ArrayList<Reservation> reservedItems;

	public Member(int id, String name, String address, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		loanedItems = new ArrayList<>();
		reservedItems = new ArrayList<>();
	}

	public void borrow(ItemCopy ic) {
		Loan l = Loan.newInstance(this, ic);
		if (l != null) {
			loanedItems.add(l);
			ic.setAvailable(false);
			return;
		}
		System.out.println("Item Can't be borrowed");
	}

	public void reserve(AItem itm) {
		Reservation r = Reservation.newInstance(this, itm);
		if (r != null) {
			reservedItems.add(r);
		}
	}
	public void returnCopy(ItemCopy ic){
		for(Loan l : loanedItems){
			if (l.getItm().equals(ic)){
				loanedItems.remove(l);
				ic.setAvailable(true);
				return;
			}
		}
		System.out.println("Invalid return");
	}
	
	public void showLoanedItems(){
		for (Loan l : loanedItems){
			System.out.println(l);
		}
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}

	
}
