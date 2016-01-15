package week1.lab4;

public class Ups implements Courier {
	private String courierItemName;
	private double weightInLb;
	private String zone;

	public Ups(String courierItemName, double weightInLb, String zone) {
		super();
		this.courierItemName = courierItemName;
		this.weightInLb = weightInLb;
		this.zone = zone;
	}

	public double getRate() {
		return 0.45*weightInLb;
	}

}
