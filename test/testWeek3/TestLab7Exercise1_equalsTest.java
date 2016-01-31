package testWeek3;

import static org.junit.Assert.*;

import javax.print.attribute.standard.MediaSize.Other;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import week3.lab7.exercise1.Company;
import week3.lab7.exercise1.Department;
import week3.lab7.exercise1.Employee;
import week3.lab7.exercise1.Position;

public class TestLab7Exercise1_equalsTest extends TestCase {

	private Company comp;
	private Company comp_copy;
	private Company comp_diff;

	private Department dept;
	private Department dept_copy;
	private Department dept_diff_name;
	private Department dept_diff_loc;
	private Department dept_diff_comp;

	private Position post;
	private Position post_copy;
	private Position post_diff_name;
	private Position post_diff_desc;
	private Position post_diff_dept;

	private Employee emp;
	private Employee emp_copy;
	private Employee emp_diff_fname;
	private Employee emp_diff_mname;
	private Employee emp_diff_lname;
	private Employee emp_diff_dob;
	private Employee emp_diff_ssn;
	private Employee emp_diff_salary;
	private Employee emp_diff_post;

	public static void main(String[] args) {
	}

	
	public void setUp() throws Exception {
		super.setUp();

		comp = new Company("Verisk");
		dept = new Department("Research and Development", "Nepal", comp);
		post = new Position("Senior Software Engineer", "", dept);
		emp = new Employee(1, "Gunjan", "", "Shakya", "11271986", "111-789-9868", 5000, post);		
		
		comp_copy = new Company("Verisk");
		dept_copy = new Department("Research and Development", "Nepal", comp_copy);
		post_copy = new Position("Senior Software Engineer", "", dept_copy);
		emp_copy = new Employee(1, "Gunjan", "", "Shakya", "11271986", "111-789-9868", 5000, post_copy);

		comp_diff = new Company("NOTVerisk");
		dept_diff_comp = new Department("Research and Development", "Nepal", comp_diff);
		post_diff_dept = new Position("Senior Software Engineer", "" , dept_diff_comp);
		emp_diff_post = new Employee(1, "Gunjan", "", "Shakya", "11271986", "111-789-9868", 5000, post_diff_dept);		
	}

	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testEqual() {		
		assertTrue(comp.equals(comp_copy));
		assertTrue(dept.equals(dept_copy));
		assertTrue(post.equals(post_copy));
		assertTrue(emp.equals(emp_copy));
		
		assertEquals(comp.hashCode(), comp_copy.hashCode());
		assertEquals(dept.hashCode(), dept_copy.hashCode());
		assertEquals(post.hashCode(), post_copy.hashCode());
		assertEquals(emp.hashCode(), emp_copy.hashCode());
	}

	@Test
	public void testEmpDiff() {
		emp_diff_fname = new Employee(1, "NOTGunjan", "", "Shakya", "11271986", "111-789-9868", 5000,post);
		emp_diff_mname = new Employee(1, "Gunjan", "NOT", "Shakya", "11271986", "111-789-9868", 5000,post);
		emp_diff_lname = new Employee(1, "Gunjan", "", "NOTShakya", "11271986", "111-789-9868", 5000, post);
		emp_diff_dob = new Employee(1, "Gunjan", "", "Shakya", "11271800", "111-789-9868", 5000, post);
		emp_diff_ssn = new Employee(1, "Gunjan", "", "Shakya", "11271986", "111-789-0000", 5000, post);
		emp_diff_salary = new Employee(1, "Gunjan", "", "Shakya", "11271986", "111-789-9868", 1000, post);
		
		assertFalse(emp.equals(emp_diff_fname));
		assertFalse(emp.equals(emp_diff_mname));
		assertFalse(emp.equals(emp_diff_lname));
		assertFalse(emp.equals(emp_diff_dob));
		assertFalse(emp.equals(emp_diff_ssn));
		assertFalse(emp.equals(emp_diff_salary));
		assertFalse(emp.equals(emp_diff_post));		
		
		assertNotEquals(emp.hashCode(), emp_diff_fname.hashCode());
		assertNotEquals(emp.hashCode(), emp_diff_mname.hashCode());
		assertNotEquals(emp.hashCode(), emp_diff_lname.hashCode());
		assertNotEquals(emp.hashCode(), emp_diff_dob.hashCode());
		assertNotEquals(emp.hashCode(), emp_diff_ssn.hashCode());
		assertNotEquals(emp.hashCode(), emp_diff_salary.hashCode());
		assertNotEquals(emp.hashCode(), emp_diff_post.hashCode());
	}

	@Test
	public void testPostDiff() {
		post_diff_name = new Position("Software Engineer", "" , dept);
		post_diff_desc = new Position("Senior Software Engineer", "--Test--" , dept);
		
		assertFalse(post.equals(post_diff_name));
		assertFalse(post.equals(post_diff_desc));
		assertFalse(post.equals(post_diff_dept));		
		
		assertNotEquals(post.hashCode(),post_diff_name.hashCode());
		assertNotEquals(post.hashCode(),post_diff_desc.hashCode());
		assertNotEquals(post.hashCode(),post_diff_dept.hashCode());
	}

	@Test
	public void testDeptDiff() {
		dept_diff_name = new Department("NOT Research and Development", "Nepal", comp);
		dept_diff_loc = new Department("Research and Development", "USA", comp);
		
		assertFalse(dept.equals(dept_diff_name));
		assertFalse(dept.equals(dept_diff_loc));
		assertFalse(dept.equals(dept_diff_comp));
		
		assertNotEquals(dept.hashCode(), dept_diff_name.hashCode());
		assertNotEquals(dept.hashCode(), dept_diff_loc.hashCode());
		assertNotEquals(dept.hashCode(), dept_diff_comp.hashCode());		
	}
	
	@Test
	public void testCompDiff() {	
		assertFalse(comp.equals(comp_diff));
		
		assertNotEquals(comp.hashCode(), comp_diff.hashCode());
	}
	
	@Test
	public void testToString(){
		String output = "Employee Name: Gunjan  Shakya\n"
				+ "Employee Birthdate: 11271986\n"
				+ "Employee SSN: 111-789-9868\n"
				+ "Employee Salary: $5,000.00\n"
				+ "Postion Title: Senior Software Engineer\n"
				+ "Postion Description:\n"
				+ "Department Name: Research and Development\n"
				+ "Location: Nepal\n"
				+ "Company: Verisk";
		assertEquals(output.trim().replaceAll("\\s+", " "), emp.toString().trim().replaceAll("\\s+", " "));
	}
}
