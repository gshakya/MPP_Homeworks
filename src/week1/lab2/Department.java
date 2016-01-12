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

	public void addPerson(Person p){
		this.deptMembers.add(p);
		System.out.println("Person Added in Department");
	}
	public double getTotalSalary() {
		int totalSalary = 0;
		for (Person p : deptMembers) {
			if (p instanceof Faculty) {
				Faculty f = (Faculty) p;
				totalSalary += f.getSalary();
			}
			if (p instanceof Staff) {
				Staff f = (Staff) p;
				totalSalary += f.getSalary();
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
}
