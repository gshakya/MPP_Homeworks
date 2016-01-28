package week3.lab8.exercise2;

import java.util.ArrayList;

public class Question2_1 {
	public static void main(String[] args) {
		ArrayList<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Gunjan", "Shakya", 1000.45, "HOD"));
		emps.add(new Employee("Bibek", "Shrestha", 1000.45, "HOD"));
		emps.add(new Employee("Prabhat", "Poudel", 1000.45, "HOD"));
		emps.add(new Employee("Madan", "Siwakoti", 1000.45, "HOD"));
		emps.add(new Employee("Bimal", "Sharma", 1000.45, "HOD"));

		System.out.println(emps.stream().filter(e -> e.getFirstName().startsWith("B")).count());
	}
}
