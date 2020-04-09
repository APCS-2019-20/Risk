import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner
	{

		// Data sets and static variables here VVVV
		static Scanner userStringInput = new Scanner(System.in);
		static Scanner userIntInput = new Scanner(System.in);
		static ArrayList<Player> players = new ArrayList<Player>();
		static ArrayList<Territory> territoriesArray = new ArrayList<Territory>();
		static Player currentPlayer;
		
		
		public static void main(String[] args) throws FileNotFoundException
			{
				File territories = new File("TerritoriesInput.txt");
				DealingOut.makeTerritories(territories);
				RiskDirections.StartGame();
				Introduction.introducePlayers();
				biding.startingOut();
				PlayingGame.playingGame();
				
				//Introduction.introducePlayers();
				//RiskDirections.StartGame();
				//PlayingGame.playingGame();
//				Reinforcing.endOfTurn();
				
				
				
//				//print temporary information
//				for (int i = 0; i < territoriesArray.size(); i++)
//				{
//					ArrayList<String> temp = territoriesArray.get(i).getCanAccess();
//					
//					String main = territoriesArray.get(i).getName();
//					
//					System.out.println(main + " can access:");
//					for(String s: temp)
//					{
//						System.out.println(s);
//					}
//					System.out.println("\n");
//				}

			}
		
		public static void endGame()
		{
			System.out.println("Thanks for playing!");
			System.exit(0);
		}
		
	}
