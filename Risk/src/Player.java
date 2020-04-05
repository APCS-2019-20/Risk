import java.util.ArrayList;

public class Player
{
	private String name;
	private ArrayList<Territory> playerTerritories = new ArrayList<Territory>();
	
	public Player(String n, ArrayList<Territory> pT)
	{
		name = n;
		playerTerritories = pT; 
	}
}
