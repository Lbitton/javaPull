
class main{
	public static void main(String[] args){
		System.out.println("Welcome to the Roulette Wheel !!! \n Tell me what you want to do.");

		RouletteWheel game = new RouletteWheel();
		if(game.playRouletteWheel() == true)
			System.out.println("You win !");
		else
			System.out.println("Pay up, loser");
	}
}
