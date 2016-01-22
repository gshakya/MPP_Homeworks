package week2.patternMatching;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.printf("Enter a value:  ");
		String io = ip.nextLine();
		ip.close();
		System.out.println(io.replaceAll("8", "eight"));
	}
}
