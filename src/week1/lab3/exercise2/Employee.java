package week1.lab3.exercise2;

public class Employee {

	private int employeeId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String dob;
	private String ssn;
	private double salary;
	private Position empPost;
	
	
	
	public Employee(int employeeId, String firstName, String middleName,
			String lastName, String dob, String ssn, double salary, Position p) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dob = dob;
		this.ssn = ssn;
		this.salary = salary;
		setPosition(p);
	}
	
	public void print(){
		print("");
	}


	public void print(String string) {
		System.out.println(string+"Employee Name: "+firstName+" "+middleName+" "+lastName);
		System.out.println(string+"Employee Birthdate: "+dob);
		System.out.println(string+"Employee SSN: "+ ssn);
		System.out.printf(string+"Employee Salary: $%,.2f\n",salary);
		
	}

	public void setPosition(Position position) {
		empPost= position;
		position.setEmployee(this);
		
	}
	
	public double getSalary(){
		return salary;
	}
}
