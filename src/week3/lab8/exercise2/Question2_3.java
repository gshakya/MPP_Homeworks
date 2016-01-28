package week3.lab8.exercise2;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Question2_3 {
	public static void main(String[] args) {
			
		ArrayList<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Gunjan", "Shakya", 1000.45, "HOD"));
		emps.add(new Employee("Bibek", "Shrestha", 1000.45, "HOD"));
		emps.add(new Employee("Prabhat", "Poudel", 1000.45, "HOD"));
		emps.add(new Employee("Madan", "Siwakoti", 1000.45, "HOD"));
		emps.add(new Employee("Bimal", "Sharma", 1000.45, "HOD"));

		System.out.println("Original List Before Modification");
		emps.stream().forEach(System.out::println);
		
		System.out.println("---Modification---");
//		emps.stream()
//			.filter(e -> e.getFirstName().startsWith("B"))
//			.forEach(e -> {e.setLastName(e.getLastName().toUpperCase());
//							System.out.println(e);});

//		ArrayList< Employee> emp1 =
		emps.stream()
			.filter(e -> e.getFirstName().startsWith("B"))
			.map(e -> new Employee(e.getFirstName().toUpperCase(), e.getLastName().toUpperCase(), e.getSalary(), e.getDepartment()))
			.forEach(System.out::println);

//		emp1.stream().forEach(System.out::println);
		
		System.out.println("------------Original List After Modification");
		emps.stream().forEach(System.out::println);
		
	}
}
