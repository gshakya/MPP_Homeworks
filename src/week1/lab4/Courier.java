package week1.lab4;

public abstract class Courier {

	private String courierItemName;
	private double weightInLb;
	private String zone;

	public Courier(String courierItemName, double weightInLb, String zone) {
		this.courierItemName = courierItemName;
		this.weightInLb = weightInLb;
		this.zone = zone;
	}

	public abstract double getRate();

	public String toString() {
		return String.format("%10s %6.2f %20s ",courierItemName,getRate(), this.getClass().getSimpleName());
	}

	public String getCourierItemName() {
		return courierItemName;
	}

	public double getWeightInLb() {
		return weightInLb;
	}

	public String getZone() {
		return zone;
	};
	
	
}
