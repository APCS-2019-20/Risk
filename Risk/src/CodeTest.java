import java.io.File;
import java.io.FileNotFoundException;

public class CodeTest
	{
		public static void main(String[] args) throws FileNotFoundException
			{
				
				
			
				//File territories = new File("TerritoriesInput.txt");
				File territories = new File("TerritoryInput2.txt");
				DealingOut.makeTerritories(territories);
				
			

				//temp game of Risk
				Player bruh = new Player("Bruh");
				Runner.players.add(bruh);
				
				bruh.addPlayerTerritories(DealingOut.findTerritoryByName("The West"));
				bruh.getPlayerTerritories().get(0).setNumberOfUnits(5);
				
				bruh.addPlayerTerritories(DealingOut.findTerritoryByName("Four Corners"));
				bruh.getPlayerTerritories().get(1).setNumberOfUnits(3);

				bruh.addPlayerTerritories(DealingOut.findTerritoryByName("Upper Midwest"));
				bruh.getPlayerTerritories().get(2).setNumberOfUnits(3);
				
				bruh.addPlayerTerritories(DealingOut.findTerritoryByName("Sunbelts"));
				bruh.getPlayerTerritories().get(3).setNumberOfUnits(2);
				
				Runner.players.add(bruh);
				
				Player boi = new Player("Boi");
				Runner.players.add(boi);
				
				boi.addPlayerTerritories(DealingOut.findTerritoryByName("Great Lakes"));
				boi.getPlayerTerritories().get(0).setNumberOfUnits(10);
				
				boi.addPlayerTerritories(DealingOut.findTerritoryByName("Dixieland"));
				boi.getPlayerTerritories().get(1).setNumberOfUnits(3);

				boi.addPlayerTerritories(DealingOut.findTerritoryByName("Northeast"));
				boi.getPlayerTerritories().get(2).setNumberOfUnits(4);
				
				boi.addPlayerTerritories(DealingOut.findTerritoryByName("New England"));
				boi.getPlayerTerritories().get(3).setNumberOfUnits(6);
				
				//Map.printMapWithInfo();
				
				//Battle.chooseAttack(bruh);
				Reinforcing.endOfTurn();
				Runner.players.add(boi);
				
				Map.printMapWithInfo();
				
				biding.startingOut();				
			}

		
		
	}
