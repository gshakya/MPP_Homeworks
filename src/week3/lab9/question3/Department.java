package week3.lab9.question3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
		return
		deptMembers.stream()
				   .filter(p-> (p instanceof Earns))
				   .map(e->((Earns)e).getSalary())
				   .reduce(0.0,(s1,s2)-> s1+s2);
	}

	public String getAllMembersName() {
		return deptMembers.stream()
						  .map(m->m.toString())
						  .reduce("",(m1,m2)->m1+"\n"+m2);
		
	}

	public String unitsPerFaculty() {
		return deptMembers.stream()				 
				   .filter(p->(p instanceof Faculty))
				   .map(p->((Faculty)p).getName()+": "+((Faculty)p).gotTotalUnits())
				   .reduce("",(m1,m2)->m1+"\n"+m2);
		
		
	}

	public Faculty getFaculty(String name) {		
		
		List<Faculty> faculty=	deptMembers.stream()
					    .filter(p ->p instanceof Faculty)
					    .filter(p->p.getName().equals(name))
					    .map(p->(Faculty)p)
					    .collect(Collectors.toList());
		
		return faculty.size()>0?faculty.get(0):null;
		
	}
	
	public ArrayList<Student> getAllStudents(){
		ArrayList<Student> students = new ArrayList<>();
		
		deptMembers.stream()
				   .filter(p->p instanceof Student)
				   .forEach(p->students.add((Student)p));
		
		return students;
	}
	
	public String getStudentsNameOfFaculty(String name){
		Faculty f = getFaculty(name);
		ArrayList<Student> students  = getAllStudents();
		
		return
		students.stream()
				.filter(s->s.hasFaculty(f))
				.map(Student::getName)
				.reduce("",(m1,m2)->m1+"\n"+m2);
	}
}
