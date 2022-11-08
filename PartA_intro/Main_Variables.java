

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("\\ I Tony Pizza \n");
	
		System.out.println("\" I Tony Pizza \"");
		
		// This a comment
		
		/*
		 * Those are comments
		 * */
		
		// variables
		int x = 3;
		double y = 3.14;
		boolean z = false;
		char symbol = '@';
		String name = "Ekle, Ocheme Anthony";
		
		System.out.println("x is "+x);
		System.out.println("y is "+y);
		System.out.println("z is "+z);
		System.out.println("symbol is "+symbol);
		System.out.println("Hello "+name);
		
		// scanner
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is you naem: ");
		String name2 = scan.nextLine();
		
		System.out.println("Welcome back "+ name2);
		scan.close();

		
		

	}
}
