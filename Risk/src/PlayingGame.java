import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PlayingGame
{
	public static void playingGame()
	{
		boolean isPlaying = true;
		
		
		Runner.currentPlayer = Runner.players.get(0);
		while(isPlaying)
		{

			

			System.out.println(Runner.currentPlayer.getName() + ", it's now your turn!");


			
			
			boolean currentPlay = true;
			while(currentPlay) {
			System.out.println(Runner.currentPlayer.getName() + ", what would you like to do?"
					+ "\n1) See Map and what you own"
					+ "\n2) See Full Map"
					+ "\n3) Attack"
					+ "\n4) Reinforce / End Turn");
		
			int playerChoice = Battle.askForNumber(5);
			
			switch(playerChoice) {
				case 1:
					Map.printMapWithOwner(Runner.currentPlayer);
					break;
				case 3:
					Battle.chooseAttack(Runner.currentPlayer);
					break;
				case 4:
					Reinforcing.endOfTurn();
					swapCurrentPlayer();
					currentPlay=false;
					break;
				case 2:
					Map.printMapWithInfo();
					break;
					
					
				
				
				
			}
			
			}
			
			
			
			
			
			
		}
	}

	private static void swapCurrentPlayer()
		{
			Runner.currentPlayer = Runner.players.get((Runner.players.indexOf(Runner.currentPlayer)+1)%2);
			// TODO Auto-generated method stub
			
		}
}
