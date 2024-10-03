import java.util.Scanner;
class Main2{
	

	public static void main (String[]args){
		System.out.println("Please type your name");

	

Scanner scanner = new Scanner(System.in);
		//nextLine er for at få String(kundens navn)
		String name = scanner.nextLine();
		System.out.println("hello " + name);
		
		//nextInt er for at få tal(kundens alder)
		System.out.println("How old are you?");
		int input = scanner.nextInt();
		System.out.println("you are " + input + " years old");
		
		int retier = 67;

		System.out.println("you have " + (retier - input) + " years until retierment");
}
}