package week3.lab7.exercise1;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

public class Position {
	private String title;
	private String description;
	private Employee assocEmps;
	private Department deptName;

	public Position(String title, String description, Department deptName) {
		this.title = title;
		this.description = description;
		this.deptName = deptName;
		deptName.addPostion(this);
	}

	public Department getDeptName() {
		return deptName;
	}

	public void setEmployee(Employee e) {
		assocEmps = e;
	}

	

	// public void setDepartment(Department d) {
	// this.deptName = d;
	// }

	public double getSalary() {
		return assocEmps.getSalary();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((assocEmps == null) ? 0 : assocEmps.subHashCode());
		result = prime * result + ((deptName == null) ? 0 : deptName.subHashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	public int subHashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deptName == null) ? 0 : deptName.subHashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (assocEmps == null) {
			if (other.assocEmps != null)
				return false;
		} else if (!assocEmps.subEquals(other.assocEmps))
			return false;
		if (deptName == null) {
			if (other.deptName != null)
				return false;
		} else if (!deptName.subEquals(other.deptName))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	public boolean subEquals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (deptName == null) {
			if (other.deptName != null)
				return false;
		} else if (!deptName.subEquals(other.deptName))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	

	@Override
	public String toString() {
		String output = "";
		output += "\nPostion Title: " + title;
		output += "\nPostion Description: " + description;
		output += deptName;
		return output;
	}
}
