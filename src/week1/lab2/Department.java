package week1.lab2;

import java.util.ArrayList;

public class Department {

	private String name;
	private ArrayList<Person> deptMembers;

	Department(String deptName) {
		this.name = deptName;
		this.deptMembers = new ArrayList<>();
	}

	// public void addPerson(Person p){
	// deptMembers.add(p);
	// }
	//
	// public String getName() {
	// return name;
	// }
	//
	// public void setName(String name) {
	// this.name = name;
	// }
	//
	// public ArrayList<Person> getDeptMembers() {
	// return deptMembers;
	// }
	//
	// public void setDeptMembers(ArrayList<Person> deptMembers) {
	// this.deptMembers = deptMembers;
	// }

	public void addPerson(Person p) {
		this.deptMembers.add(p);
		System.out.println("Person Added in Department");
	}

	public double getTotalSalary() {
		int totalSalary = 0;
		for (Person p : deptMembers) {
			if (p instanceof Earns) {
				Earns e = (Earns) p;
				totalSalary += e.getSalary();
			}
		}
		return totalSalary;
	}

	public void showAllMembers() {
		for (Person p : deptMembers) {
			System.out.println(p);
		}
	}

	public void unitsPerFaculty() {
		for (Person p : deptMembers) {
			if (p instanceof Faculty) {
				Faculty f = (Faculty) p;
				System.out.println(f.getName() + ": " + f.gotTotalUnits());
			}
		}
	}

	public Faculty getFaculty(String name) {
		for (Person p : deptMembers) {
			if (p instanceof Faculty & p.getName().equals(name)) {
				return (Faculty) p;
			}
		}
		return null;
	}
	
	public ArrayList<Student> getAllStudents(){
		ArrayList<Student> students  = new ArrayList<>();
		for (Person d :deptMembers ){
			if (d instanceof Student){
				students.add((Student)d);
			}
		}
		return students;
	}
	
	public void displayStudentsOfFaculty(String name){
		Faculty f = getFaculty(name);
		ArrayList<Student> students  = getAllStudents();
		ArrayList<Student> facultyStudents = (ArrayList<Student>) students.clone();
		
		
		if (f!=null){
			System.out.println("Students of Faculty Member "+name+" are:");
			for  (Course c: f.getCoursesOffered()){
				for(Student s : students){
					if(!s.hasFaculty(f)){
						facultyStudents.remove(s);
					}
				}
			}
			for (Student fs : facultyStudents){
				System.out.println(fs.getName());
			}
		}
	}
}
