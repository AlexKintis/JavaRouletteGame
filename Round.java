package JavaRouletteGame;

import java.util.Random;

public class Round {

        public int result;

        Round(int betType){
            numberSelection(betType);
            this.result = GetResult();
            //Game.playerStatus();  <------------------------------------------------------------------
    		//Table.visualize();    <------------------------------------------------------------------
            System.out.println("Result: " + this.result);
        }

        void numberSelection(int betType) {
            switch(betType) {
                case 0: System.out.println("What for the next round."); break;
                case 1: straight(); break;
                // case 2: corner(); break;
                // case 3: split(); break;
                // case 4: steet(); break;
                // case 5: line(); break;
                // case 6: dozen(); break;
                // case 7: column(); break;
                // case 8: hl(); break;
                // case 9: oe(); break;
                // case 10: rb(); break;
            }
        }

        void straight() {
            System.out.print("\nYou choosed straight bet!!\nEnter a number (0-36): ");
            Game.numbers.add(main.sc.nextInt());
            System.out.println(Game.numbers);
        }

        int GetResult() {
            Random rand = new Random();
            return rand.nextInt(36) + 0;
        }
}
