/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaRouletteGame;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {
	
	protected static Scanner sc = new Scanner(System.in);
	protected final static String clear = "\033[2J\033[H"; // ANSI
	
	public static void main(String[] args) {
		
		final String gameTitle = "The Roulette Game";
		List<String> gameChoices = Arrays.asList("1. Start new Game\n", "2. View Stats\n", "0. Exit Game\n", "<Choice> : ");
				
		Integer choice = 0;
		
		do {
			
			System.out.println(clear + gameTitle);
			gameChoices.forEach(str -> System.out.print(str));
	
			
			
			switch(choice = sc.nextInt()){
			
				case 1:
					new Game();
					break;
				case 2:
					break;
					
				case 0: 
					break;
				
			}
			
		} while(choice != 0);
		
		//Starting the game
		
	}
}
