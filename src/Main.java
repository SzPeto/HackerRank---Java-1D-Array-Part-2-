import java.util.Scanner;

public class Main {
	
	static int i = 0;
	static boolean bigLeap = false;
	
	public static void main(String [] args) {
		
		int[] game = {0, 0, 1, 1, 1, 0};
		int leap = 3;
		
		System.out.println(canWin(leap, game));
		
    }
	
    public static boolean canWin(int leap, int[] game) {
    	
    	while(i<game.length) {
    		
    		//Base cases
    		if(i+1 == game.length) return true;
    		else if(i+leap >=game.length) return true;
    		
    		//Decrementing i to the leftmost 0 after big leap
    		if(bigLeap) {
    			while(game[i-1] == 0) {
    				i--;
    			}
    		}
    		
    		if(game[i] == 0) {
    			
    			if(i+leap >= game.length) return true;
    			
    		}
    		
    		//Incrementing logic
    		if(game[i+1] == 0) {
    			i++;
    			bigLeap = false;
    		} else if(game[i+leap] == 0) {
    			i = i + leap; 
    			bigLeap = true;
    		}
    		
    	}
    	
    	return false;
    	
    }
	
}
