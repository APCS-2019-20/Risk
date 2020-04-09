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
				+ "\n 1) Yes, lets got! For Life, Liberty, and the Presuit of Happiness!"
				+ "\n 2) Nah, I would reather not ruin my friendships/relationships.");
	
		Scanner userInput = new Scanner(System.in);
			int choiceToPlay = userInput.nextInt();
	
			if(choiceToPlay == 1)
			{
				System.out.println("Alrightly then! To war it is!"
						+ "\n Do you know the rules of Risk: Civil War?"
						+ "\n 1) Oh of course I do! I use to play Risk all the time!"
						+ "\n 2) No..."
						+ "\n ");
				
		
				int knowRules = userInput.nextInt();
		
				if(knowRules == 1)
				{
					System.out.println("Great let's get started then!"
							+ "\n ");
					Introduction.introducePlayers();
				}
				
				else if(knowRules == 2)
				{
					System.out.println("");
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
		Introduction.introducePlayers();
		
		System.out.println("");
		System.out.println("Okay, so the rules to Risk: United States can be a little bit confusing."
							+ "\n The game makes more sence when you actually start playing the game."
							+ "\n Let's start out with how to set up the board. Your board looks like this: ");
		
							Map.printMapWithPlaceHolders();
							
		System.out.println("There are 8 territories you two must compete to conquer these territories in order win."
				+ "\n These terriotires are: "
				+ "\n THE WEST"
				+ "\n FOUR CORNERS"
				+ "\n UPPER MIDWEST"
				+ "\n SUNBELT"
				+ "\n GREAT LAKES"
				+ "\n DIXIELAND"
				+ "\n NORTHEAST"
				+ "\n NEW ENGLAND");
		
		System.out.println("");
		
		
		System.out.println("To Start the game each of you have to choose which territoies you wish to own."
				+ "\n However, this will rotate between the two of you, so basically whoever gets there first gets that territory...for now...;)");
			biding.startingOut();	
			turns();
	}
	
	public static void turns()
	{
		System.out.println("Okay, since you two have placed and arranged your troops/regeins how you want here is how to actually play the game.");
		System.out.println("During each players during their turn will attact and possibly take over the territory they are attacking. "
				+ "\n And other player who is being attacked must defened themselves. "
				+ "\n Then that same player will have to move around their regemins. Now remeber there has to be at least one reginime per territory."
				+ "\n Now during your turn you can choose to either do both or to move your troops. Because you can't just attack with out moving your tropps afterwards"
				+ "\n if you take the territory you are attacking."
				+ "\n How you determine who wins the battle (attack) is left up to fate. The dice will be rolled by each player. If the attacking player"
				+ "\n rolls the higher number then they calm vicotry in that battle and take the portion of the territory they are attacking. "
				+ "\n If the defendener rolls a high number they won the battle.");
		
		Scanner userInput = new Scanner(System.in);
		int understanding = userInput.nextInt();
	
		System.out.println("And that is how you basically play the game. You two get that? "
				+ "\n 1) Yes"
				+ "\n 2) No");
		
		if(understanding == 1)
		{
			System.out.println("Great then let the Civil War begin!");
		}
		
		else if(understanding == 2)
		{
			Scanner userInput2 = new Scanner(System.in);
			int dontUnderstand = userInput.nextInt();
			
			System.out.println("Okay, what do you still not fully get?"
					+ "\n 1) How turns work"
					+ "\n 2) I don't want to paly anymore");
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
