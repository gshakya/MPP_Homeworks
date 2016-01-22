package week2.patternMatching;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.printf("Enter a license plate Number: ");
		String io = ip.nextLine();
		ip.close();
		
		Pattern p = Pattern.compile("[a-zA-Z]{2}[0-9]{4}[a-zA-Z]{3}");
		Matcher m = p.matcher(io);

		System.out.println(m.matches() ? "Valid License Number"
				: "Invalid License Number");
		
	}
}
