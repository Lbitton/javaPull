

class main{
	public static void main(String[] args){
		RockPaperScissor game = new RockPaperScissor();
		if(game.playRockPaperScissor() == true)
			System.out.println("You win !");
		else
			System.out.println("Pay up, loser !");
	}
}
