
public class A3_logicalOperators {

	
	public static void main(String args) {
		
		// && || and !
		
		int temp = 25;
		if(temp > 30) {
			System.out.println("It is hot outside");
		}
		else if(temp>=20 && temp <= 30) {
			System.out.print("it is warm outside");
		}
		else {
			System.out.println("IT is cold outside");
		}
	}
}
