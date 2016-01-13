package week1.lab3.exercise3;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

public class Position {
	private String title;
	private String description;
	private ArrayList<Employee> assocEmps;
	private Department deptName;
	private Position superior;
	private ArrayList<Position> inferiors;

	public Position(String title, String description) {
		this.title = title;
		this.description = description;
		this.assocEmps = new ArrayList<Employee>();
		this.inferiors = new ArrayList<Position>();
	}

	public void addEmployees(Employee e) {
		e.setPosition(this);
		assocEmps.add(e);
	}

	public void print() {
		print("");
	}

	public void print(String string) {
		System.out.println(string + "Postion Title: " + title);
		System.out.println(string + "Postion Description: " + description);
		for (Employee e : assocEmps) {
			e.print(string + "--");
		}

	}

	public void setDepartment(Department d) {
		this.deptName = d;
	}

	public double getSalary() {
		double totalSalary = 0;
		for (Employee e : assocEmps) {
			totalSalary += e.getSalary();
		}
		return totalSalary;
	}

	public Position getSuperior() {
		return superior;
	}

	public void setSuperior(Position superior) {
		this.superior = superior;
		superior.addInferior(this);
	}
	
	public void addInferior(Position inferior){
		inferiors.add(inferior);
		inferior.setSuperior(this);
	}
	
	public void printDownLine(){
		printDownLine("");
	}
	
	public void printDownLine(String indent){
		if(inferiors.size()>0){
			for(Position p : inferiors){
				System.out.println(p.print(indent));
			}
		}
		
	}
}
