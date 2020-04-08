import java.io.File;
import java.io.FileNotFoundException;

public class CodeTest
	{
		public static void main(String[] args) throws FileNotFoundException
			{
				File territories = new File("TerritoriesInput.txt");
				DealingOut.makeTerritories(territories);
				
			

				//temp game of Risk
				Player bruh = new Player("Bruh");
				
				bruh.addPlayerTerritories(DealingOut.findTerritoryByName("The West"));
				bruh.getPlayerTerritories().get(0).setNumberOfUnits(5);
				
				bruh.addPlayerTerritories(DealingOut.findTerritoryByName("Four Corners"));
				bruh.getPlayerTerritories().get(1).setNumberOfUnits(3);

				bruh.addPlayerTerritories(DealingOut.findTerritoryByName("Upper Midwest"));
				bruh.getPlayerTerritories().get(2).setNumberOfUnits(4);
				
				bruh.addPlayerTerritories(DealingOut.findTerritoryByName("Sunbelts"));
				bruh.getPlayerTerritories().get(3).setNumberOfUnits(6);
				
				Player boi = new Player("Boi");
				
				boi.addPlayerTerritories(DealingOut.findTerritoryByName("Great Lakes"));
				boi.getPlayerTerritories().get(0).setNumberOfUnits(5);
				
				boi.addPlayerTerritories(DealingOut.findTerritoryByName("Dixieland"));
				boi.getPlayerTerritories().get(1).setNumberOfUnits(3);

				boi.addPlayerTerritories(DealingOut.findTerritoryByName("Northeast"));
				boi.getPlayerTerritories().get(2).setNumberOfUnits(4);
				
				boi.addPlayerTerritories(DealingOut.findTerritoryByName("New England"));
				boi.getPlayerTerritories().get(3).setNumberOfUnits(6);
				
				Map.printMapWithInfo();
				
				Battle.chooseAttack(bruh);
				
			}

		
		
	}
