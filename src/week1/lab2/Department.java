package week1.lab2;

import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Department {
	
	private String name ;
	private ArrayList<Person> deptMembers;
	
	Department(String deptName){
		this.name=deptName;
		this.deptMembers = new ArrayList<>();
	}
	
//	public void addPerson(Person p){
//		deptMembers.add(p);
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public ArrayList<Person> getDeptMembers() {
//		return deptMembers;
//	}
//
//	public void setDeptMembers(ArrayList<Person> deptMembers) {
//		this.deptMembers = deptMembers;
//	}
	
	
	public double getTotalSalary(){
		for(Person p : deptMembers){
			if (p instanceof Faculty ){
				
			}
		}
	}
}
