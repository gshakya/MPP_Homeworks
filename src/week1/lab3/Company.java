package week1.lab3;

import java.util.ArrayList;

public class Company{
	private  String name;
	private ArrayList<Department> assocDept;
	
	public Company(String name){
		this.name=name;
		assocDept = new ArrayList<Department>();
	}
	
	public void addDepartment(Department d){
		assocDept.add(d);
	}
	
	public void print(){
		System.out.println("> Company: "+name);
		for(Department d : assocDept){
			d.print("--");
		}
	}
}
