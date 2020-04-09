import java.util.ArrayList;
import java.util.InputMismatchException;

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
						chooseTarget(possibleDepartures.get(choice -1));
					}
				}else {
					System.out.println("Not a valid index.");
				}
				}catch(InputMismatchException ex) {
					System.out.println("Not a number.");
				}
				
				
		}
		
		public static void chooseTarget(Territory territory)
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
				System.out.println("\n\n" + departee.getName() + " --> " + target.getName());
				
				Player attacker = departee.getOwner();
				Player opponent = target.getOwner();
				
				//ask for dice amount of attacker
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				int amtAttackDie = 3;
				if (departee.getNumberOfUnits() < 4)
					{
						amtAttackDie = departee.getNumberOfUnits()-1;
					}
				if (amtAttackDie != 1)
					{
						System.out.println(attacker.getName() + ", you can roll up to " + amtAttackDie
								+ " dice. How many would you like to roll?");
						amtAttackDie = askForNumber(amtAttackDie);
					} else
					{
						System.out.println(attacker.getName() + ", you can only roll one die.");
						amtAttackDie = 1;
					}
				
				
				
				//ask for dice amount of opponent
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				int amtOpponentDie = 2;
				if (target.getNumberOfUnits() < 2)
					{
						amtOpponentDie = 1;
					}
				if (amtOpponentDie == 2)
					{
						System.out.println(opponent.getName() + ", you can roll up to " + amtOpponentDie
								+ " dice. How many would you like to roll?");
						amtOpponentDie = askForNumber(amtOpponentDie);
					} else
					{
						System.out.println(opponent.getName() + ", you can only roll one die.");
						amtOpponentDie = 1;
					}
				
				//roll
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				ArrayList<Integer> AttackRolls = new ArrayList<Integer>();
				ArrayList<Integer> OpponentRolls = new ArrayList<Integer>();
				for (int i = 0; i < amtAttackDie; i++)
					{
						AttackRolls.add((int) (Math.random() * 6) + 1);
					}
				for (int i = 0; i < amtOpponentDie; i++)
					{
						OpponentRolls.add((int) (Math.random() * 6) + 1);
					}
				
				
				System.out.println();
				//print
				System.out.println(attacker.getName()+ ", you rolled:");
				printDice(AttackRolls);
				System.out.println("\n"+ opponent.getName()+ ", you rolled:");
				printDice(OpponentRolls);
				
				
				
				System.out.println("\nOutcomes:");
				//evaluate rolls
				int attackerLoss = 0;
				int opponentLoss = 0;
				
				//for loop
				//is there a number in both?
				while (AttackRolls.size() != 0 && OpponentRolls.size() != 0)
					{
						// grab the highest number from each
						int attackHigh = pullBiggest(AttackRolls);
						AttackRolls.remove(AttackRolls.indexOf(attackHigh));

						int opponentHigh = pullBiggest(OpponentRolls);
						OpponentRolls.remove(OpponentRolls.indexOf(opponentHigh));

						// the lower roll(preference bias towards the opponent) loss++
						if (attackHigh > opponentHigh)
							{
								opponentLoss++;
							} else
							{
								attackerLoss++;
							}

						// display individual outcome
						printDicePair(attackHigh, opponentHigh);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
					}
				
				//display overall losses
						
				System.out.print(attacker.getName() + ", you lost " + attackerLoss);
				System.out.print(attackerLoss != 1? " troops":" troop");
				System.out.println(" from "+ departee.getName() + ".");
				System.out.print(opponent.getName() + ", you lost " + opponentLoss);
				System.out.print(opponentLoss != 1? " troops":" troop");
				System.out.println(" from " + target.getName() + ".");
				
				//update the damage
				departee.removeUnits(attackerLoss);
				target.removeUnits(opponentLoss);
				
				
				
				//check if target is destroyed
				if(target.getNumberOfUnits() <= 0) {
					
					System.out.println("\n"+ attacker.getName() + ", "+target.getName()+ " has fallen!");
//					//change ownership
					target.swapOwnership();
					//	move troops
					int moving = amtAttackDie - attackerLoss;
					departee.removeUnits(moving);
					target.setNumberOfUnits(moving);
					return;
				}
				
				Map.printMapWithInfo();

				//	check if there are enough to try again
					if(departee.getNumberOfUnits()>1) {
						System.out.println(attacker.getName() +", would you like to attack "+target.getName()+" from "+departee.getName()+" again?\n1) Yes\n2) No");
						int answer = askForNumber(2);
						if(answer == 1) {
							Battle.attack(departee, target);
							
						}
					
					}else {
						System.out.println(attacker.getName() + ", you do not have enough troops in " + departee.getName() + " to attack again.");
					}
				
				
			}
			
			public static int askForNumber(int max) {
				boolean asking = true;
				while(asking) {
				try {
					int choice = Runner.userIntInput.nextInt();
					if(choice > 0 && choice <= max) {
						return choice;
					}else {
						System.out.println("Not a valid number.");
					}
					
					
				}catch(Exception e) {
					System.out.println("Not a number.");
					asking = false;
				}
				}
				return -1;
				
				
			}
			
			
			public static void  printDice(ArrayList<Integer> rolls) {
				
				ArrayList<String[]> dice = new ArrayList<String[]>();
				for(Integer n: rolls) {
					dice.add(asciiDie(n));
				}
				
				for(int i = 0; i < 5; i++) {
					for(String[] s: dice) {
						System.out.print(s[i] + " ");
					}
					System.out.println();
				}
				
				
				
				
			}
			
			public static int pullBiggest(ArrayList<Integer> rolls) {
				int max = Integer.MIN_VALUE;
				for(Integer n:rolls) {
					if(max<n) {
						max=n;
					}
				}
				return max;
			}
		
			public static void printDicePair(int a, int o) {
				
				String[] A = asciiDie(a);
				String[] O = asciiDie(o);
				
				System.out.println("+---------+   +---------+");
				System.out.println(A[1] + "   " + O[1]);
				System.out.print(A[2]);
				if(a>o) {
					System.out.print(" > ");
				}else {
					System.out.print(" < ");
				}
				System.out.println(O[2]);
				System.out.println(A[3] + "   " + O[3]);
				System.out.println("+---------+   +---------+");

				
				
				
				
				
				
//				System.out.print(a);
//				if(a>o) {
//					System.out.print(" > ");
//				}else {
//					System.out.print(" < ");
//				}
//				System.out.println(o);
				
				
				
			}
	
			public static String[] asciiDie(int d) {
				String out[] = new String[5];
				out[0] = "+---------+";
				
				
				//line one
				switch(d) {
					case 1:
						out[1] = "|         |";
						break;
					case 2:
					case 3:
						out[1] = "| x       |";
						break;
					default:
						out[1] = "| x     x |";
					
				}
				
				//line 2
				switch(d) {
					case 1:
					case 5:
					case 3:
						out[2] = "|    x    |";
						break;
					case 2:
					case 4:
						out[2] = "|         |";
						break;
					default:
						out[2] = "| x     x |";
					
					
				}
				
				
				
				//third line
				switch(d) {
				case 1:
					out[3] = "|         |";
					break;
				case 2:
				case 3:
					out[3] = "|       x |";
					break;
				default:
					out[3] = "| x     x |";
				
			}
				
				out[4] = "+---------+";
				
				
			return out;	
			}
	}
		
		
		
	
