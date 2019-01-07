import java.util.*;


class RockPaperScissor{
	public static boolean playRockPaperScissor(){
		String IAplay = new String();
		Random rand = new Random();
		int n = rand.nextInt(3);
		if(n == 0)
			IAplay = "rock";
		else if(n == 1)
			IAplay = "paper";
		else
			IAplay = "scissor";

		Scanner sc = new Scanner(System.in);
		System.out.println("Rock, paper, scissor ?");
		String choice = sc.nextLine();
		choice = choice.toLowerCase();
		System.out.println("You choose : " + choice);
		System.out.println("I picked : " + IAplay);

		switch(choice){
			case "rock":
				if(IAplay == "scissor"){
					return true;
				}else{
					return false;
				}
			case "paper" :
				if(IAplay == "rock"){
					return true;
				}else{
					return false;
				}
			case "scissor":
				if(IAplay == "paper"){
					return true;
				}else{
					return false;
				}
			default : 
				return false;
			}

	}
}
