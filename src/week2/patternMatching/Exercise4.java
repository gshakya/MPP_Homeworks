package week2.patternMatching;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise4 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.printf("Enter a value:  ");
		String io = ip.nextLine();
		ip.close();
		Pattern p =  Pattern.compile("\\b8\\b");
		Matcher m = p.matcher(io);
		
		System.out.println(m.replaceAll("eight"));
	}
}