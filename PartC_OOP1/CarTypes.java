
public class CarTypes {
	
	String name; // = "Lexus";
	String model; // = "M300";
	String color; // = "Black";
	
	CarTypes(String name, String model, String color){
		
		this.name = name;
		this.model = model;
		this.color = color;
		this.car();
		
	}
	
	
	
	void car() {
		System.out.println("My new car is "+name);
	}

}
