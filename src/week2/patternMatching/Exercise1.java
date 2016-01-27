package week2.patternMatching;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.printf("Enter a license plate Number: ");
		String io = ip.nextLine();
		ip.close();
		System.out
				.println(io.matches("[a-zA-Z]{2}[0-9]{4}[a-zA-Z]{3}") ? "Valid License Number"
						: "Invalid License Number");

	}
}
