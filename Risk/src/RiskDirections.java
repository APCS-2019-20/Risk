import java.util.Scanner;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RiskDirections 
{
	
	

	public static void StartGame()
	{
		System.out.println("This is Risk: Civil War.");
	
		System.out.println("");
		System.out.println("");
		
		Introduction.introducePlayers();
		
		System.out.println(" ");
		System.out.println("Are you two ready to enter a warzone?"
				+ "\n1) Yes, let's go! For Life, Liberty, and Freedom!"
				+ "\n2) Nah, we would rather not ruin our friendship.");
	
		Scanner userInput = new Scanner(System.in);
			int choiceToPlay = userInput.nextInt();
	
			if(choiceToPlay == 1)
			{
				System.out.println("Alrightly then! To war it is!"
						+ "\nDo you know the rules of Risk: Civil War?"
						+ "\n1) Oh of course I do! I used to play Risk all the time!"
						+ "\n2) No..."
						+ "\n");
				
		
				int knowRules = userInput.nextInt();
		
				if(knowRules == 1)
				{
					System.out.println("Great! Let's get started then!");
					System.out.println(" ");
				}
				
				else if(knowRules == 2)
				{
					learnRules();
				}
		
			}
			else if(choiceToPlay == 2)
			{	
				System.out.println("Well okay then have a fun doing, well, something else...");
				System.exit(0);
			}
	}
	
	public static void learnRules()
	{		
		System.out.println("");
		
		System.out.println("Okay, so the rules to Risk: Civil War can be a little bit confusing."
							+ "\nThe game makes more sence when you actually start playing the game."
							+ "\nLet's start out with how to set up the board. Your board looks like this: ");
		
							Map.printMapWithPlaceHolders();
							
							
					try {
						Thread.sleep(1000);
						} catch (InterruptedException e) {
								
							e.printStackTrace();
						}
					
					
		System.out.println("There are 8 territories you two must fight to conquer all of these territories to win."
				+ "\nThese terriotires are: "
				+ "\n THE WEST"
				+ "\n FOUR CORNERS"
				+ "\n UPPER MIDWEST"
				+ "\n SUNBELT"
				+ "\n GREAT LAKES"
				+ "\n DIXIELAND"
				+ "\n NORTHEAST"
				+ "\n NEW ENGLAND");
		
		System.out.println("");
		
		
		System.out.println("To start the game you have to choose which territoies you wish to own."
				+ "\nHowever, this will rotate between the two of you, so basically whoever gets there first gets that territory...for now...;)");
			try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
					
				e.printStackTrace();
			}
		System.out.println("");
		System.out.println("Okay, since you two have placed and arranged your troops how you want here is how to actually play the game.");
		System.out.println("During each turn you can choose to attact and possibly take over the territory they are attacking. "
				+ "\nAnd the other player must defened themselves. "
				+ "\nThen the player whose turn it is can choose their troops, only once per turn. "
				+ "\nNow there ALWAYS has to be at least one troop per territory."
				+ "\nDuring your turn you can choose to either do both, just attack, or just move your troops."
				+ "\nWhat determines the winner of the battle (attack) is left up to fate. Each player will roll a certain number of die."
				+ "\nThis number of die are based on the number of troops in each territory. "
				+ "\nThe player that rolls the highest number on any certain die wins the battle.");
	
		System.out.println("");

		System.out.println("That is how you play the game. You two get that? "
				+ "\n1) Yes"
				+ "\n2) No");
		
		Scanner userInput = new Scanner(System.in);
		int understanding = userInput.nextInt();
		
		if(understanding == 1)
		{
			System.out.println("Great then let the Civil War begin!");
		}
		
		else if(understanding == 2)
		{			
			System.out.println(" ");
			System.out.println("Okay, what do you still not fully get?"
					+ "\n1) How everything works"
					+ "\n2) I don't want to play anymore");
			
			int dontUnderstand = userInput.nextInt();
			
			if(dontUnderstand == 1)
			{
				learnRules();
			}
			else if(dontUnderstand == 2)
			{
				System.out.println("Well, it's your guys loss. This is a really fun game! Bye now!");
				System.exit(0);
			}
		
		}
		
		
	}
}
