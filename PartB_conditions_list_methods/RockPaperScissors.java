import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
//import java.util.Scanner;
public class RockPaperScissors {
	
	public static void main(String[] args) {
		//players choice
		String player = JOptionPane.showInputDialog("Enter paper, rock or scissors");
		
		//Scanner scan = new Scanner(System.in);
		
	
		
		//System.out.println("Enter rock, paper or scissors");
		//String player = scan.nextLine();
		
		
		//System.out.println("Player choice is:  "+player);
		//scan.close();

		//String playerChoice = 
		ArrayList<String> handSign = new ArrayList<String>();
		handSign.add("paper");
		handSign.add("rock");
		handSign.add("scissors");
		
		//System.out.println("hand signs are "+handSign);

		// computer choice
		Random rand = new Random();
		int randChoice = rand.nextInt(handSign.size());
		String cmp = handSign.get(randChoice);
		//System.out.println("Computer choice is:  "+cmp);
		
		JOptionPane.showMessageDialog(null, "Player choice is: "+player+ "\n"+"Computer choice is: "+cmp);

		//scan.close();
	
		// conditional statement
		
			
	
			if(cmp.equals(player)) {
				JOptionPane.showMessageDialog(null, "The same choice: DRAW !");
			}
			else if(player.equals("rock") && cmp.equals("scissors")) {
				JOptionPane.showMessageDialog(null, "Rock breaks the scissors: PLAYER WINS");
			}
			else if(player.equals("scissors") && cmp.equals("rock")) {
				JOptionPane.showMessageDialog(null, "Rock breaks the scissors: COMPUTER WINS");
			}
			else if(player.equals("rock") && cmp.equals("paper")) {
				JOptionPane.showMessageDialog(null, "Paper covers the Rock: Computer WINS");
			}
			else if(player.equals("paper") && cmp.equals("rock")) {
				JOptionPane.showMessageDialog(null, "Paper covers the Rock: Player WINS");
			}
			else if(player.equals("scissors") && cmp.equals("paper")) {
				JOptionPane.showMessageDialog(null, "Scissors cut the Paper: Player WINS");
			}
			else if(player.equals("paper") && cmp.equals("scissors")) {
				JOptionPane.showMessageDialog(null, "Scissors cut the Paper: Computer WINS");
			}
		
		
	}

}
