import java.util.ArrayList;

public class Battle
	{

		public static void chooseAttack(Player attacker) {
			
			
			
				// find all possible territories that have more than two troops
				ArrayList<Territory> possibleDepartures = new ArrayList<Territory>();
				for (Territory t : attacker.getPlayerTerritories())
					{
						if (t.getNumberOfUnits() >= 2)
							{
								// prune out the ones that don't connect to enemy territory
								boolean hasEnemyAdjacent = false;
								for (Territory n : t.getCanAccessTerritory())
									{
										if (!n.getOwner().equals(attacker))
											{
												hasEnemyAdjacent = true;
												break;
											}
									}
								if (hasEnemyAdjacent)
									{
										possibleDepartures.add(t);
									}
							}

					}

				// choose a territory
				
				//print options
				System.out.println(attacker.getName() + ", you can attack from:");
				int index = 1;
				for (Territory t : possibleDepartures)
					{
						System.out.println(index++ + ") " + t.getName());
					}
				System.out.println("Or:\n"+index+") Not Attack");
			
				//choose option
				try{
				int choice = Runner.userIntInput.nextInt();
				if(choice >0 && choice <= index) {
					if(choice == index) {
						return;
					}else {
						attackFrom(possibleDepartures.get(choice -1));
					}
				}else {
					System.out.println("Not a valid index.");
				}
				}catch(Exception ex) {
					System.out.println("Not a number.");
				}
				
				
		}
		
		public static void attackFrom(Territory territory) {
			System.out.println("Attacking from " + territory.getName());
			
		}
		
		
		
	}
