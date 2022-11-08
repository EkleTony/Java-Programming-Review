
import java.lang.Math;
import java.util.Random;
public class B6_arrays {
	
	public static void main(String[] args) {
		
		// array: used to store multiple variables
		
		String[] cars = { "Toyota", "Honda", "Tesla", "Corvette"};
		
		cars[0] = "Tony";
		//System.out.println(cars[3]);
		
		//additionally
		String[] motto = new String[4];
		motto[0] = "BMW";
		motto[1] = "Tesla";
		motto[2] = "Toyota";
		
		for(int i =0; i<cars.length; i++) {
			System.out.println(cars[i]);
			
		}
		
		// generating random number
		
		int min = 10;
		int max = 100;
		int b = (int)(Math.random()*(max-min+1)+min);
		System.out.println(b);
		
		// random
		Random num = new Random();
		int x = num.nextInt(23);
		
		System.out.println("Random numbers: "+x);
	}

}
