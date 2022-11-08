package LocalGlobal;

public class ObjectPassingMain {
	
	public static void main(String[] args) {

		// Garage 
		ObjectPassingGarrage garage = new ObjectPassingGarrage();
		
		
		// Car
		ObjectPassingCar car1 = new ObjectPassingCar("BWM");
		ObjectPassingCar car2 = new ObjectPassingCar("Tesla", "Red", "480WB");
		
		garage.park(car1);
		garage.park(car2);
		
		garage.color(car2);

		
		
	}

}
