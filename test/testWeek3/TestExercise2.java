package testWeek3;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import week3.lab8.exercise2.Employee;
import week3.lab8.exercise2.Exercises;

public class TestExercise2 extends TestCase {
	private ArrayList<Employee> emps = new ArrayList<>();
	PrintStream originalOut = System.out;
	OutputStream os = new ByteArrayOutputStream();
	PrintStream ps = new PrintStream(os);

	public static void main(String[] args) {
	}

	public void setUp() throws Exception {
		super.setUp();

		emps.add(new Employee("Gunjan", "Shakya", 1000.45, "HOD"));
		emps.add(new Employee("Bibek", "Shrestha", 1000.45, "HOD"));
		emps.add(new Employee("Prabhat", "Poudel", 1000.45, "HOD"));
		emps.add(new Employee("Madan", "Siwakoti", 1000.45, "HOD"));
		emps.add(new Employee("Bimal", "Sharma", 1000.45, "HOD"));
		emps.add(new Employee("Dharma", "Budhathoki", 1000.45, "HOD"));
		emps.add(new Employee("Keshav", "Bastola", 1000.45, "HOD"));
		emps.add(new Employee("James", "Ivan", 1000.45, "HOD"));
		emps.add(new Employee("Charles", "Issac", 1000.45, "HOD"));
		emps.add(new Employee("Kevin", "Ivory", 1000.45, "HOD"));

		System.setOut(ps);

	}

	public void tearDown() throws Exception {
		super.tearDown();
		System.setOut(null);
	}

	@Test
	public void testQuestion1() {
		Exercises.Question1(emps);
		assertTrue(sysOutStringEquals("2", os.toString()));

	}

	@Test
	public void testQuestion2() {
		Exercises.Question2(emps);
		String result = String.format("Dharma   Budhathoki  1000.45   HOD\n"
				+ "Keshav   Bastola   1000.45   HOD");
		assertTrue(sysOutStringEquals(result, os.toString()));
	}

	@Test
	public void testQuestion3() {
		Exercises.Question3(emps);
		String result = "BIBEK    SHRESTHA  1000.45   HOD\n"
					  + "BIMAL    SHARMA    1000.45   HOD";
		assertTrue(sysOutStringEquals(result, os.toString()));
	}
	
	public void testQuestion4() {
		Exercises.Question4(emps);
		String result = "Gunjan   Shakya    1000.45   HOD\n"
				+ "Bibek    Shrestha  1000.45   HOD\n"
				+ "Prabhat  Poudel    1000.45   HOD\n"
				+ "Madan    Siwakoti  1000.45   HOD\n"
				+ "Bimal    Sharma    1000.45   HOD\n"
				+ "Dharma   BUDHATHOKI  1000.45   HOD\n"
				+ "Keshav   BASTOLA   1000.45   HOD\n"
				+ "James    Ivan      1000.45   HOD\n"
				+ "Charles  Issac     1000.45   HOD\n"
				+ "Kevin    Ivory     1000.45   HOD\n";
		assertTrue(sysOutStringEquals(result, os.toString()));
	}

	public void testQuestion5() {
		Exercises.Question5(emps);
		String result = "Ivan\n"
				+ "Issac\n"
				+ "Ivory";
		assertTrue(sysOutStringEquals(result, os.toString()));
	}

	
	private Boolean sysOutStringEquals(String s1, String s2) {
		return s1.replaceAll("\\s+", " ").trim().equals(s2.replaceAll("\\s+", " ").trim());
	}

}
