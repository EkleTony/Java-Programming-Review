import java.util.Scanner;

public class B2_logicalOperators {
	
	public static void main(String[] args) {
		
		// && || and !
		
				int temp = 25;
				if(temp > 30) {
					System.out.println("It is hot outside");
				}
				else if(temp>=20 && temp <= 30) {
					System.out.println("it is warm outside");
				}
				else {
					System.out.println("IT is cold outside");
				}
		
				
		// scanner
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("You are playing a game! press q or Q to quit");
		String response = input.nextLine();
		
		if(response.equals("q") || response.equals("Q")) {
			System.out.println("You Quit the game");
			
		}else {
			System.out.println("YOu are still playing the game *pew pew*");
		}
		
		input.close();
		
	}

}
