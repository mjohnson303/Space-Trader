
/**
 * GameEngine Class runs the game and deals with all windows and controllers
 * @author Team Love is Like Sand
 * @version 1.0
 *
 */
public class GameEngine {
	private static Player player;
	private static Universe uni;
	private static UniverseMap map;
	private static UniverseMapController control;
	
	/**
	 * Main method to run the program
	 * @param args
	 */
	public static void main(String[] args) {
		GameEngine engine = new GameEngine();
	}

	/**
	 * Constructor for GameEngine Class
	 */
	public GameEngine(){
		
		IntroWindow intro = new IntroWindow();
		
		while(intro.loaded() == false)
		{
			try {
			Thread.sleep(200);
			}
			catch( Exception e)
			{
				System.err.println("bad1");
			}
		}
		
		if(intro.getState() == 0){
			CharacterCreationController controller = new CharacterCreationController();
			CharacterCreationWindow creationWindow = new CharacterCreationWindow(controller);
			uni = new Universe();
		
			while(player == null)
			{
				try {
				Thread.sleep(200);
				}
				catch( Exception e)
				{
					System.err.println("bad");
				}
				player = controller.getPlayer();
			}
			
			player.setSystem(uni.getSystems()[0]);
		}
		
		StatusBar.setPlayer(player);
		control = new UniverseMapController(player);
		map = new UniverseMap(uni,control);
	}
	
	public static void loadGame(Player p,Universe u){
		player = p;
		uni = u;
	}

}
