package Main.java; //TravecTravelCostCalculator

public class TravelCostCalculator {

	public static void main(String[] args) {
		
		//Probleminputs

				int distance = 450;

		        double consumptionPer100Km = 7.5;

		        int fuelPrice = 52;

		        int highwayFee = 250;

		        int numberOfPeople = 3;

		        

		        double totalFuelConsumption = (distance / 100.0) * consumptionPer100Km; //toplam yakıt miktarı

		        double fuelCost = totalFuelConsumption * fuelPrice; //toplam yakıt maliyeti

		        double totalTravelCost =fuelCost + highwayFee; //toplam yolculuk maliyeti

		        double costPerPerson = totalTravelCost / numberOfPeople;// kişi başına düşen maliyet

		        

		        System.out.println("Total Fuel Consumption: "  + totalFuelConsumption + " L");

		        System.out.println("Fuel Cost: " + fuelCost + " TL");

		        System.out.println("Total Travel Cost: "  + totalTravelCost + " TL");

		        System.out.println("Cost Per Person: "  + costPerPerson + " TL");





	}

}
