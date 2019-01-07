import java.util.*;

class main{
	public static void main(String[] args){
		System.out.println("Welcome to Las Agna Casino \n Hey Pal, wanna play a game ? yes or no ?");
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
		choice = choice.toLowerCase();
		while(!choice.equals("yes") && !choice.equals("no")){
			System.out.println("Say again ?");
			choice = sc.nextLine();
			choice = choice.toLowerCase();
		}

		if(choice.equals("yes")){
			String gameChoice = "";
                        System.out.println("Type 1 for Tossing Coin, 2 for RockPaperScissor, 3 for Roulette Wheel and 4 for Slot Machine \n If you want to leave, press q");
                        while(!gameChoice.equals("q")){
                                gameChoice = sc.nextLine();
                                if(gameChoice.equals("1")){
                     			 TossCoin game = new TossCoin();
                       			 if(game.playTossCoin() == true)
                               			 System.out.println("You win !");
                       			 else
                               			 System.out.println("you lose, pay up !");
        			}else if(gameChoice.equals("2")){
					RockPaperScissor game = new RockPaperScissor();
					if(game.playRockPaperScissor() == true)
						System.out.println("You win !");
					else
						System.out.println("Pay up, loser !");	
	       	                }else if(gameChoice.equals("3")){
					RouletteWheel game = new RouletteWheel();
					if(game.playRouletteWheel() == true)
						System.out.println("You win !");	
					else
						System.out.println("Pay up, loser");
                                }else if(gameChoice.equals("4")){
					SlotMachine game = new SlotMachine();
					if(game.playSlotMachine() == true)
						System.out.println("You win !");
					else
						System.out.println("Pay up, loser !");
                                }
			System.out.println("Type 1 for Tossing Coin, 2 for RockPaperScissor, 3 for Roulette Wheel and 4 for Slot Machine \n If you want to stop, press q ");
                      	System.out.println("");
 }
			System.out.println("You'll be back. I can tell");
		}else{
			System.out.println("Your loss, boyo.");
		}

	}
}
