package week3.lab7.exercise1;

import java.util.ArrayList;

public class Company {
	private String name;
	private ArrayList<Department> assocDept;

	public Company(String name) {
		this.name = name;
		assocDept = new ArrayList<Department>();
	}

	public void addDepartment(Department d) {
		d.setCompany(this);
		if (!assocDept.contains(d)) {
			assocDept.add(d);
		}
	}

	public double getSalary() {
		double totalSalary = 0;
		for (Department d : assocDept) {
			totalSalary = totalSalary + d.getSalary();
		}

		return totalSalary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		for (Department d : assocDept) {
			result = prime * result + ((d == null) ? 0 : d.subHashCode());
		}

		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	public int subHashCode() {
		final int prime = 31;
		int result = 1;
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
		Company other = (Company) obj;
		if (assocDept == null) {
			if (other.assocDept != null)
				return false;
		}
		if (assocDept.size() != other.assocDept.size())
			return false;
		for (int i = 0; i < assocDept.size(); i++) {
			if (!assocDept.get(i).subEquals(other.assocDept.get(i)))
				return false;
		}
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
		Company other = (Company) obj;
		if (assocDept == null) {
			if (other.assocDept != null)
				return false;
		}
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {

		return "\nCompany: " + name;
	}
}
