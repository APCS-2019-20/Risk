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
			if(name.contains(" "))
			{
				String [] arrStr= name.split(" ");
				return arrStr[0].substring(0,1).toUpperCase()+ arrStr[0].substring(1,2).toLowerCase() +
						arrStr[1].substring(0,1).toUpperCase()+ arrStr[1].substring(1,2).toLowerCase();
			}
		return name.substring(0, 1).toUpperCase() + name.substring(1,3).toLowerCase();
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
	
}
