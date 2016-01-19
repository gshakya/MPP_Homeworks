package week1.extraCredit1;

import java.util.ArrayList;
import java.util.Arrays;

public class Book extends AItem {

	

	

	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", authors=" + authors + ", limit=" + limit + ", checkAvailability()="
				+ checkAvailability() + ", getTitle()=" + getTitle() + "]";
	}

	private int ISBN;
	private ArrayList<String> authors;
	private int limit;

	public Book(String title, int ISBN, int limit, String... authors) {
		super(title);
		this.ISBN = ISBN;
		this.limit = limit;
		this.authors = new ArrayList<String>(Arrays.asList(authors));
	}

	public int getISBN() {
		return ISBN;
	}

	public ArrayList<String> getAuthors() {
		return authors;
	}

	public int getLimit() {
		return limit;
	}

}
