
public class Introduction
{
	// Have the player receive 16 total "armies" to begin with
	public static void introducePlayers()
	{
		System.out.println("Right now, this is only a two player game. So player one, what is your name?");
		
		String playerOneName = Runner.userStringInput.nextLine();
		String playerOneNickname = makeNickname(playerOneName);
		
		Runner.players.add(new Player(playerOneName));
		System.out.println("Welcome, " + playerOneName + ". We will call you " + playerOneNickname + "\nPlayer two, what is your name?");

		
		String playerTwoName = Runner.userStringInput.nextLine();
		String playerTwoNickname = makeNickname(playerTwoName);
		

		Runner.players.add(new Player(playerTwoName)); // <--- We need to make sure that when we add more stuff to the POJO we can change it here
		System.out.println("Welcome, " + playerTwoName + ". We will call you " + playerTwoNickname);

		
		
	}
	
	private static String makeNickname(String str)
	{
		if(str.length() <= 4) return str;
		String toReturn = "";
		if (twoNames(str))
		{
			String[] twoNames = str.split(" ");
			toReturn = twoNames[0].substring(0,1) + twoNames[1].substring(0,3);
		}
		else
			toReturn = str.substring(0,4);
		
		return toReturn;
	}
	
	private static boolean twoNames (String str)
	{
		for(int i = 0; i < str.length(); i++)
		{
			if (str.substring(i, i+1).equals(" "))
			{
				return true;
			}
		}
		return false;
	}
}
