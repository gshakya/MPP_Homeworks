package week3.lab7.exercise1;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class DriverClass {
	
	
	public static void main(String[] args) {
		Company comp = new Company("Verisk");
		Company comp_copy = new Company("Verisk");
//		Company comp_diff = new Company("NOTVerisk");
			
		Department dept = new Department("Research and Development", "Nepal", comp);
		Department dept_copy = new Department("Research and Development", "Nepal", comp_copy);
//		Department dept_diff_name = new Department("NOT Research and Development", "Nepal", comp);
//		Department dept_diff_loc = new Department("Research and Development", "USA", comp);
//		Department dept_diff_comp = new Department("Research and Development", "Nepal", comp_diff);
//			
//			
		Position post = new Position("Senior Software Engineer", "", dept);
		Position post_copy = new Position("Senior Software Engineer", "" , dept_copy);
//		Position post_diff_name = new Position("Software Engineer", "" , dept);
//		Position post_diff_desc = new Position("Senior Software Engineer", "--Test--" , dept);
//		Position post_diff_dept = new Position("Senior Software Engineer", "--Test--" , dept_diff_name);
//			
		Employee emp = new Employee(1, "Gunjan", "", "Shakya", "11271986", "111-789-9868", 5000, post);
//		Employee emp_copy = new Employee(1, "Gunjan", "", "Shakya", "11271986", "111-789-9868", 5000,post_copy);
		Employee emp_diff_fname = new Employee(1, "NOTGunjan", "", "Shakya", "11271986", "111-789-9868", 5000,post);
//		Employee emp_diff_mname = new Employee(1, "Gunjan", "NOT", "Shakya", "11271986", "111-789-9868", 5000,post);
//		Employee emp_diff_lname = new Employee(1, "Gunjan", "", "NOTShakya", "11271986", "111-789-9868", 5000, post);
//		Employee emp_diff_dob = new Employee(1, "Gunjan", "", "Shakya", "11271800", "111-789-9868", 5000, post);
//		Employee emp_diff_ssn = new Employee(1, "Gunjan", "", "Shakya", "11271986", "111-789-0000", 5000, post);
//		Employee emp_diff_salary = new Employee(1, "Gunjan", "", "Shakya", "11271986", "111-789-9868", 1000, post);
//		Employee emp_diff_post = new Employee(1, "Gunjan", "", "Shakya", "11271986", "111-789-9868", 5000, post_diff_name);	// 
		
		
		System.out.println(emp);
		
	}

}
