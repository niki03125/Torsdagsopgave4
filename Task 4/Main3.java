import java.util.ArrayList;
class Main3{

	public static void main(String [] args){
		ArrayList<String> actions = new ArrayList<String>();

		actions.add(" 1) Start game");
		actions.add(" 2) Resume game");
		actions.add(" 3) Pause game");
		actions.add(" 4) End game");

		GameMenu GameMenu = new GameMenu(actions);

		GameMenu.displayMenu();

	}


}