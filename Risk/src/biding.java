import java.util.ArrayList;

public class biding 
{
	static boolean choices = true;
	static int regimens = 13;
	static Player currentPlayer;
	static ArrayList <Territory> startTerritories = new ArrayList <Territory>();
	
	static public void startingOut()
	{
		System.out.println("Let the 'biding' begin! Each of you have 13 troops that you will divide however you want to across the four terrioties you choose"
				+ "\nHowever, each of your territories must have at least 1 troop residing within its boarders."
				+ "\n");
		
		currentPlayer = Runner.players.get(0);
		startTerritories.addAll(Runner.territoriesArray);
		for(Player p : Runner.players)
		{
			p.setPlayerRegimens(regimens);
		}
		
		while(choices)
			{
			  System.out.println(currentPlayer.getName() + " Choose your territory!");
			  System.out.println("These are your options: "
			  		+ "\n");
			  
			  for(int i = 0; i < startTerritories.size(); i++)
			  {
				  System.out.println(i + 1 + ") " + startTerritories.get(i).getName());
			  }
			  
			  int honey = Battle.askForNumber(startTerritories.size());
			  honey -= 1;
			  
			  currentPlayer.addPlayerTerritories(startTerritories.get(honey));
			  currentPlayer.updateTotalTerritories();
			  
			  System.out.println("Total number of troops: " + currentPlayer.getplayerRegimens()
			  		+ "\n How many troops do you want to place here? "
			  		+ "\n");
			  
			  
			  int child = 4 - currentPlayer.getTotalTerritories();
			  			  
			  int booboo = Battle.askForNumber(currentPlayer.getplayerRegimens() - child);
			  
			  startTerritories.get(honey).addUnits(booboo);
			  
				startTerritories.remove(honey);
				currentPlayer.setPlayerRegimens(currentPlayer.getplayerRegimens() - booboo);
				
			 currentPlayer = Runner.players.get((Runner.players.indexOf(currentPlayer)+1)%2);
			 
			 if(startTerritories.size() == 0)
			 {
				 choices = false;
			 }
			 else
			 {
				 choices = true;
			 }

			}
		
		for(Player p2 : Runner.players)
		{
			if(p2.getplayerRegimens() > 0)
			{
				System.out.println(" ");
				System.out.println(p2.getName() + ", since you did not place all of your troops the remainder has gone into " + p2.getPlayerTerritories().get(p2.getPlayerTerritories().size()-1).getName() + ".");
				p2.getPlayerTerritories().get(p2.getPlayerTerritories().size()-1).addUnits(p2.getplayerRegimens());

			}

		}
	}
	
	
}
