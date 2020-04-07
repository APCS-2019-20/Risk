import java.io.File;
import java.io.FileNotFoundException;

public class CodeTest
	{
		public static void main(String[] args) throws FileNotFoundException
			{
				File territories = new File("TerritoriesInput.txt");
				DealingOut.makeTerritories(territories);
				
			
				Map.printMapWithPlaceHolders();
				
				Player temp = new Player("Bruh");
				
				temp.addPlayerTerritories(DealingOut.findTerritoryByName("Sunbelts"));
				temp.getPlayerTerritories().get(0).setNumberOfUnits(5);
				
				temp.addPlayerTerritories(DealingOut.findTerritoryByName("Four Corners"));
				temp.getPlayerTerritories().get(1).setNumberOfUnits(3);

				temp.addPlayerTerritories(DealingOut.findTerritoryByName("Upper Midwest"));
				temp.getPlayerTerritories().get(2).setNumberOfUnits(4);
				
				Map.printMapWithOwner(temp);
				
				
			}

		
		
	}
