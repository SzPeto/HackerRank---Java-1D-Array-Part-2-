import java.util.Scanner;

public class Main {
	
	static int i = 0;
	static boolean bigLeap = false;
	
	public static void main(String [] args) {
		
		int[] game = {0, 0, 0, 0, 1, 0, 1, 1, 0};
		int leap = 3;
		
		System.out.println(canWin(leap, game));
		
    }
	
    public static boolean canWin(int leap, int[] game) {
    	
    	return canWin(leap, game, 0);
    	
    }
	
    public static boolean canWin(int leap, int[] game, int i) {
    	
    	if(i >= game.length) return true;
    	if(i < 0 || game[i] == 1) return false;
    	game[i] = 1; //Marking the visited indices
    	
    	if(canWin(leap, game, i+1)) return true;
    	if(canWin(leap, game, i+leap)) return true;
    	if(canWin(leap, game, i-1)) return true;
    	
    	return false;
    	
    }
    
}
