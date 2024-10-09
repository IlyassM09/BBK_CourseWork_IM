import java.util.Scanner;

public class RPS{

	public static void main (String[] Arg) {

		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter Rock, Paper, Scisors");
		
		String line = input.nextLine().toUpperCase();
		
		if (!isValid(line)){
			System.out.println("Invalid input");
		} else {
			char player1Choice = line.charAt(0); 
			char player2Choice = line.charAt(1);
			
			String resultStr ="";
			
			System.out.println("player 1 chose "+ getStr(player1Choice)+" player 2 chose "+getStr(player2Choice));
			
			if (player1Choice == player2Choice) {
				resultStr =" it's a draw";
			
			} else if (
			
				player1Choice == 'R' && player2Choice == 'S'
				||
				player1Choice =='S' && player2Choice == 'P'
				|| 
				player1Choice == 'P' && player2Choice == 'R'
				){
					resultStr = "Player 1 wins";
				} else { 
					resultStr = "Player 2 wins";
				}
			
		}
	}
	
	public static String getStr (char c) {
	
		String retStr ="";
		
		switch (c){
		
		case 'R':
			retStr ="Rock";
			break;
		case 'P' : 
			retStr ="Paper";
			break;
		case 'S': 
			retStr ="Sciossor";
			break; 
		}
		
		return retStr;
			
	}
	
	public static boolean isValid (String s){
	
		if (s.length() != 2) {
			return false;
		}
		
		char c1 = s.charAt(0);
		char c2 = s.charAt(1);
		
		if (!isValid(s.charAt(0))) {
			return false;
		}
		
		if (!isValid(s.charAt(1))){
			return false;
		}
		
		return true; 
	}
	
	public static boolean isValid (char c) {
	
		boolean retVal = false;
		
		switch (c) {
		
			case 'R':
			case 'P': 
			case 'S' :
			
				retVal = true;
				break;
			default:
				retVal =false;
				break; 
		}
		
		return retVal;
	
	}

}


	



