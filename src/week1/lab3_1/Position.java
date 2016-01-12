package week1.lab3_1;

import java.util.ArrayList;

public class Position {
	private String title;
	private String description;
	private ArrayList<Employee> assocEmps;
	private Department deptName;
	
	
	
	
	public Position(String title, String description) {
		this.title = title;
		this.description = description;
		this.assocEmps = new ArrayList<Employee>();
	}
	
	public void addEmployees(Employee e){
		e.setPosition(this);
		assocEmps.add(e);
	}

	public void print(){
		print("");
	}

	
	public void print(String string) {
		System.out.println(string+"Postion Title: "+ title);
		System.out.println(string+"Postion Description: "+ description);
		for (Employee e : assocEmps){
			e.print(string+"--");
		}
		
	}
	
	public void setDepartment(Department d){
		this.deptName = d;
	}
}
