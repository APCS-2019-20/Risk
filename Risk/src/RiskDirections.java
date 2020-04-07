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
	}
}
