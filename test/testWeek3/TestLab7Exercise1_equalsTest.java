package testWeek3;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;
import week3.lab7.exercise1.Employee;
import week3.lab7.exercise1.Position;

public class TestLab7Exercise1_equalsTest extends TestCase {
	private Position post = new Position("Senior Software Engineer", "");
	private Position post_copy = new Position("Senior Software Engineer", "");
	private Position diff_post = new Position("Software Engineer", "");
	
	private Employee emp = new Employee(1, "Gunjan", "", "Shakya", "11271986", "111-789-9868", 5000, post);
	private Employee emp_copy = new Employee(1, "Gunjan", "", "Shakya", "11271986", "111-789-9868", 5000,post_copy);
	private Employee emp_diff_fname = new Employee(1, "NOTGunjan", "", "Shakya", "11271986", "111-789-9868", 5000,post);
	private Employee emp_diff_mname = new Employee(1, "Gunjan", "NOT", "Shakya", "11271986", "111-789-9868", 5000,post);
	private Employee emp_diff_lname = new Employee(1, "Gunjan", "", "NOTShakya", "11271986", "111-789-9868", 5000, post);
	private Employee emp_diff_dob = new Employee(1, "Gunjan", "", "Shakya", "11271800", "111-789-9868", 5000, post);
	private Employee emp_diff_ssn = new Employee(1, "Gunjan", "", "Shakya", "11271986", "111-789-0000", 5000, post);
	private Employee emp_diff_salary = new Employee(1, "Gunjan", "", "Shakya", "11271986", "111-789-0000", 1000, post);
	private Employee emp_diff_post = new Employee(1, "Gunjan", "", "Shakya", "11271986", "111-789-0000", 1000, diff_post);

	public static void main(String[] args) {
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testTrue() {

		Employee c1 = new Employee(1, "Gunjan", "", "Shakya", "11271986", "111-789-9868", 5000,
				new Position("Senior Software Engineer", ""));
		Employee c2 = new Employee(1, "Gunjan", "", "Shakya", "11271986", "111-789-9868", 5000,
				new Position("Senior Software Engineer", ""));

		assertEquals(c1, c2);
	}

	@Test
	public void testWrongPosition() {

		Employee c1 = new Employee(1, "Gunjan", "", "Shakya", "11271986", "111-789-9868", 5000,
				new Position("Senior Software Engineer", ""));
		Employee c2 = new Employee(1, "Gunjan", "", "Shakya", "11271986", "111-789-9868", 5000,
				new Position("Software Engineer", ""));

		assertNotEquals(c1, c2);
	}

	@Test
	public void testWrongValues() {

		Employee c1 = new Employee(1, "Gunjan", "", "", "11271986", "111-789-9868", 5000,
				new Position("Senior Software Engineer", ""));
		Employee c2 = new Employee(1, "Gunjan", "", "Shakya", "11271986", "111-789-9868", 5000,
				new Position("Senior Software Engineer", ""));

		assertNotEquals(c1, c2);
	}
}
