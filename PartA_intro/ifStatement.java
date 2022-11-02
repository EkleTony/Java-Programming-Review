
import java.util.Scanner;

public class ifStatement {
	public static void main(String[] args) {
		
		//call scanner
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		 int age = scan.nextInt();
		//int age = 18;
		if (age >= 75) {
			System.out.println("Ok Boomer!");
		}		
		else if(age>=18) {
			System.out.println("You are an Adult!");

		}
		else if(age >=10  & age <= 17) {
			System.out.println("you're a teenager!");
		}
			
		else {
			System.out.println("You are not an adult");
		}
		scan.close();
	}

}
