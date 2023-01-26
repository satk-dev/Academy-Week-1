package introjava;
import java.util.Scanner;
public class FibonacciTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int a = 0;
		int b = 1;
		int fib;
		System.out.println("enter a number-");
		int n = scan.nextInt();
		if (n <0) {
			System.out.println("Sorry, must be a positive number!");
			
		} else {
			System.out.println(a);
			System.out.println(b);
		}
		
		for (int i = 2; i < n; i++) {
			fib = a + b;
			System.out.println(fib);
			a = b;
			b = fib;
		}

	}

}
