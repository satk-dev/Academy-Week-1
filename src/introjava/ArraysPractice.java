package introjava;
import java.util.Scanner;
public class ArraysPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		// WAP to add 10 numbers to an array
		   // and print all even numbers out of it
		   //Length: 10
		   int[] nums = new int[10];
		   //Last Index: 9 (Length - 1)
		   //nums.length = 10
		   for(int i = 0; i <= nums.length - 1; i++) {
		  	 nums[i] = scan.nextInt();
		   	
		   }
		   for(int i = 0; i <= nums.length - 1; i++) {
		   	
		  	 if(nums[i] % 2 == 0) {
		  		 System.out.println(nums[i]);
		  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		  		 

	}

}
}
}