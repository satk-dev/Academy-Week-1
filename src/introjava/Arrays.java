package introjava;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] highScores = new int[5];
		System.out.println(highScores[0]);
	    System.out.println(highScores[2]); // printing the 3rd score in the array

	     // put values in highScore using an indexed variable
	     highScores[0] = 99;
	     highScores[1] = 98;
	     highScores[2] = 98;
	     highScores[3] = 88;
	     highScores[4] = 68;

	     // Print first highScore at index 0
	     System.out.println(highScores[0]);
	     highScores[4] = 97; // changing the last score to 97 with assignment statement

	     // Cannot change an array once its bounds have been declared
	     /* When trying to print an index that doesnt exist such as index 7, you get the following error;
	        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for
	        length 5 */
	     

	}

}
