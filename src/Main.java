import java.util.Scanner;

public class Main {

	static int i = 0;
	
	public static void main(String [] args) {
		
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
            i = 0;
        }
        
        scan.close();
    }
	
    public static boolean canWin(int leap, int[] game) {
    	
    	while(true) {
    		
    		if(i+leap >= game.length) return true;
    		else if(game[i+leap] == 0) i = i + leap;
    		else if(game[i+1] == 0) i++;
    		else return false;
    		
    		if(canWin(leap, game)) return true;
    		else if(i>0 && game[i-1] == 0) i--;
    		else return false;
    		
    	}
    	
    }
	
}
