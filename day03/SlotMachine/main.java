

class main{
	public static void main(String[] args){
		SlotMachine game = new SlotMachine();
		if(game.playSlotMachine() == true)
			System.out.println("You win !");
		else
			System.out.println("Pay up, loser !");
	}
/*
		int ctr = 0;
		while(game.playSlotMachine() != true){
			game.playSlotMachine();
			ctr++;
			System.out.println(ctr);
		}
		System.out.println(ctr);
	}*/
}
