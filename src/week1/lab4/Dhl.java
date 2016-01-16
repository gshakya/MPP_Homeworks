package week1.lab4;

public class Dhl extends Courier {

	public Dhl(String courierItemName, double weightInLb, String zone) {
		super(courierItemName, weightInLb, zone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getRate() {
		return 0.35*getWeightInLb();
	}

}
