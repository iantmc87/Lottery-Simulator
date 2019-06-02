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
			//Set<Integer> userNumbers = picker.getUserNumbers();
			List<Integer> userSorted = new ArrayList<Integer>(picker.getUserNumbers());
			Collections.sort(userSorted);
			System.out.println("Your numbers:\n");
			printNumbers(userSorted);
		
			//calls on generatedNumbers class, sorts and outputs to console
			List<Integer> pickSorted = new ArrayList<Integer>(generate.randomPick());
			Collections.sort(pickSorted);
			System.out.println("\n\nWinning numbers:\n");
			printNumbers(pickSorted);
		
			//checks for matching numbers and outputs to console
			userSorted.retainAll(pickSorted);
			System.out.println("\n\nMatching Numbers:\n");
			printNumbers(userSorted);
			
			//if statement for outputting if user is a winner or not
			if(userSorted.size() >= 3) {
				System.out.print("\n\n***Congratulations you have matched " + userSorted.size() + " numbers!!!***");
			} else if(userSorted.size() > 0 && userSorted.size() <= 2) {
				System.out.print("\n\n***Unlucky you have only matched " + userSorted.size() + " numbers, better luck next time***");
			} else {
				System.out.print("\n\n***Unlucky you haven't matched any numbers, better luck next time***");
			}
		
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
