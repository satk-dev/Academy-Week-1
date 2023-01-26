package introjava;
import java.util.Scanner; // I imported the scanner too manually

public class NegNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Scanner I added manually
		// TODO Auto-generated method stub
		
		System.out.println ("Please provide a number: ");
		int input = scan.nextInt();
		
		if (input < 0) {
			System.out.println ("Negative number");
		} else if (input > 0){
			System.out.println ("Positive number");
		} else { 
			System.out.println("Neutral!");
		}
		
		scan.close();
		
		
		
		

	}

}
