
import java.util.*;
public class C1_2dList {
	
	public static void main(String[] args) {
		
		// 2d arraylist
		ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> bakeryList = new ArrayList<String>();
		bakeryList.add("Pasta");
		bakeryList.add("garlix bread");
		bakeryList.add("donuts");
		
		ArrayList<String> produceList  = new ArrayList<String>();
		produceList.add("Tomatoes");
		produceList.add(" Xucchinni");
		produceList.add("Pepper");
		
		ArrayList<String> drinkList = new ArrayList<String>();
		drinkList.add("Soda");
		drinkList.add(" coffee");
		drinkList.add("Juice");
		
		// adding to 2dlist
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinkList);
		
		
		System.out.println(groceryList);
		System.out.println(groceryList.get(0));
		System.out.println(groceryList.get(0).get(0));

		
		
		
	}

}
