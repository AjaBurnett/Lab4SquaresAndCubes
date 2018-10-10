import java.util.Scanner;

public class SquaresAndCubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Learn your squares and cubes!");
		
		String answer;
		do {
		int x;
		System.out.println("Please enter an integer");
		Scanner in = new Scanner(System.in);
	      x = in.nextInt();
	     
	      int n;
	     
	      System.out.println("Number      \tSquared      \tCubed");
	      System.out.println("=======         ========        ======");
	      for (n = 1; n <= x; ++n) {
		 System.out.print(n);	
	     System.out.print("                 " + (int)Math.pow(n, 2));
	     System.out.println("            " + (int) Math.pow(n, 3));	
	    
	     
	    
	      }
		
	      System.out.println("Continue? (y/n)");
			answer = in.next();
		     
		} while (answer.equalsIgnoreCase("y"));
	     
		System.out.println("Goodbye");
	     
	      
	      
	    
	     
	      
		
		
	
		
		

	}

}
