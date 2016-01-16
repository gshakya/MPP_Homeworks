package week1.lab4;

public class USMail extends Courier {
	public USMail(String courierItemName, double weightInLb, String zone) {
		super(courierItemName, weightInLb, zone);
	}

	public double getRate() {
		if (getWeightInLb() <= 3) {
			return 1;
		}
		return 0.55 * getWeightInLb();
	}

}
