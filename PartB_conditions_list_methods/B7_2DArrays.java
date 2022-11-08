
public class B7_2DArrays {
	
	public static void main(String[] args) {
		
		// 2D array = an array of arrays
		
		String[][] cars = new String[3][3];
		cars[0][0] = "Camaro";
		cars[0][1] = "Corvette";
		cars[0][2] = "Mustang";
		
		cars [1][0] = "Ranger";
		cars[1][1] = "F-150";
		cars[1][2] = "Ferrari";
		
		cars[2][0] = "Toyota";
		cars[2][1] = "Lambo";
		cars[2][2] = "Tesla";
		
		// alternatively
		String[][] car = {
				{"Camaro", "Corvette", " Mustang"},
				{"Ranger", "F-150"," Ferrari "}, 
				{"Toyota",  "Lambo"," Tesla"} 
				};
		
		for(int i =0; i<cars.length; i++) {
			System.out.println();
			for(int j =0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+" ");
				
			}
		}
		System.out.println(" \n");
		for(int i =0; i<car.length; i++) {
			System.out.println();
			for(int j =0; j<car[i].length; j++) {
				System.out.print(car[i][j]+" ");
				
			}
		}
		
		
		
	}

}
