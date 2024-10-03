import java.util.ArrayList;
class Main3{

	public static void main(String [] args){
		ArrayList<String> actions = new ArrayList<String>();

		actions.add(" 1) Start game");
		actions.add(" 2) Resume game");
		actions.add(" 3) Pause game");
		actions.add(" 4) End game");

		GameMenu GameMenu = new GameMenu(actions);

		//GameMenu.displayMenu();
		GameMenu.getAction();

		// har gemt return value as a variable
		String s1 = GameMenu.getAction();
	}


		public void doAction(int s1){
		if(s1 == 1){
			System.out.println("Starting the game now");
		}else if(s1 == 2){
			System.out.println("Fetching previously saved game data");
		}else if(s1 == 3){
			System.out.println("Game paused");
		}else if(s1 == 4){
			System.out.println("Ending game");
		}
	}
}