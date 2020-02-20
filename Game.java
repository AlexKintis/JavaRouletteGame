package JavaRouletteGame;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Game{

	Table roulette = new Table(); //object initialization

	
	private int[][] table = roulette.numbers(); // Table Numbers
	protected static double money; // Money Entry
	protected static int bet; // Bet
	protected static int betType;
	protected static ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	/*
	 * Game Class Constructor
	 */
	Game() {
		// Initialize Money
		while(money > 0){
			numbers.clear();
			new Bet();
			new Round(this.betType);
		}
		
		playerStatus();
		roulette.visualize();

		

		main.sc.nextLine();
		System.out.println(main.clear);
		
	}
	
	void setGame(){
		System.out.print("Enter money: ");
		
		money = moneyCheckInput(main.sc.nextDouble());

	}
		
	double moneyCheckInput(double num) {
		while(num <= 0){
			System.out.print("Invalid input(money)\nInput: ");
			num = main.sc.nextDouble();
		}
		return num;
	}
	
	//Displays Player money and current bet and numbers selected
	void playerStatus() {
		System.out.format("MONEY : %.2f CUR BET : %.2f NUMBERS : %s\n", this.money, (double)this.bet, Arrays.toString(this.numbers.toArray()));
	}

}
