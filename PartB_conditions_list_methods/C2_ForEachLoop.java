import java.util.ArrayList;

public class C2_ForEachLoop {
	
	public static void main(String[] args) {
		
		// for-each= traversing technique to iterate through
		// the element in an array collection
		// less steps
		// less flexible
		
		//String[] animals = {"cat", "dog", "bird"};
		ArrayList<String> animals2 = new ArrayList<String>();
		animals2.add("Cat");
		animals2.add("Dog");
		animals2.add("Goat");
		
		
		for(int i=0; i<animals2.size(); i++) {
			System.out.println(animals2.get(i));
			
		}
		// for each
		for(String i : animals2) {
			System.out.println(i);
		}
		
	}

}
