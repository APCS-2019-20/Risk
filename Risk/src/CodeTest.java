import java.io.File;
import java.io.FileNotFoundException;

public class CodeTest
	{
		public static void main(String[] args) throws FileNotFoundException
			{
				File territories = new File("TerritoriesInput.txt");
				DealingOut.makeTerritories(territories);
				
				Map.printBlankMap();
				Map.printMapWithPlaceHolders();
				Map.printMapWithInfo();
				
				
			}

		
		
	}
