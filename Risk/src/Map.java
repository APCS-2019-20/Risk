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
					"     /    WEST    |    UPPER MIDWEST   \\   | | 'V\\  | xxxx\\ ~,-'     xxxx\n" +
					"     |    xxxx    |       xxxx          |  | |   /_-' xxxx{,\n" +
					"     |    xxxx |~~|       xxxx         /   xxxx   /      <----NORTHEAST\n" +
					"     |         |  '---------,        ----  xxxx /     ~/~\\,\n" +
					"     ',        |            |~~~~~~~|    \\    ,'~~\\  /    |\n" +
					"      |        |    FOUR    |             \\_-~     `~     \\\n" +
					"      ',      ,-  CORNERS  -+             /   DIXELAND    /\n" +
					"       '_     |    xxxx    |    SUNBELT   |     xxxx    ,/\n" +
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
					"     /    WEST    |    UPPER MIDWEST   \\   | | 'V\\  | %4.4s\\ ~,-'     %4.4s\n" +
					"     |    %4.4s    |       %4.4s          |  | |   /_-' %4.4s{,\n" +
					"     |    %4.4s |~~|       %4.4s         /   %4.4s   /      <----NORTHEAST\n" +
					"     |         |  '---------,        ----  %4.4s /     ~/~\\,\n" +
					"     ',        |            |~~~~~~~|    \\    ,'~~\\  /    |\n" +
					"      |        |    FOUR    |             \\_-~     `~     \\\n" +
					"      ',      ,-  CORNERS  -+             /   DIXELAND    /\n" +
					"       '_     |    %4.4s    |    SUNBELT   |     %4.4s    ,/\n" +
					"         \\    |    %4.4s    |     %4.4s     /     %4.4s   /\n" +
					"          ~~~-'            |     %4.4s    |            /\n" +
					"              '-,_    _____|             /            \\\n" +
					"                  `~'~  \\                `--,~~~~-~~,  \\\n" +
					"                         \\/~\\      /~~~`---`         |  \\\n" +
					"                             \\    /                   \\  |\n" +
					"                              \\  |                     '\\'\n" +
					"                               `~'\n",
					t.get(7).getOwner().getName(),
					t.get(6).getOwner().getName(),
					t.get(7).getNumberOfUnits(),
					t.get(0).getOwner().getName(),
					t.get(3).getOwner().getName(),
					t.get(6).getNumberOfUnits(),
					t.get(0).getNumberOfUnits(),
					t.get(2).getNumberOfUnits(),
					t.get(4).getOwner().getName(),
					t.get(4).getNumberOfUnits(),
					t.get(1).getOwner().getName(),
					t.get(5).getOwner().getName(),
					t.get(1).getNumberOfUnits(),
					t.get(3).getOwner().getName(),
					t.get(5).getNumberOfUnits(),
					t.get(3).getNumberOfUnits()
					);
			
			
			
		}
		
		//TODO print map with just names and ownership
		
		

	}
