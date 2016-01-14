package week1.lab3.exercise3;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

public class Position {
	private String title;
	private String description;
	private Employee assocEmps;
	private Department deptName;
	private Position superior;
	private ArrayList<Position> inferiors;

	public Position(String title, String description) {
		this.title = title;
		this.description = description;
		this.inferiors = new ArrayList<Position>();
	}

	public void setEmployee(Employee e) {
		assocEmps = e;
	}

	public void print() {
		print("");
	}

	public void print(String string) {
		System.out.println(string + "Postion Title: " + title);
		System.out.println(string + "Postion Description: " + description);
		if (assocEmps!= null)
			assocEmps.print(string + "--");
	}

	public void setDepartment(Department d) {
		this.deptName = d;
	}

	public double getSalary() {
		return assocEmps.getSalary();
	}

	public Position getSuperior() {
		return superior;
	}

	public void setSuperior(Position superior) {
		this.superior = superior;
		superior.addInferior(this);
	}

	public void addInferior(Position inferior) {
		if (!inferiors.contains(inferior)) {
			inferiors.add(inferior);
			inferior.setSuperior(this);
		}

	}

	public void printDownLine() {
		printDownLine("");
	}

	public void printDownLine(String indent) {
		print(indent);
		if (inferiors.size() > 0) {
			for (Position p : inferiors) {
				p.printDownLine(indent+" ");
			}
		}

	}
}
