package week3.lab8.exercise2;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Question2_4 {
	public static void main(String[] args) {

		ArrayList<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Gunjan", "Shakya", 1000.45, "HOD"));
		emps.add(new Employee("Bibek", "Buda", 1000.45, "HOD"));
		emps.add(new Employee("Prabhat", "Poudel", 1000.45, "HOD"));
		emps.add(new Employee("Madan", "Siwakoti", 1000.45, "HOD"));
		emps.add(new Employee("Bimal", "Bastola", 1000.45, "HOD"));

		// System.out.println("Original List Before Modification");
		// emps.stream().forEach(System.out::println);

		System.out.println("---Modification---");

		emps.stream()
			.map(e -> capitalizeLastNameFor(e, (Employee emp) -> emp.getLastName().startsWith("B")))
			.forEach(System.out::println);

	}

	public static Employee capitalizeLastNameFor(Employee emp, Predicate<Employee> condition) {
		if (condition.test(emp)) {
			return new Employee(emp.getFirstName(), emp.getLastName().toUpperCase(), emp.getSalary(),
					emp.getDepartment());
		}
		return new Employee(emp.getFirstName(), emp.getLastName(), emp.getSalary(), emp.getDepartment());
	}
}
