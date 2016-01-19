package week1.extraCredit1;

public class Main {
	public static void main(String[] args) {
		Member gunjan = new Member(1, "Gunjan Shakya", "Fairfield", "1234567890");
		Member prabhat = new Member(2, "Prabhat Poudel", "Fairfield", "1234567890");
		Member madan = new Member(3, "Madan Siwakoti", "Fairfield", "1234567890");
		
		AItem coreJava = new Book("Coke Java", 4578, 7, "Horstmann", "Cornell");
		AItem wired = new Magazine("Wired Magazine", 45, 5);
		
		ItemCopy coreJavaCopy1 = new ItemCopy("1", coreJava);
		ItemCopy coreJavaCopy2 = new ItemCopy("2", coreJava);
		
		ItemCopy wiredCopy1 = new ItemCopy("1", wired);
		ItemCopy wiredCopy2 = new ItemCopy("2", wired);
		
		gunjan.borrow(coreJavaCopy2);
//		madan.borrow(coreJavaCopy1);
		
		System.out.println(coreJava.checkAvailability());
		
		gunjan.showLoanedItems();
		
		
	}
}
