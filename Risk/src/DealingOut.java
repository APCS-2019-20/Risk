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
}
