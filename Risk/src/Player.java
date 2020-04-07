import java.util.ArrayList;

public class Player
{
	private String name;
	private ArrayList<Territory> playerTerritories = new ArrayList<Territory>();
	private int totalTerritories;
	
	
	public Player(String n)
	{
		name = n;
		playerTerritories = new ArrayList<Territory>();
		totalTerritories = 0;
	}


	public String getName()
	{
		return name;
	}


	public void setName(String name)
	{
		this.name = name;
	}


	public ArrayList<Territory> getPlayerTerritories()
	{
		return playerTerritories;
	}


	public void setPlayerTerritories(ArrayList<Territory> playerTerritories)
	{
		this.playerTerritories = playerTerritories;
	}
	
		public void addPlayerTerritories(Territory territory)
			{
				this.playerTerritories.add(territory);
			}


	public int getTotalTerritories()
	{
		return totalTerritories;
	}


	public void setTotalTerritories(int totalTerritories)
	{
		this.totalTerritories = totalTerritories;
	}
	
}
