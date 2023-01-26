package introjava;
import java.util.Scanner;
public class FibonacciSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int one = 0;
		int two = 1;
		int three = one + two;
		
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		
		while (three < 34) {
			one = two;
			two = three;
			three = one + two;
			System.out.println(three);
		
		
		}
	}

}
