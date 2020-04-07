import java.util.Scanner;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RiskDirections 
{
	
	static JFrame frame = new JFrame();

	public static void main(String[] args) 
	{
		System.out.println("This is Risk: United States.");
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Are you ready to enter a warzone?"
				+ "\n 1) Yes, lets got! For Life, Liberty, and the Presuit of Happiness!"
				+ "\n 2) Nah, I would reather not ruin my friendships/relationships.");
		
		Scanner userInput = new Scanner(System.in);
			int choiceToPlay = userInput.nextInt();
		
		if(choiceToPlay == 1)
		{
			System.out.println("Alrightly then! To war it is!"
					+ "\n Do you know the rules of Risk: United States?"
					+ "\n 1) Oh of course I do! I use to play it all the time!"
					+ "\n 2) No...");
			
			int knowRules = userInput.nextInt();
			
			if(knowRules == 1)
			{
				System.out.println("Great let's get started then!");
			}
			else if(knowRules == 2)
			{
				learnRules();
			}
			
		}
		else if(choiceToPlay == 2)
		{
			System.out.println("Well okay then have a fun doing...something else?");
		}
		

	}

	public static void learnRules()
	{
		System.out.println("Okay, so the rules to Risk: United States can be a little bit confusing."
							+ "\n The game makes more sence when you actually start playing the game."
							+ "\n Let's start out with how to set up the board. Your board looks like this: ");
		
							ImageIcon RiskMap = new ImageIcon(("RiskMap.jpg"));
								JOptionPane.showMessageDialog(frame, "Risk: United States of America", null,
									JOptionPane.QUESTION_MESSAGE, RiskMap);		
		
	}
}
