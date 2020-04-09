import java.util.ArrayList;

public class Player
{
	private String name;
	private String nickname;
	private ArrayList<Territory> playerTerritories = new ArrayList<Territory>();
	private int totalTerritories;

	private int playerRegimens;


	
	

	public Player(String n, ArrayList<Territory> pT, String nn, int tT)
	{
		name = n;
		playerTerritories = pT;
		nickname=nn;
		playerTerritories = pT;
		totalTerritories = tT;
		
	}


	public Player(String n)
	{
		name = n;
		playerTerritories = new ArrayList<Territory>();
		totalTerritories = 0;
		playerRegimens = 0;

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
				territory.setOwner(this);
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
	
	public int getplayerRegimens()
	{
		return playerRegimens;
	}
	
	public void setPlayerRegimens(int playerRegimens)
	{
		this.playerRegimens = playerRegimens;
	}


	public void updateTotalTerritories() 
	{
		this.totalTerritories = this.playerTerritories.size();
	}


	public void removePlayerTerritories(Territory territory)
		{
			this.playerTerritories.remove(territory);
			
		}
	
}
