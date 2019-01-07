import java.util.*;

class RouletteWheel{
	public static boolean playRouletteWheel(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Choice ? Rules ? red, black or 0-36 ?");
		String str = sc.nextLine();
		str = str.toLowerCase();

		Random rand = new Random();
		Random rand2 = new Random();
		int n = rand.nextInt(37);
		int color;
		if(n%2 == 0){
			color = 0;
		}else{
			color = 1;
		}

		if(color == 0)
			System.out.println("ANNNNND THE WHEEL STOPS ON " + n + " RED");
		else 
			System.out.println("ANNNND THE WHEEL STOPS ON " + n + " BLACK");

		if(str.equals("rules")){
			System.out.println("You can bet on a color like RED and BLACK case. \n You can't bet on GREEN. \n Number can be choosen, it goes from 0 to 36.");
			playRouletteWheel();
		}else if(str.equals("red")){
			if(color == 0){
				return true;
			}else{
				return false;
			}
		}else if(str.equals("black")){
			if(color == 1){
				return true;
			}else{
				return false;
			}
		}else if(isInteger(str)){
			if(Integer.parseInt(str) <37){
				if(Integer.parseInt(str) == n){
					return true;
				}else{
					return false;
				}
			}else{
				
			System.out.println("Seems like you are not very familiar here..\n You have to tell my what you want to bet.\n You can bet on colors RED and BLACK or choose a number like:\n red or BLACK or b or 32...\n You can't have multiple bet nor incomprehensible bet.\n Remember that the roulette wheel have 37 cases.\n If so, I will have to ask you again...");
                        playRouletteWheel();
	}
		}else{
			System.out.println("Seems like you are not very familiar here.. \n You have to tell me what you want to bet. \n You can bet on colors RED and BLACK or choose a number. \n You can't have multiple bets nor incomprehensible bet. \n Remember that the roulette wheel have 37 cases. If i don't understand, i'll flood you again.");
			playRouletteWheel();
		}

		return false;
	}


	public static boolean isInteger(String s){
		try{
			Integer.parseInt(s);
			return true;
		}catch(NumberFormatException ex){
			return false;
		}

	}
}
