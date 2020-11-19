
import java.util.Scanner;

public class ExTest {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		boolean continueLoop = true;
		do {
			try {
				System.out.println("Please enter a factor a");
				double a = input.nextDouble();
				
				System.out.println("Please enter a factor b");
				double b = input.nextDouble();	
				
				System.out.println("Please enter a factor c");
				double c = input.nextDouble();
				
				QuadraticEquation ptr = new QuadraticEquation(a, b, c);
				ptr.solve();
		
				continueLoop = false;
				
			}catch(ArithmeticException e) {
//				input.nextDouble();
				System.out.println("The factor a must be greater than zero ");
			}
		}while(continueLoop);
		
	}//end method main
	
}//end class ExTest
