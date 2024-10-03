import java.util.Scanner;
import java.util.ArrayList;
class GameMenu{


	private ArrayList<String> actions;

	GameMenu(ArrayList<String> actions){
		this.actions = actions;

	}

	public void displayMenu(){
		for(String s : actions){
			System.out.println(s);
		}
	}

	public String getAction(){

		Scanner scan = new Scanner(System.in);
		System.out.println("Type a number to choose an action");
		displayMenu();	//opgave 5 viser alle mulighederne inden man vælger.
		//int number = Integer.parseInt(scan.nextLine());

		String input = scan.nextLine();


		System.out.println(actions.get(0));
		
		return input;

	}


}