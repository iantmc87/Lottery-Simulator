import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		UserNumbers picker = new UserNumbers();
		GeneratedNumbers generate = new GeneratedNumbers();
		String restart = "y";
		
		while(restart.equalsIgnoreCase("y")) {
		
			//calls on userNumbers class, sorts and outputs to console
			Set<Integer> userNumbers = picker.getUserNumbers();
			List<Integer> userSorted = new ArrayList<Integer>(userNumbers);
			Collections.sort(userSorted);
			System.out.println("Your numbers:\n");
			printNumbers(userSorted);
		
			//calls on generatedNumbers class, sorts and outputs to console
			Set<Integer> pickNumbers = generate.randomPick();
			List<Integer> pickSorted = new ArrayList<Integer>(pickNumbers);
			Collections.sort(pickSorted);
			System.out.println("\n\nWinning numbers:\n");
			printNumbers(pickSorted);
		
			//checks for matching numbers and outputs to console
			userSorted.retainAll(pickSorted);
			System.out.println("\n\nMatching Numbers:\n");
			printNumbers(userSorted);
		
			System.out.print("\n\n\nTo try more numbers press Y or press any other key to exit\n\n");
			restart = in.nextLine();
		}//end while loop
		
		System.out.print("You are now exiting the program......");
		
		in.close();
		
	}//end main
	
	/**
	 * Method for iterating and printing numbers to the console
	 * @param print
	 */
	private static void printNumbers(List<Integer> print) {
		
		for(Integer myInt : print) {
			
			System.out.print(myInt + " ");
		}//end for loop
	}//end printNumbers method
}//end class
