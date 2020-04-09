import java.text.DecimalFormat;
import java.util.ArrayList;

public class Reinforcing
{
	public static void endOfTurn()
	{
		int nextPieces = getPlayersNextPieces();
		
		Player currentPlayer = Runner.players.get(Runner.currentPlayer);
		
		System.out.println("You have " + nextPieces + " new troops to place on a territory. What territory would you like to place it on?");
		int territoryListCounter = 1;
		
		Map.printMapWithOwner(currentPlayer);
		System.out.println();
		
		for (int i = 0; i < currentPlayer.getPlayerTerritories().size(); i++)
		{

			System.out.println("(" + territoryListCounter + ")" + " " + currentPlayer.getPlayerTerritories().get(i).getName()
					+ " --> " + currentPlayer.getPlayerTerritories().get(i).getNumberOfUnits());
			territoryListCounter++;
		}
		
		int toPlace = Runner.userIntInput.nextInt() - 1;
		int previousNumberOfUnits = currentPlayer.getPlayerTerritories().get(toPlace).getNumberOfUnits();
		
		currentPlayer.getPlayerTerritories().get(toPlace).setNumberOfUnits(previousNumberOfUnits + nextPieces);
		
		System.out.println("You chose " + currentPlayer.getPlayerTerritories().get(toPlace).getName() + " to add your pieces."
				+ "\n" + currentPlayer.getPlayerTerritories().get(toPlace).getName() + " now has " + currentPlayer.getPlayerTerritories().get(toPlace).getNumberOfUnits() + " units.\n\nMap Updated!");
		
		Map.printMapWithOwner(currentPlayer);
		System.out.println();
		
		System.out.println("Would you like to reinforce by moving troops?"
				+ "\n1) Yes"
				+ "\n2) No");
		
		int wantToReinforce = Runner.userIntInput.nextInt();
		
		if (wantToReinforce == 1)
			movePieces(currentPlayer);
		else
			System.out.println("Okay, next player's turn.");
		
	}
	
	private static void movePieces(Player currentPlayer)
	{
		System.out.println("You can now move pieces from one territory to another. Usually it is supposed to be from adjacent territories, but since this map is small, you can move from any territory."
				+ "\nYou only can move from one territory to one other once."
				+ "\n"
				+ "\nWhat territory would you like to move from?");
		
		Map.printMapWithOwner(currentPlayer);
		System.out.println();
		
		int territoryListCounter = 1;
		for (int i = 0; i < currentPlayer.getPlayerTerritories().size(); i++)
		{

			System.out.println("(" + territoryListCounter + ")" + " " + currentPlayer.getPlayerTerritories().get(i).getName());
			territoryListCounter++;
		}
		
		int getToMoveFrom = Runner.userIntInput.nextInt() - 1;
		Territory moveFrom = currentPlayer.getPlayerTerritories().get(getToMoveFrom);
		
		System.out.println("Where would you like to move to?");
		Territory moveTo = currentPlayer.getPlayerTerritories().get(0);
		boolean choosingNext = true;
		
		while (choosingNext)
		{
		int getToMoveTo = Runner.userIntInput.nextInt() - 1;
			if (getToMoveFrom == getToMoveTo)
			{
				System.out.println("You have to choose a different territory to got to. Try again.");
			}
			else
			{	
				moveTo = currentPlayer.getPlayerTerritories().get(getToMoveTo);
				choosingNext = false;
				break;
			}
		}
		
		System.out.println("How many troops would you like to move?");
		boolean makingNumberOfTroops = true;
		int numberOfTroopsToMove = 0;
		
		while (makingNumberOfTroops)
		{
			numberOfTroopsToMove = Runner.userIntInput.nextInt();
			if (numberOfTroopsToMove >= moveFrom.getNumberOfUnits())
			{
				System.out.println("That is too many troops, please make sure that there will be at least one troop reamining. Try again.");
			}
			else
			{
				makingNumberOfTroops = false;
				break;
			}
		}
		
		int startTroopsOnMoveFrom = moveFrom.getNumberOfUnits();
		int startTroopsOnMoveTo = moveTo.getNumberOfUnits();
		
		moveFrom.setNumberOfUnits(startTroopsOnMoveFrom - numberOfTroopsToMove);
		moveTo.setNumberOfUnits(startTroopsOnMoveTo + numberOfTroopsToMove);
		
		System.out.println("You moved " + numberOfTroopsToMove + " units from " + moveFrom.getName() + " to " + moveTo.getName()+ "."
				+ "\n"
				+ "\nMap Updated!");
		
		Map.printMapWithOwner(currentPlayer);
		
	}

	private static int getPlayersNextPieces()
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
