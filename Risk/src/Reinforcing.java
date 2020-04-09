import java.text.DecimalFormat;
import java.util.ArrayList;

public class Reinforcing
{
	public static void endOfTurn()
	{
		int nextPieces = getPlayersNextPieces();
	}
	
	public static int getPlayersNextPieces()
	{
		ArrayList<Territory> currentPlayersTerritories = Runner.players.get(Runner.currentPlayer).getPlayerTerritories();
		double howManyTerritories = (double) currentPlayersTerritories.size();
		
		double toDistribute = howManyTerritories / 2.0;
		
		if (toDistribute < 2.0)
		{
			toDistribute = 2.0;
		}
		else
			toDistribute = getRoundingUp(toDistribute);
		
		int toReturn = (int) toDistribute;
		return toReturn;
		
	}
	
	private static double getRoundingUp(double d)
	{
		DecimalFormat decFor = new DecimalFormat("#");
		double number = Double.parseDouble(decFor.format(d));
		
		
		return number;
	}
}
