import java.util.ArrayList;

public class Map
	{

		public static void printBlankMap() {
			
			System.out.println("" +
					"           ,__                                                _,   \n" +
					"       \\~ \\|  ~~---___            ,                          | \\   \n" +
					"       |        |   ~~~~~~~|~~~~~| ~~---,                  _/   >  \n" +
					"      /         |                      / ~ \\~~/          /~|   ,'  \n" +
					"      |           \\                    {    / /~)     __-  |     \\,\n" +
					"     /            |                     \\  | | '~ \\  |      \\ _,-' \n" +
					"     |            |                     |  | |   /_-'     {,~      \n" +
					"     |         |~~|                    /    '     /      {/        \n" +
					"     |         |  '---------,        ----       /     ~/~ \\,       \n" +
					"     ',        |            |~~~~~~~|     \\    ,'~~ \\  /   |       \n" +
					"      |        |            |              \\_-~     `~     \\       \n" +
					"      ',      ,-           -+             /               /        \n" +
					"       '_     |            |              |             ,/         \n" +
					"         \\    |            |              /            /           \n" +
					"          ~~~-'            |             |            /            \n" +
					"              '-,_    _____|             /             \\           \n" +
					"                  `~'~   \\                `--,~~~~-~~,   \\         \n" +
					"                          \\/~\\      /~~~`---`         |   \\       \n" +
					"                              \\    /                    \\  |       \n" +
					"                               \\  |                      '\\'       \n" +
					"                                `~'                                "
					);
		}

		public static void printMapWithPlaceHolders() {
			System.out.println(""+
					"         ,__                                                  _, \n" +
					"      \\~\\|  ~~---___              ,                          | \\\n" +
					"       |        |   ~~~~~~~|~~~~~| ~~---, GREAT LAKES      _/   >\n" +
					"      /         |                      / ~\\~~/  |       /~|    <----NEW ENGLAND\n" +
					"      |          \\                    {    / /~)|    __-  |    \\,    xxxx\n" +
					"     /  THE WEST  |    UPPER MIDWEST   \\   | | 'V\\  | xxxx\\ ~,-'     xxxx\n" +
					"     |    xxxx    |       xxxx          |  | |   /_-' xxxx{,\n" +
					"     |    xxxx |~~|       xxxx         /   xxxx   /      <----NORTHEAST\n" +
					"     |         |  '---------,        ----  xxxx /     ~/~\\,\n" +
					"     ',        |            |~~~~~~~|    \\    ,'~~\\  /    |\n" +
					"      |        |    FOUR    |             \\_-~     `~     \\\n" +
					"      ',      ,-  CORNERS  -+             /   DIXIELAND   /\n" +
					"       '_     |    xxxx    |   SUNBELTS   |     xxxx    ,/\n" +
					"         \\    |    xxxx    |     xxxx     /     xxxx   /\n" +
					"          ~~~-'            |     xxxx    |            /\n" +
					"              '-,_    _____|             /            \\\n" +
					"                  `~'~  \\                `--,~~~~-~~,  \\\n" +
					"                         \\/~\\      /~~~`---`         |  \\\n" +
					"                             \\    /                   \\  |\n" +
					"                              \\  |                     '\\'\n" +
					"                               `~'"
					);
			
			
			
			
			
			
		}
		
		
		public static void printMapWithInfo() {
			ArrayList<Territory> t = new ArrayList<Territory>();
			String[] tNames = {
					"The West",
					"Four Corners",
					"Upper Midwest",
					"Sunbelts",
					"Great Lakes",
					"Dixieland",
					"Northeast",
					"New England"
			};
				for (String s : tNames)
					{
						t.add(DealingOut.findTerritoryByName(s));
					}
			
			
			
			
			System.out.printf(""+
					"         ,__                                                  _, \n" +
					"      \\~\\|  ~~---___              ,                          | \\\n" +
					"       |        |   ~~~~~~~|~~~~~| ~~---, GREAT LAKES      _/   >\n" +
					"      /         |                      / ~\\~~/  |       /~|    <----NEW ENGLAND\n" +
					"      |          \\                    {    / /~)|    __-  |    \\,    %4.4s\n" +
					"     /  THE WEST  |    UPPER MIDWEST   \\   | | 'V\\  | %4.4s\\ ~,-'     %4.4s\n" +
					"     |    %4.4s    |       %4.4s          |  | |   /_-' %4.4s{,\n" +
					"     |    %4.4s |~~|       %4.4s         /   %4.4s   /      <----NORTHEAST\n" +
					"     |         |  '---------,        ----  %4.4s /     ~/~\\,\n" +
					"     ',        |            |~~~~~~~|    \\    ,'~~\\  /    |\n" +
					"      |        |    FOUR    |             \\_-~     `~     \\\n" +
					"      ',      ,-  CORNERS  -+             /   DIXIELAND   /\n" +
					"       '_     |    %4.4s    |   SUNBELTS   |     %4.4s    ,/\n" +
					"         \\    |    %4.4s    |     %4.4s     /     %4.4s   /\n" +
					"          ~~~-'            |     %4.4s    |            /\n" +
					"              '-,_    _____|             /            \\\n" +
					"                  `~'~  \\                `--,~~~~-~~,  \\\n" +
					"                         \\/~\\      /~~~`---`         |  \\\n" +
					"                             \\    /                   \\  |\n" +
					"                              \\  |                     '\\'\n" +
					"                               `~'\n",
					t.get(7).getOwner() == null?"":t.get(7).getOwner().getNickname(),
					t.get(6).getOwner() == null?"":t.get(6).getOwner().getNickname(),
					t.get(7).getOwner() == null?"":t.get(7).getNumberOfUnits(),
					t.get(0).getOwner() == null?"":t.get(0).getOwner().getNickname(), 
					t.get(2).getOwner() == null?"":t.get(2).getOwner().getNickname(),
					t.get(6).getOwner() == null?"":t.get(6).getNumberOfUnits(),
					t.get(0).getOwner() == null?"":t.get(0).getNumberOfUnits(),
					t.get(2).getOwner() == null?"":t.get(2).getNumberOfUnits(),
					t.get(4).getOwner() == null?"":t.get(4).getOwner().getNickname(),
					t.get(4).getOwner() == null?"":t.get(4).getNumberOfUnits(),
					t.get(1).getOwner() == null?"":t.get(1).getOwner().getNickname(),
					t.get(5).getOwner() == null?"":t.get(5).getOwner().getNickname(),
					t.get(1).getOwner() == null?"":t.get(1).getNumberOfUnits(),
					t.get(3).getOwner() == null?"":t.get(3).getOwner().getNickname(),
					t.get(5).getOwner() == null?"":t.get(5).getNumberOfUnits(),
					t.get(3).getOwner() == null?"":t.get(3).getNumberOfUnits()
					);
			
			
			
		}
		
		
		public static void printMapWithOwner(Player owner){
			ArrayList<Territory> t = new ArrayList<Territory>();
			ArrayList<String> l = new ArrayList<String>();
			ArrayList<String> n = new ArrayList<String>();
			String[] tNames = {
					"The West",
					"Four Corners",
					"Upper Midwest",
					"Sunbelts",
					"Great Lakes",
					"Dixieland",
					"Northeast",
					"New England"};
			
				for (String s : tNames)
					{
						Territory temp = DealingOut.findTerritoryByName(s);
						t.add(temp);
						if (owner.getPlayerTerritories().contains(temp))
							{
								l.add(s.toUpperCase());
								int num = temp.getNumberOfUnits();
								n.add(num==0?"NONE":"" + num);
							} else
							{
								l.add(" ");
								n.add(" ");
							}
					}
				
				
				
				
				
			
			
			System.out.printf(""+
					"         ,__                                                  _, \n" +
					"      \\~\\|  ~~---___              ,                          | \\\n" +
					"       |        |   ~~~~~~~|~~~~~| ~~---, %11.11s      _/   >\n" +
					"      /         |                      / ~\\~~/  |       /~|    <----%11.11s\n" +
					"      |          \\                    {    / /~)|    __-  |    \\,    %4.4s\n" +
					"     /  %8.8s  |    %13.13s   \\   | | 'V\\  | %4.4s\\ ~,-'         \n" +
					"     |    %4.4s    |       %4.4s          |  | |   /_-'     {,\n" +
					"     |         |~~|                    /   %4.4s   /      <----%9.9s\n" +
					"     |         |  '---------,        ----       /     ~/~\\,\n" +
					"     ',        |            |~~~~~~~|    \\    ,'~~\\  /    |\n" +
					"      |        |    %4.4s    |             \\_-~     `~     \\\n" + 
					"      ',      ,-  %7.7s  -+             /   %9.9s   /\n" +
					"       '_     |    %4.4s    |   %8.8s   |     %4.4s    ,/\n" +
					"         \\    |            |     %4.4s     /            /\n" +
					"          ~~~-'            |             |            /\n" +
					"              '-,_    _____|             /            \\\n" +
					"                  `~'~  \\                `--,~~~~-~~,  \\\n" +
					"                         \\/~\\      /~~~`---`         |  \\\n" +
					"                             \\    /                   \\  |\n" +
					"                              \\  |                     '\\'\n" +
					"                               `~'",
					l.get(4),
					l.get(7),
					n.get(7),
					l.get(0),
					l.get(2),
					n.get(6),
					n.get(0),
					n.get(2),
					n.get(4),
					l.get(6),
					l.get(1).equals(" ")? "":"FOUR",
					l.get(1).equals(" ")? "":"CORNERS",
					l.get(5),
					n.get(1),
					l.get(3),
					n.get(5),
					n.get(3)
					);
			
			
		}
		
		
		
		//TODO print map with just names and ownership
		
		

	}
