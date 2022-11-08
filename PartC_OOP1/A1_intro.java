
public class A1_intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Object: is simply an instance of a class that may contain an attribute and method
		
		Car mycar = new Car();
		Car mycar2 = new Car();
		
		System.out.println("My car model is "+mycar.model);
		System.out.println("The year is "+mycar.year);
		System.out.println(mycar.make);
		System.out.println(mycar2.make);
		
		// using our class
		mycar.drive();
		System.out.println();
		mycar.brake();
		
	}

}
