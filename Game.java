import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Game{

	Table roulette = new Table(); //object initialization

	protected static Scanner sc;
	private String clear = "\033[2J\033[H"; // ANSI
	private int[][] table = roulette.numbers(); // Table Numbers
	protected static double money; // Money Entry
	protected static int bet; // Bet
	protected static int betType;
	protected static ArrayList<Integer> numbers = new ArrayList<Integer>();


	/*
	 * Game Class Constructor
	 */
	Game(Scanner sc) {

		this.sc = sc; // Parse Scanner

		// Initialize Money
		System.out.println(clear + "The Roulette The Game");
		System.out.print("Enter money: ");
		this.money = moneyCheckInput(sc.nextDouble());

		// You can play the game only if you have money.... :P
		while(this.money > 0){
			numbers.clear();
			start();
		}
	}

	double moneyCheckInput(double num) {
		while(num <= 0){
			System.out.print("Invalid input(money)\nInput: ");
			num = sc.nextDouble();
		}
		return num;
	}

	/*
	 * Start Game Function
	 */
	void start() {

		playerStatus();
		roulette.visualize();

		new Bet();
		new Round(this.betType);

		sc.nextLine();
		System.out.println(clear);
	}

	//Displays Player money and current bet and numbers selected
	void playerStatus() {
		System.out.format("MONEY : %.2f CUR BET : %.2f NUMBERS : %s\n", this.money, (double)this.bet, Arrays.toString(this.numbers.toArray()));
	}

}
