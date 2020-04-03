import java.util.ArrayList;

public class Territory
{
	private String name;
	private int numberOfUnits;
	private ArrayList<String> canAccess = new ArrayList<String>();
	
	public Territory(String n, int nOU, ArrayList<String> cA)
	{
		name = n;
		numberOfUnits = nOU;
		canAccess = cA;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getNumberOfUnits()
	{
		return numberOfUnits;
	}

	public void setNumberOfUnits(int numberOfUnits)
	{
		this.numberOfUnits = numberOfUnits;
	}

	public ArrayList<String> getCanAccess()
	{
		return canAccess;
	}

	public void setCanAccess(ArrayList<String> canAccess)
	{
		this.canAccess = canAccess;
	}
}

