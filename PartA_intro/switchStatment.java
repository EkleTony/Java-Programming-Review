import javax.swing.JOptionPane;

public class switchStatment {
	
	public static void main(String[] args) {
		
		String day = JOptionPane.showInputDialog("Enter a day");
		
		
		switch(day) {
		
		case "sunday": JOptionPane.showMessageDialog(null, "It is "+day);
		break;
		
		case "monday": JOptionPane.showMessageDialog(null, "It is "+day);
		break;
		
		case "tuesday": JOptionPane.showMessageDialog(null, "It is "+day);
		break;
		
		case "wednesday": JOptionPane.showMessageDialog(null, "It is "+day);
		break;
		
		case "thursday": JOptionPane.showMessageDialog(null, "It is "+day);
		break;
		
		case "friday": JOptionPane.showMessageDialog(null, "It is "+day);
		break;
		
		case "saturday": JOptionPane.showMessageDialog(null, "It is "+day);
		break;
		
		
		
		}
	}

}
