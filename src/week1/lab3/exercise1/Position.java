package week1.lab3.exercise1;
public class Position {
	private String title;
	private String description;
	private Employee assocEmps;
	private Department deptName;

	public Position(String title, String description) {
		this.title = title;
		this.description = description;
	}

	public Department getDeptName() {
		return deptName;
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
		if (assocEmps != null)
			assocEmps.print(string + "--");
	}

	public void setDepartment(Department d) {
		this.deptName = d;
	}

}
