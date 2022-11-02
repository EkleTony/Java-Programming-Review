
public class D1_Method1 {
	
	public static void main(String[] args) {
		// methods
		String name = "Ekle Anthony";
		int age = 26;
		hello(name, age);
		//hello();
		
		int x = 3;
		int y = 5;
		int z = add(x, y);
		System.out.println(x + " + "+y+" = "+z);
		
	}
	// outside of the main methods
	static void hello(String x, int age) {
		System.out.println("Hello "+x);
		System.out.println("Your age is "+x);
	}
	
	// example 2
	static int add(int x, int y) {
		int z = x +y;
		return z;
		
	}
	
	

}
