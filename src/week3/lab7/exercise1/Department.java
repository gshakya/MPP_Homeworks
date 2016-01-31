package week3.lab7.exercise1;

import java.util.ArrayList;

public class Department {
	private String name;
	private String location;
	private Company companyName;
	private ArrayList<Position> assocPostions;

	public Department(String name, String location, Company companyName) {
		this.name = name;
		this.location = location;
		this.companyName = companyName;
		companyName.addDepartment(this);
		assocPostions = new ArrayList<Position>();
	}

	public void addPostion(Position p) {
		if (!assocPostions.contains(p)) {
			assocPostions.add(p);
		}
	}

	@Override
	public String toString() {
		String output="";
		
		output += "\nDepartment Name: " + name;
		output += "\nLocation: " + location;
		output += companyName; 
		return output;
	}

	public void setCompany(Company c) {
		companyName = c;
	}

	public double getSalary() {
		// TODO Auto-generated method stub
		double totalSalary = 0;
		for (Position p : assocPostions) {
			totalSalary = totalSalary + p.getSalary();
		}

		return totalSalary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		for (Position p : assocPostions) {
			result = prime * result + ((p == null) ? 0 : p.subHashCode());
		}
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	public int subHashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyName == null) ? 0 : companyName.subHashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Department other = (Department) obj;
		if (assocPostions == null) {
			if (other.assocPostions != null)
				return false;
		}
		if (assocPostions.size() != other.assocPostions.size())
			return false;

		for (int i = 0; i < assocPostions.size(); i++) {
			if (!assocPostions.get(i).subEquals(other.assocPostions.get(i)))
				return false;
		}

		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.subEquals(other.companyName))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
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
		Department other = (Department) obj;

		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.subEquals(other.companyName))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
