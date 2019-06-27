import java.util.Scanner;

class Bet{

	Scanner sc = new Scanner(System.in);

	Bet() {
			Game.bet = betInputCheck(Game.money);
			if(Game.bet != 0){
				betType();
				System.out.print("Which bet type you choose? : ");
				Game.betType = sc.nextInt();
				while(Game.betType < 1 || Game.betType > 10) {
					System.out.print("Wrong Choice!!\n" + "Enter your choice (1-10): ");
					Game.betType = sc.nextInt();
				}
			} else {
				Game.betType = 0;
			}
	}

	int betInputCheck(double money) {

		System.out.print("Enter your bet(0-10000): ");
		int bet = sc.nextInt();

		while(bet > money){
			System.out.print("\nInsufficient Credits\n" + "Please enter a valid amount: ");
			bet = sc.nextInt();
		}
		return bet;

	}

	void betType() {
		System.out.println("\nChoose the type of bet from:  ");
		System.out.println("<1>  Straight Up Bet.\n" + "<2>  Corner Bet.\n" + "<3>  Split Bet.");
		System.out.println("<4>  Street Bet.\n" + "<5>  Line Bet.\n" + "<6>  Dozen Bet.\n" + "<7>  Column Bet.");
		System.out.println("<8>  High/Low Bet.\n" + "<9>  Even/Odd Bet.\n" + "<10> Colour Bet.\n");
	}

}
