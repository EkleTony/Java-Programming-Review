package LocalGlobal;

public class ObjectPassingGarrage {
	
	void park(ObjectPassingCar car) {
		System.out.println("The "+car.name+" is parked in the garage");
			
	}
	
	void color(ObjectPassingCar properties) {
		System.out.println("The color of this "+properties.name + 
				" is "+properties.color+ " of model "+ properties.model);
		
	}

}
