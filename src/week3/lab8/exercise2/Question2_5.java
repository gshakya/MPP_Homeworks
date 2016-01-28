package week3.lab8.exercise2;

import java.util.ArrayList;

public class Question2_5 {
	public static void main(String[] args) {
		ArrayList<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Gunjan", "Ivan", 1000.45, "HOD"));
		emps.add(new Employee("Bibek", "Buda", 1000.45, "HOD"));
		emps.add(new Employee("Bibek", "Italian", 1000.45, "HOD"));
		emps.add(new Employee("Bibek", "Budhathoki", 1000.45, "HOD"));
		emps.add(new Employee("Bimal", "Imran", 1000.45, "HOD"));

		emps.stream()
			.filter(e -> e.getLastName().toUpperCase().startsWith("I"))
			.map(Employee::getLastName)
			.forEach(System.out::println);
	}
	
}
