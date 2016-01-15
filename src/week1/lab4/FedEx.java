package week1.lab4;

public class FedEx implements Courier {
	private String courierItemName;
	private double weightInLb;
	private String zone;

	public FedEx(String courierItemName, double weightInLb, String zone) {
		super();
		this.courierItemName = courierItemName;
		this.weightInLb = weightInLb;
		this.zone = zone;
	}

	public double getRate() {
		if (weightInLb <= 3){
			return 1;
		}
		return 0.55*weightInLb;
	}

}
