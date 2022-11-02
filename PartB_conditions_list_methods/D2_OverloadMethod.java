
public class D2_OverloadMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Overload method have same names but different parametes
		
		
		int x = add(4,5);
		System.out.println(x);
		double y = add(4,5,7);
		System.out.println(y);



	}
	
	static int add(int x, int y) {
		System.out.println("Overloaded moethed 1");
		return x +y;
	}
	static double add(double a, double b, double c) {
		System.out.println("Overloaded moethed 2");

		return a + b + c;
	}

}
