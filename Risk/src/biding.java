import java.util.ArrayList;

//HELP!!!!!!!
public class biding 
{
	static boolean choices;
	static int regimens;
	static Player currentPlayer;
	static ArrayList <Territory> startTerritories = new ArrayList <Territory>();
	
	static public void startingOut()
	{
		System.out.println("Let the 'biding' begin! Each of you have 13 regimens that you will divide however you want to across the four terrioties you choose"
				+ "\n However, each of your territories must have at least 1 regimend residing within its boarders.");
		
		currentPlayer = Runner.players.get(0);
		startTerritories.addAll(Runner.territoriesArray);
		
		while(true)
			{
			  System.out.println(currentPlayer.getName() + "Choose your territory");
			  System.out.println("These are your options: "
			  		+ "\n " + startTerritories);
				//ask to claim territory
				//give player territory 
				//ask number of troops on place
				//set troops there 
				//change players
			}
	}
	
	
}
