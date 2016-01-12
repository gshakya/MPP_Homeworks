package week1.lab3_2;

import java.util.ArrayList;

public class Company{
	private  String name;
	private ArrayList<Department> assocDept;
	
	public Company(String name){
		this.name=name;
		assocDept = new ArrayList<Department>();
	}
	
	public void addDepartment(Department d){
		d.setCompany(this);
		assocDept.add(d);
	}
	
	public void print(){
		System.out.println("Company: "+name);
		for(Department d : assocDept){
			d.print("--");
		}
	}
	
	public double getSalary(){
		double totalSalary = 0 ;
		for (Department d : assocDept){
			totalSalary = totalSalary + d.getSalary();
		}
		
		return totalSalary;
	}
}
