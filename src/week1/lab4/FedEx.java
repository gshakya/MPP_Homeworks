package week1.lab4;

public class FedEx extends Courier {

	public FedEx(String courierItemName, double weightInLb, String zone) {
		super(courierItemName, weightInLb, zone);
	}

	public double getRate() {
		double zoneRate = 0.43;
		if (getZone().equals("IA") | getZone().equals("MT") | getZone().equals("OR") | getZone().equals("CA"))
			zoneRate = 0.35;
		else if (getZone().equals("TX") | getZone().equals("UT"))
			zoneRate = 0.30;
		else if (getZone().equals("FL") | getZone().equals("MA") | getZone().equals("OH"))
			zoneRate = 0.55;
		return zoneRate * getWeightInLb();
	}

}
