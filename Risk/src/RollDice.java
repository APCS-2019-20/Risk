
public class RollDice {
	
	public static int rollOneDice()
	{
		int dice1 = (int) (Math.random() * 6) + 1;
		int diceTotal = dice1;
		return diceTotal;
	}
	
	public static int rollTwoDice()
	{
		int dice1 = (int) (Math.random() * 6) + 1;
		int dice2 = (int) (Math.random() * 6) + 1;
		int diceTotal = dice1 + dice2;
		return diceTotal;
	}
	
	public static int rollThreeDice()
	{
		int dice1 = (int) (Math.random() * 6) + 1;
		int dice2 = (int) (Math.random() * 6) + 1;
		int dice3 = (int) (Math.random() * 6) + 1;
		int diceTotal = dice1 + dice2 +dice3;
		return diceTotal;
	}

}
