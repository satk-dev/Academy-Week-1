package introjava;
import java.util.Scanner;

public class FibonacciSequence2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//System.out.println("Please provide a number: ");
		//int a = 0;
		//int b = 1;
		//int c = scan.nextInt();
		//int fib = 0;
		
		//System.out.println(a);
		//System.out.println(b);
		
		//for (int i = 1; i < c; i++) {
			//a = b;
			//b = fib;
			//fib = a + b;
			//System.out.println(fib);
		//}
		  System.out.println("Enter a number-");
			int a = 0;
			int b = 1;
			int userInput = scan.nextInt();
			int fib = 0;
			/* This code should have 0 and 1 printed
			 * before the for loop, to complete the
			 * fibonacci sequence. For 1.6 Fib assignment,
			 * it needed to be left out
			 */
			
			for (int i = 2; i < userInput; i++) {
	            fib = a + b;
	            System.out.println(fib);
	            a = b;
				b = fib;
			
				
	        } /* Code runs based off user input, however
	        when you submit the answer it does not match what
	        system wants.*/
	}

}
