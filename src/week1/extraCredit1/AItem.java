package week1.extraCredit1;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class AItem  {
	private String title;
	private ArrayList<ItemCopy> items;
	
	public abstract int getLimit();

	public AItem(String title) {
		this.title = title;
	}

	public boolean checkAvailability() {
		for(ItemCopy ic : items){
			if(ic.isAvailable())
				return true;
		}
		return false;
	}

	public void addItem(ItemCopy ic){
		items.add(ic);
		
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
