
import java.util.ArrayList;
import java.util.Random;

public class B10_ArrayList {
	
	public static void main(String[] args) {
		
		// ArrayList ==  resizable array..element can be added and removed
		
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("Pizza");
		food.add("Hamburger");
		food.add("HotDog");
		food.add("Rice");
		
		food.set(0, "Sushi");
		//food.remove(3);
		//food.clear();
		
		
		System.out.println(food);
		Random rand = new Random();
		
		
		//int size = food.size() +1;
		// for(int i=0; i<size; i++){
		//	System.out.println(food.get(i));
		//}
		int randFood = rand.nextInt(food.size());
		System.out.println(food.get(randFood));
		//System.out.println(food.size());
		
		
		
	}

}
