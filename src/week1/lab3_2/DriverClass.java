package week1.lab3_2;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company verisk = new Company("Verisk");
		Department rnd = new Department("Research and Development", "2nd Floor");
		Department ops = new Department("Operations", "3rd Floor");
		
		Position dataEngg = new Position("Data Engineer", "Data Engineer for Operations");
		Position softEngg = new Position("Software Engineer", "Software Engineer for Reasearch");
		Position srsoftEngg = new Position("Senior Software Engineer", "Senior Software Engineer for Reasearch");
		Position clerk = new Position("Office Manager", "Currently No Dept");
		
		
		Employee gshakya = new Employee(1, "Gunjan", "", "Shakya", "11/27/1986", "1111-15-789", 8000);
		Employee ppoudel = new Employee(2, "Prabhat", "", "Poudel", "09/27/1988", "2222-15-789", 7000);
		Employee msiwakot = new Employee(3, "Madan", "", "Siwakot", "02/04/1990", "3333-15-789", 6000);
		Employee gbasnet = new Employee(1, "Govinda", "", "Basnet", "10/04/1991", "4444-15-789", 5000);
		Employee sbhusal = new Employee(1, "Samrat", "", "Bhusal", "05/12/1989", "5555-15-789", 4000);
		Employee nlimbu = new Employee(1, "Nagendra", "", "Limbu", "11/27/1985", "6666-15-789", 3000);
//		Employee gshakya = new Employee(1, "Gunjan", "", "Shakya", "11/27/1986", "4444-15-789", 8000);
//		Employee gshakya = new Employee(1, "Gunjan", "", "Shakya", "11/27/1986", "4444-15-789", 8000);
		
		verisk.addDepartment(rnd);
		verisk.addDepartment(ops);
		
		rnd.addPostion(softEngg);
		rnd.addPostion(srsoftEngg);
		
		ops.addPostion(dataEngg);
		
		softEngg.addEmployees(nlimbu);
		softEngg.addEmployees(sbhusal);
		
		srsoftEngg.addEmployees(gshakya);
		srsoftEngg.addEmployees(ppoudel);
		
		dataEngg.addEmployees(gbasnet);
		dataEngg.addEmployees(msiwakot);
		
//		verisk.print();
		
		rnd.print();
	}

}
