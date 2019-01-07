import java.util.Scanner;
import java.util.Random;
import java.util.*;

class TossCoin{
	public static boolean playTossCoin(){
		Scanner sc = new Scanner(System.in);
		System.out.println("What are you betting on ? heads or tails:");
		String choice = sc.nextLine();
		choice = choice.toLowerCase();
		System.out.println("You choose " + choice);

		String result = new String();
		Random rand = new Random();
		int n = rand.nextInt(2);
		if(n == 0){
			result = "heads";
		}else{
			result = "tails";
		}
		System.out.println("The result is " + result);
		if(result.equals(choice)){
			return true;
		}else{
			return false;
		}
	}


}
