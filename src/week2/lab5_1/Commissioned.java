package week2.lab5_1;

import java.util.ArrayList;

public class Commissioned extends Employee {
	private double commission;
	private double baseSalary;
	private ArrayList<Order> orders;

	public Commissioned(int empId, double commission, double baseSalary) {
		super(empId);
		this.commission = commission;
		this.baseSalary = baseSalary;
		this.orders = new ArrayList<>();
	}

	@Override
	public double calcGrossPay(DateRange timePeriod) {
		double totalSalary = baseSalary;
		for (Order o : orders) {
			totalSalary += o.getOrderAmount() * (commission / 100);
		}
		return totalSalary;
	}

	public void addOrder(Order o){
		orders.add(o);
		if(o.getSeller()== null){
			o.setSeller(this);
		}
	}

	public ArrayList<Order> getOrders() {
		return orders;
	}
	
	
}
