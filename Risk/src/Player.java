import java.util.ArrayList;

public class Player
{
	private String name;
	private ArrayList<Territory> playerTerritories = new ArrayList<Territory>();
	private int totalTerritories;
	private String nickname;
	
	
	public Player(String n, ArrayList<Territory> pT, String nn, int tT)
	{
		name = n;
		playerTerritories = pT;
		nickname=nn;
		playerTerritories = pT;
		totalTerritories = tT;
		
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
	
	public String getNickname()
	{
		if (name.length()>= 4)
		{
		return name.substring(0, 4);
		}
		else
		{
		return name;
		}
	}


	public void setNickname(String nickname)
	{
		this.nickname = nickname;
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
