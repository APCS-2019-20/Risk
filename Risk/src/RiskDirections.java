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
	
		System.out.println("Are you ready to enter a warzone?"
				+ "\n1) Yes, let's go! For Life, Liberty, and Freedom!"
				+ "\n2) Nah, I would reather not ruin my friendships.");
	
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
					System.out.println("Great! Let's get started then!"
							+ "\n ");
				}
				
				else if(knowRules == 2)
				{
					System.out.println("");
					learnRules();
				}
		
			}
			else if(choiceToPlay == 2)
			{	
				System.out.println("Well okay then have a fun doing, well, something else?");
			}
	}
	
	public static void learnRules()
	{
		Introduction.introducePlayers();
		
		System.out.println("");
		System.out.println("Okay, so the rules to Risk: Civil War can be a little bit confusing."
							+ "\nThe game makes more sence when you actually start playing the game."
							+ "\nLet's start out with how to set up the board. Your board looks like this: ");
		
							Map.printMapWithPlaceHolders();
							
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
			biding.startingOut();	
			turns();
	}
	
	public static void turns()
	{
		System.out.println("Okay, since you two have placed and arranged your troops how you want here is how to actually play the game.");
		System.out.println("During each turn you can choose to attact and possibly take over the territory they are attacking. "
				+ "\nAnd the other player must defened themselves. "
				+ "\nThen the player whose turn it is can choose their troops, only once per turn. "
				+ "\nNow there ALWAYS has to be at least one troop per territory."
				+ "\nDuring your turn you can choose to either do both, just attack, or just move your troops."
				+ "\n"
				+ "\nWhat determines the winner of the battle (attack) is left up to fate. Dice will be rolled by each player. If the attacking player"
				+ "\nrolls the higher number then they calm vicotry in that battle and take the portion of the territory they are attacking. "
				+ "\nIf the defendener rolls a high number they won the battle.");
		
		Scanner userInput = new Scanner(System.in);
		int understanding = userInput.nextInt();
	
		System.out.println("And that is how you basically play the game. You two get that? "
				+ "\n1) Yes"
				+ "\n2) No");
		
		if(understanding == 1)
		{
			System.out.println("Great then let the Civil War begin!");
		}
		
		else if(understanding == 2)
		{
			Scanner userInput2 = new Scanner(System.in);
			int dontUnderstand = userInput.nextInt();
			
			System.out.println("Okay, what do you still not fully get?"
					+ "\n1) How turns work"
					+ "\n2) I don't want to paly anymore");
			if(dontUnderstand == 1)
			{
				turns();
			}
			else if(dontUnderstand == 2)
			{
				System.out.println("Well, it's your guys loss. This is a really fun game! Bye now!");
				System.exit(0);
			}
		
		}
		
		
	}
}
