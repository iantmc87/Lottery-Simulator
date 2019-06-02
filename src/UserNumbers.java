import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class UserNumbers {
	
	public Set<Integer> getUserNumbers () {
		
		Scanner in = new Scanner(System.in);		
		Set<Integer> userNumbers = new HashSet<Integer>();
		int number;
		boolean exists;
		GeneratedNumbers gn = new GeneratedNumbers();
		int amountNumbers = gn.pickCount;
		int totalNumbers = gn.numberCount;
		
		System.out.print("Type your chosen " + amountNumbers + " numbers between 1 and " + totalNumbers + ", pressing enter after each number");
		
		for(int i = 0; i < 6;i++) {
			
			// try/catch statement for checking input correct data type
			try {
				
				number = in.nextInt();
				exists = userNumbers.contains(number);
			
				if(number <= 0 || number > 59) {
					
					System.out.println("Number outside of range, please choose again|");
					i--;
				} else if(exists) {
					
					System.out.print("You have already chosen this number, please choose again!");
					i--;
				} else if(!exists && (number > 0 && number <=59)) {
					
					userNumbers.add(number);
				}//end if else statements
			} catch(InputMismatchException e) {
				
				System.out.print("Number not entered, please choose again");
				i--;
				in.next();
			}//end try/catch
		}//end for loop
		
		return userNumbers;
		
	}//end method

}//end class
