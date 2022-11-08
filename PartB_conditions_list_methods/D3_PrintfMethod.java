import java.util.ArrayList;
import java.util.Random;

public class D3_PrintfMethod {

	public static void main(String[] args) {
		// Auto-generated method stub
		
		System.out.println("This i a string "+234);
		System.out.printf("This is a format string ", 123);
		
		
		// random array
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Ekle");
		names.add("Piyalee");
		names.add("Peter the Rock");
		names.add("John Paul");
		names.add("Blessing");
		names.add("Diego Bostra");
		names.add("Ocheme TY");
		names.add("Luper");
		
		Random rand = new Random();
	
		int index = rand.nextInt(names.size());
		
		System.out.println("\n Hello "+names.get(index));
		

	}

}
