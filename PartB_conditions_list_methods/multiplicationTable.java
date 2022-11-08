import javax.swing.JOptionPane;


public class multiplicationTable {
	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter x value: "));
		int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter y value: "));

		
		System.out.println(" Multiplication Table");
		
		
		
		// multiplication table
				for(int i =1; i<=x; i++) {
					System.out.println();
					for(int j  =1; j<=y; j++) {
						int z = i * j;
						System.out.print(j +" * " +i + " = "+z+ "\t");
					}
				}
	}

}
