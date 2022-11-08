package LocalGlobal;

public class ArrayObject {
	
	public static void main(String[] args) {
	
		
		
		//ArrayFood[] refrigerator = new ArrayFood[3];
		
		ArrayFood food1 = new ArrayFood("Pizza");
		ArrayFood food2 = new ArrayFood("Hamburger");
		ArrayFood food3 = new ArrayFood("Hotdog");
		
		ArrayFood[] refrigerator = {food1, food2, food3};
		
		//refrigerator[0] = food1;
		//refrigerator[1] = food2;
		//refrigerator[2] = food3;
		
		System.out.println(refrigerator[0].name);
		System.out.println(refrigerator[1].name);
		System.out.println(refrigerator[2].name);

		
		

		
		

	}

}
