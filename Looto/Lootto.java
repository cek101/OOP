import java.util.Random;

public class Lootto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the Lotto number printing game!");
		System.out.println(" ");
		
		Random mega = new Random();
		Random power = new Random();
        
        int m = mega.nextInt(50)+1;
        int p = power.nextInt(70)+1;
       

        //Print out 10 random numbers
        for (int i = 1; i <= 5; i++) {
            int x = mega.nextInt(50) + 1;
            System.out.println("Megamill numbers are: " + x );
        }
        
        System.out.println("");
   
        
        for (int n = 1; n <= 5; n++) {
        	int b = power.nextInt(70) + 1;
        	System.out.println("Powerball numbers are: " + b);
        }
	
	}	
}