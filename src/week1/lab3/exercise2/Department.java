package week1.lab3.exercise2;

import java.util.ArrayList;

public class Department {
	private String name;
	private String location;
	private Company companyName;
	private ArrayList<Position> assocPostions;
	
	
	
	public Department(String name, String location) {
		this.name = name;
		this.location = location;
		assocPostions = new ArrayList<Position>();
	}
	
	public void addPostion(Position p){
		p.setDepartment(this);
		assocPostions.add(p);
	}
	
	public void print(){
		print("");
	}

	public void print(String string) {
		System.out.println(string+"Department Name: "+ name);
		System.out.println(string+"Location: "+ location);
		for (Position p : assocPostions){
			p.print(string+"--");
		}
	}
	
	public void setCompany(Company c){
		companyName = c;
	}

	public double getSalary() {
		// TODO Auto-generated method stub
		double totalSalary = 0 ;
		for (Position p : assocPostions){
			totalSalary = totalSalary + p.getSalary();
		}
		
		return totalSalary;
	}

}
