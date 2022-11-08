import javax.swing.JOptionPane;
import java.util.Scanner;
public class mathsFormular {
	
	public static void main(String[] args) {
		
		double x;
		double y;
		double z;
		
		x = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of x: "));
		y = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of y: "));

		z = Math.sqrt((x*x) + (y*y));
		
		JOptionPane.showMessageDialog(null, "Given "+x+" and "+y+" \n The hypotenus is: "+z);
		
		// using scanner
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value of x: ");
		x = scan.nextDouble();
		
		System.out.println("Enter the value of y: ");
		y= scan.nextDouble();
		
		z = Math.sqrt((x*x) + (y*y));
		
		
		System.out.println(" Given "+x+" and "+y+"\n The hypotenus is "+z);
		
		
		scan.close();
	}

}
