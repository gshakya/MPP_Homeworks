package week2.patternMatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SelfPractice {
	
	public static boolean isValidEmail(String email){
		Pattern emailRegex = Pattern.compile("[A-Za-z][A-Za-z0-9\\._]{0,}@[A_Za-z0-9\\._]+\\.[A_Za-z0-9\\._]{2,}");
		Matcher matcher = emailRegex.matcher(email);
		return matcher.matches();
	}

	public static void main(String[] args) {
		System.out.println(isValidEmail("Gr.skya@gmail.com"));
		System.out.println(isValidEmail("gr_skya@gmail.com"));
		System.out.println(isValidEmail("g9_skya@gmail.com"));
		System.out.println(isValidEmail("9_skya@gmail.com"));
		System.out.println(isValidEmail("_skya@gmail.com"));
		System.out.println(isValidEmail("gskyagmail.com"));
		System.out.println(isValidEmail("gskya@7mail.com"));
		System.out.println(isValidEmail("gskya@7mailcom"));
		System.out.println(isValidEmail("gskya@7mail.m"));

	}

}
