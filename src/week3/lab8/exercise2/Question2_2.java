package week3.lab8.exercise2;

import java.util.ArrayList;
import java.util.Comparator;

public class Question2_2 {
	
	public static void main(String[] args) {
		ArrayList<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Gunjan", "Shakya", 1000.45, "HOD"));
		emps.add(new Employee("Bibek", "Buda", 1000.45, "HOD"));
		emps.add(new Employee("Bibek", "Poudel", 1000.45, "HOD"));
		emps.add(new Employee("Bibek", "Budhathoki", 1000.45, "HOD"));
		emps.add(new Employee("Bimal", "Bastola", 1000.45, "HOD"));

		emps.stream()
			.filter(e -> e.getLastName().startsWith("B"))
			.sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName))
			.forEach(System.out::println);
	}
}
