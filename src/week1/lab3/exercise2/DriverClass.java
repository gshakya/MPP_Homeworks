package week1.lab3.exercise2;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company salesCo = new Company("Sales Cooperation");
		
		
		Department marketing = new Department("Marketing", "Fairfield");
		Department sales = new Department("Sales Department", "Ottumwa");
		Department directors = new Department("Directors", "New York");
		
		salesCo.addDepartment(marketing);
		salesCo.addDepartment(sales);
		salesCo.addDepartment(directors);
		
		Position ceo = new Position("CEO" , "Chief Executive Officer");
		Position marketingDeptHead = new Position("Marketing Department Head", "Head of Department of Marketing");
		Position marketer1 = new Position("Marketing Person 1","Marketing Personnal");
		Position salesDeptHead = new Position("Sales Department Head", "Department Head of Sales");
		Position salesManager1 = new Position("Sales Manager 1", "Manager of Sales");
		Position salesManager2 = new Position("Sales Manager 2", "Manager of Sales");
		Position salesPerson1 = new Position("Sales Person 1", "Sales Personnal");
		Position salesPerson2 = new Position("Sales Person 2", "Sales Personnal");
		Position salesPerson3 = new Position("Sales Person 3", "Sales Personnal");
		Position salesPerson4 = new Position("Sales Person 4", "Sales Personnal");
		Position salesPerson5 = new Position("Sales Person 5", "Sales Personnal");
		
		marketing.addPostion(marketingDeptHead);
		marketing.addPostion(marketer1);
		
		sales.addPostion(salesDeptHead);
		sales.addPostion(salesManager1);
		sales.addPostion(salesManager2);
		sales.addPostion(salesPerson1);
		sales.addPostion(salesPerson2);
		sales.addPostion(salesPerson3);
		sales.addPostion(salesPerson4);
		sales.addPostion(salesPerson5);
		
		directors.addPostion(ceo);
		
		Employee lyle = new Employee(1, "Lyle", "", "Diaz", "11/27/1986", "4566-78-145", 10000, ceo);
		Employee anne = new Employee(2, "Anne","","Marie","04/08/1988","7894-89-895",6000,marketingDeptHead);
		Employee ron = new Employee(3, "Ron", "James", "Howard", "22/09/1990", "2307-89-568", 6500, salesDeptHead);
		Employee gary = new Employee(4,"Gary","","Lynch","30/01/1985","7810-69-004",5000,marketer1);
		Employee stan = new Employee(5, "Stan", "", "Lee", "17/08/1954", "0147-78-852", 5500, salesManager1);
		Employee peter = new Employee(6, "Peter", "", "Pan", "11/05/1987", "2447-81-244", 5500, salesManager2);
		Employee tom = new Employee(7, "Tom", "", "Hardy", "11/05/1980", "2777-81-244", 4000, salesPerson1);
		Employee sue = new Employee(8, "Sue", "", "Ling", "01/25/1987", "2447-81-245", 4000, salesPerson2);
		Employee marc = new Employee(9, "Marc", "", "Brown", "11/05/1987", "2447-81-246", 4000, salesPerson3);
		Employee bill = new Employee(10, "Bill", "", "Abraham", "11/05/1974", "2447-81-247", 4000, salesPerson4);
		Employee dan = new Employee(11, "Dan", "", "Brown", "11/05/1975", "2447-81-248", 4000, salesPerson5);
		
		
		
		
		System.out.printf("Overall Salary of the Company = $%,.2f",salesCo.getSalary());
		System.out.printf("\nOverall Salary of Sales Department = $%,.2f",sales.getSalary());
		System.out.printf("\nOverall Salary of Marketing Department = $%,.2f",marketing.getSalary());
		System.out.printf("\nOverall Salary of Dan Brown = $%,.2f",dan.getSalary());
	}

}
