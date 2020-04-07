import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PlayingGame
{
	public static void playingGame()
	{
		boolean isPlaying = true;
		int whichPlayer = 0;
		
		while(isPlaying)
		{
			System.out.println("What would you like to do?"
					+ "\n(1) See Map and what you own"
					+ "\n(2) Attack"
					+ "\n(3) See general map");
			
			int playerChoice = Runner.userIntInput.nextInt();
			
			
			if (playerChoice == 1)
			{
				Map.printMapWithInfo();
			}
			else if(playerChoice == 2)
			{
				System.out.println("Test");
			}
			else if(playerChoice == 3)
			{
				Map.printBlankMap();
			}
		}
	}
}
