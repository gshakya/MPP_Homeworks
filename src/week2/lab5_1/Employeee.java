package week2.lab5_1;

import java.util.Calendar;

public abstract class Employeee {

	private int empId;
	private ArrayList<PayCheck> paychecks;

	public void print() {
		System.out.println("Employee Id: " + empId);
	}

	public PayCheck calcCompenstaion(int month, int year) {
		Calendar startDate = Calendar.getInstance();
		startDate.set(year, month, 1);
		int lastDay = startDate.getActualMaximum(Calendar.DAY_OF_MONTH);
		Calendar endDate = Calendar.getInstance();
		startDate.set(year, month, lastDay);

		DateRange payPeriod = new DateRange(startDate, endDate);

		double grossPayment = calcGrossPay(DateRange);
		double ficaTax = 0.23 * grossPayment;
		double stateTax = 0.05 * grossPayment;
		double localTax = 0.01 * grossPayment;
		double medicareTax = 0.03 * grossPayment;
		double ssTax = 0.075 * grossPayment;
		PayCheck p = new PayCheck(grossPayment, ficaTax, stateTax, localTax,
				medicareTax, ssTax, payPeriod);
	}
}
