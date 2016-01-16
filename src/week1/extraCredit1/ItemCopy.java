package week1.extraCredit1;

public class ItemCopy {
	private String copyID;
	private boolean available;
	private AItem anItem;

	public ItemCopy(String copyID, AItem anItem) {
		this.copyID = copyID;
		this.anItem = anItem;
		anItem.addItem(this); // Adding ItemCopy in the respective Item
		available = anItem.checkAvailability();
	}

	public String getCopyID() {
		return copyID;
	}

	public boolean isAvailable() {
		return available;
	}

	public AItem getAnItem() {
		return anItem;
	}
	
	

}
