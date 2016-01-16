package week1.lab4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CourierCalculator {

	public static Courier getCheapRates(String name, double weightInLbs, String shippingZone) {
		ArrayList<Courier> couriers = new ArrayList<>();
		couriers.add(new FedEx(name, weightInLbs, shippingZone));
		couriers.add(new Ups(name, weightInLbs, shippingZone));
		couriers.add(new USMail(name, weightInLbs, shippingZone));
		couriers.add(new Dhl(name, weightInLbs, shippingZone));
		Courier cheapest = couriers.get(0);
		System.out.println(cheapest);
		for (int i = 1; i < couriers.size(); i++) {
			if (couriers.get(i).getRate() < cheapest.getRate())
				cheapest = couriers.get(i);
			 System.out.println(couriers.get(i));

		}
		return cheapest;
	}

	public static void main(String[] args) throws IOException {
		System.out.printf("Enter c to check Shipping rates q to quit: ");
		Scanner ip = new Scanner(System.in); 
		char option = (char) System.in.read();
		ip.nextLine();
		while (option!= 'q'){
			
			if (option == 'c'){
				String name;
				double weight;
				String zoneName;
				System.out.printf("Enter Item Name: ");
				name= ip.nextLine();
				System.out.printf("Enter Weight: ");
				weight = Double.parseDouble(ip.nextLine());
				System.out.printf("Enter Ship Zone: ");
				zoneName= ip.nextLine();
				System.out.println("Cheapest Rate\n"+getCheapRates(name, weight, zoneName));
			}
			else 
				System.out.println("Invalid Option Try Again");
		}
		ip.close();
	}

}
