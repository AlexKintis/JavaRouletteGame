package JavaRouletteGame;

class Table {

	private static int[][] numbers = new int[12][3];

	Table() {

		int counter = 1;

		for(int i = 0; i < 12; i++){
			for(int j = 0; j < 3; j++){
				numbers[i][j] = counter;
				counter++;
			}
		}


	}

	int[][] numbers() {
		return this.numbers;
	}

	static void visualize() {

		System.out.println("+--------------+");
		System.out.println("|       0      |");
		System.out.println("|----|----|----|");
		System.out.println("|  1 |  2 |  3 |");
		System.out.println("|  4 |  5 |  6 |");
		System.out.println("|  7 |  8 |  9 |");
		System.out.println("| 10 | 11 | 12 |");
		System.out.println("| 13 | 14 | 15 |");
		System.out.println("| 16 | 17 | 18 |");
		System.out.println("| 19 | 20 | 21 |");
		System.out.println("| 22 | 23 | 24 |");
		System.out.println("| 25 | 26 | 27 |");
		System.out.println("| 28 | 29 | 30 |");
		System.out.println("| 31 | 32 | 33 |");
		System.out.println("| 34 | 35 | 36 |");
		System.out.println("+--------------+\n");
	}

}
