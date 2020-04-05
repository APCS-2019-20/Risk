import java.util.ArrayList;
import java.util.Scanner;

public class Runner
	{

		// Data sets and static variables here VVVV
		static Scanner userStringInput = new Scanner(System.in);
		static Scanner userIntInput = new Scanner(System.in);
		static ArrayList<Player> players = new ArrayList<Player>();
		
		
		public static void main(String[] args)
			{

				
				Introduction.introducePlayers();
				PlayingGame.playingGame();
				

				Map.printBlankMap();
				Map.printMapWithPlaceHolders();

			}
		
	}
