import java.util.Scanner;

public class Main {

	//main
	public static void main(String[] args) {

		//Initialization Of Objects
		Scanner sc = new Scanner(System.in);
		Game game = new Game(sc);

		//Starting the game
		game.start();

	}

}
