package week1.extraCredit1;

public class ItemCopy {
	private String copyID;
	private boolean available;
	private AItem anItem;

	public ItemCopy(String copyID, AItem anItem) {
		this.copyID = copyID;
		this.anItem = anItem;
		anItem.addItem(this); // Adding ItemCopy in the respective Item
		available = true ;
	}

	public void setAvailable(boolean available) {
		this.available = available;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anItem == null) ? 0 : anItem.hashCode());
		result = prime * result + (available ? 1231 : 1237);
		result = prime * result + ((copyID == null) ? 0 : copyID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemCopy other = (ItemCopy) obj;
		if (anItem == null) {
			if (other.anItem != null)
				return false;
		} else if (!anItem.equals(other.anItem))
			return false;
		if (available != other.available)
			return false;
		if (copyID == null) {
			if (other.copyID != null)
				return false;
		} else if (!copyID.equals(other.copyID))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ItemCopy [copyID=" + copyID + ", available=" + available + ", anItem=" + anItem + "]";
	}

	
	

}
