package week1.lab4;

public class Ups extends Courier {

	public Ups(String courierItemName, double weightInLb, String zone) {
		super(courierItemName, weightInLb, zone);
		
	}

	public double getRate() {
		return 0.45*getWeightInLb();
	}

}
