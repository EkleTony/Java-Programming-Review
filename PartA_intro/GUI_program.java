import javax.swing.JOptionPane;


public class GUI_program {
	
	public static  void main(String[] args) {
		
		//GUI graphical user interface
		String name = JOptionPane.showInputDialog("Enter you name: ");
		//JOptionPane.showMessageDialog(null, "Hello "+name);
		
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter you age"));
		//JOptionPane.showMessageDialog(null, "You are "+age+" years old");
		
		// 177cm tall and 5.81 feet tall
		Double height = Double.parseDouble(JOptionPane.showInputDialog("Enter you height in cm"));
		JOptionPane.showMessageDialog(null, "Hello "+name+" You're " + age +" years old and you're "+height+" cm tall");
		
		
	}

}
