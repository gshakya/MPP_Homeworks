package week3.lab8.exercise2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercises {
	public static void Question1(ArrayList<Employee> emps) {
		System.out.println(emps.stream().filter(e -> e.getFirstName().startsWith("B")).count());
	}

	public static void Question2(ArrayList<Employee> emps) {
		emps.stream().filter(e -> e.getLastName().startsWith("B"))
				.sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName))
				.forEach(System.out::println);
	}

	public static void Question3(ArrayList<Employee> emps) {
		emps.stream().filter(e -> e.getFirstName().startsWith("B"))
				.map(e -> new Employee(e.getFirstName().toUpperCase(), e.getLastName().toUpperCase(), e.getSalary(),
						e.getDepartment()))
				.forEach(System.out::println);
	}

	public static void Question4(ArrayList<Employee> emps) {
		emps.stream().map(e -> capitalizeLastNameFor(e, (Employee emp) -> emp.getLastName().startsWith("B")))
				.forEach(System.out::println);
	}

	public static void Question5(ArrayList<Employee> emps) {
		emps.stream().filter(e -> e.getLastName().toUpperCase().startsWith("I")).map(Employee::getLastName)
				.forEach(System.out::println);
	}

	public static Employee capitalizeLastNameFor(Employee emp, Predicate<Employee> condition) {
		if (condition.test(emp)) {
			return new Employee(emp.getFirstName(), emp.getLastName().toUpperCase(), emp.getSalary(),
					emp.getDepartment());
		}
		return new Employee(emp.getFirstName(), emp.getLastName(), emp.getSalary(), emp.getDepartment());
	}

	public static void Question6(ArrayList<Employee> emps) {
		System.out.println(emps.stream().mapToDouble(Employee::getSalary).average().getAsDouble());
	}
	
	public static void Question7(ArrayList<Employee> emps) {
		System.out.println(emps.stream().mapToDouble(Employee::getSalary).reduce(0,(e1,e2)->e1+e2));
	}
	
	public static void Question8(ArrayList<Employee> emps) {
		emps.stream().map(Employee::getFirstName).forEach(System.out::println);
	}
	
	
	public static List<Integer> Question9() {
		IntStream evenNum ;
		evenNum= IntStream.iterate(0, n-> n+2).limit(20);
		return  evenNum.boxed().collect(Collectors.toList());
	}
	
	public static int countWorks(List<String> words, char c , char d , int len) {
		return
		(int) (words.stream()
			 .filter(w->w.toLowerCase().contains(""+c))
			 .filter(w->!w.toLowerCase().contains(""+d))
			 .filter(w->w.length()==len)
			 .count());
	}
	
	public static void main(String[] args) {
//		ArrayList<Employee> emps = new ArrayList<>();
//		emps.add(new Employee("Gunjan", "Shakya", 1000.45, "HOD"));
//		emps.add(new Employee("Bibek", "Shrestha", 1000.45, "HOD"));
//		emps.add(new Employee("Prabhat", "Poudel", 1000.45, "HOD"));
//		emps.add(new Employee("Madan", "Siwakoti", 1000.45, "HOD"));
//		emps.add(new Employee("Bimal", "Sharma", 1000.45, "HOD"));
//		emps.add(new Employee("Dharma", "Budhathoki", 1000.45, "HOD"));
//		emps.add(new Employee("Keshav", "Bastola", 1000.45, "HOD"));
//		emps.add(new Employee("James", "Ivan", 1000.45, "HOD"));
//		emps.add(new Employee("Charles", "Issac", 1000.45, "HOD"));
//		emps.add(new Employee("Kevin", "Ivory", 1000.45, "HOD"));
		
		System.out.println(Question9());
	}
}
