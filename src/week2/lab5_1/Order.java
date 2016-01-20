package week2.lab5_1;

import java.util.Calendar;

public class Order {
	private int orderNo;
	private Calendar orderDate;
	private double orderAmount;
	private Commissioned seller;

	public Order(int orderNo, Calendar orderDate, double orderAmount) {
		super();
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}

	public Order(int orderNo, Calendar orderDate, double orderAmount, Commissioned seller) {
		super();
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
		this.seller = seller;
		if (!seller.getOrders().contains(this)) {
			seller.addOrder(this);
		}

	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public Calendar getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Calendar orderDate) {
		this.orderDate = orderDate;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Commissioned getSeller() {
		return seller;
	}

	public void setSeller(Commissioned seller) {
		this.seller = seller;
		if (!seller.getOrders().contains(this)) {
			seller.addOrder(this);
		}
	}
	
	
	

}
