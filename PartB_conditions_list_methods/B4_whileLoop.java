import java.util.Scanner;

public class B4_whileLoop {
	
	public static void main(String[] args) {
		
		// while loop = executes a block of code as long
		// as the condition remain true
		
		Scanner scan = new Scanner(System.in);
		
		//name variable
		String name = "";
		
		//while(name.isBlank()) {
			//System.out.println("Enter your name: ");
			//name = scan.nextLine();
			
		//}
		System.out.println("Hello "+name);
		
		// do- while
		 {
			System.out.println("Enter your name: ");
			name = scan.nextLine();
			
		} while(name.isBlank());
		System.out.println("Hello "+name);
		
		
		
		
		
		
		scan.close();
	}

}
