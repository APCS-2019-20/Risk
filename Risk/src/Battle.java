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
		
		public static void attackFrom(Territory territory)
			{
				Player attacker = territory.getOwner();

//				System.out.println("Attacking from " + territory.getName());

				// choose who to attack

				// find all connected enemy territories
				ArrayList<Territory> possibleTargets = new ArrayList<Territory>();
				for (Territory t : territory.getCanAccessTerritory())
					{
						if (!t.getOwner().equals(attacker))
							{
								possibleTargets.add(t);
							}
					}
				// choose
				// print
				int index = 1;
				System.out.println("From " + territory.getName() + ", you can attack:");
				for (Territory t : possibleTargets)
					{
						System.out.println(index++ + ") " + t.getName());

					}
				System.out.println("Or:\n" + index + ") Not Attack");

				// actually choose
				int choice = Runner.userIntInput.nextInt();
				if (choice > 0 && choice <= index)
					{
						if (choice == index)
							{
								return;
							} else
							{
								attack(territory, possibleTargets.get(choice - 1));
							}
					}
			}
			
			public static void attack(Territory departee, Territory target) {
				System.out.println("succ");
				//ask for dice amount of attacker
				//ask for dice amount of opponent
				
				//roll
				//print
				
				//evaluate rolls
				//display the outcomes
				
				//check if target is destroyed
				//	change ownership
				//	move troops
				
				//	check if there are enough to try again
				//	ask to forfeit
			}
			
		}
		
		
		
	
