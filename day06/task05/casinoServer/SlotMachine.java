import java.util.*;

class SlotMachine{
	static public String[] playSlotMachine(){

		WheelsSlotMachine WSM = new WheelsSlotMachine();
		String result[];
		result = new String[3];

		Random rand = new Random();
                int n = rand.nextInt(WSM.Wheel1.length);
		int m = rand.nextInt(WSM.Wheel2.length);
		int o = rand.nextInt(WSM.Wheel3.length);

		result[0] = WSM.Wheel1[n];
		result[1] = WSM.Wheel2[m];
		result[2] = WSM.Wheel3[o];

		/*System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);*/

		return result;
	}
}
		/*
		if(result[0].equals(result[1]) && result[0].equals(result[2])){
			if(result[0].equals("seven")){
				System.out.println("JACKPOT");
			}else{
				System.out.println("GAGNE");
			}
			return true;
		}else{

		//	System.out.println("Gling gling gling...\n _________________________________\n  |  __    __    ___  _____   __    |\n  | / _\  / /   /___\/__   \ / _\   |\n | \ \  / /    / /  / /  / /\ \\ \  25|\n  | _\ \/ /___/ \_/ /  / /  \/_\ \ []| _\n_  | \__/\____/\___/   \/     \__/ []|(__)\n  |===_______===_______===_______===| ||\n ||*|       |*|       |*|       |*|| ||\n  ||*| ***** |*| ***** |*| ***** |*|| || ||*|"result[0]"|*|"result[1]"|*|"result[2]"|*|| ||\n ||*| ***** |*| ***** |*| ***** |*|| ||\n  ||*|_______|*|_______|*|_______|*||_/ / \n  |===_______===_______===_______===|_/\n |lc=___________________________===|\n  |  /___________________________\  |\n |   |                         |   |\n _|    \_______________________/    |_\n (_____________________________________)\n You lose..");
		
System.out.println("Gling gling gling...");
System.out.println("  _________________________________");
System.out.println("  |  __    __    ___  _____   __    |");
System.out.println("  | / _\\  \\/ /   /___\\/__   \\ / _\\   |");
System.out.println("  | \\ \\  / /   /   /   /  /\\ \\\\ \\  25|");
System.out.println("  | _\\ \\/ /___/ \\_/   / /  \\/_\\ \\ []| __");
System.out.println("  | \\__/\\____/\\___/   \\/     \\__/ []|(__)");
System.out.println("  |===_______===_______===_______===| ||");
System.out.println("  ||*|       |*|       |*|       |*|| ||");
System.out.println("  ||*| ***** |*| ***** |*| ***** |*|| ||");
System.out.println("  ||*|"+result[0]+"|*|"+result[1]+"|*|"+result[2]+"|*|| ||");
System.out.println("  ||*| ***** |*| ***** |*| ***** |*|| ||");
System.out.println("  ||*|_______|*|_______|*|_______|*||_ /");
System.out.println("  |===_______===_______===_______===|_/");
System.out.println("  |lc=___________________________===|");
System.out.println("  |  /___________________________\\  |");
System.out.println("  |   |                         |   |");
System.out.println(" _|   \\_______________________/    |_");
System.out.println("(_____________________________________)");

return false;
		}
	}
}

		*/
