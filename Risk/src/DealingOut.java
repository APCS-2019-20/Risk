import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DealingOut
{
	public static void makeTerritories(File f) throws FileNotFoundException
	{
		Scanner fileReader = new Scanner(f);
		
		while(fileReader.hasNext())
		{
		String[] inputInformation = fileReader.nextLine().split("[+]");
		
		String name = inputInformation[0];
		ArrayList<String> toAccess = dealWithAcessing(inputInformation[1]);
		
		Territory temp = new Territory(name, 0, toAccess);
		Runner.territoriesArray.add(temp);
		}
		
		addTerritoryRefs();

	}

	private static ArrayList<String> dealWithAcessing(String str)
	{
		String[] eachTerritory = str.split("[%]");
		
		ArrayList<String> temp = new ArrayList<String>();
		
		for (int i = 0; i < eachTerritory.length; i++)
		{
			temp.add(eachTerritory[i]);
		}
		
		return temp;
	}
	
		public static Territory findTerritoryByName(String name)
			{
				for (Territory t : Runner.territoriesArray)
					{
						if (t.getName().equals(name))
							{
								return t;
							}

					}
				return null;

			}
		
//		private static void addInfantryEachRound()
//		{
//			int addedTroops=(int) player.getPlayerTerritories.length /3;
//		}

		private static void addTerritoryRefs()
			{
				for (Territory t : Runner.territoriesArray)
					{
						for (String n : t.getCanAccess())
							{
								t.addCanAccessTerritory(findTerritoryByName(n));
							}
					}
			
			
		}
}
