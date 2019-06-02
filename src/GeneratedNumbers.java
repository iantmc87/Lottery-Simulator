import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class GeneratedNumbers {

	public static int numberCount = 32;
	public static int pickCount = 6;

	/**
	 * method for generating random lottery numbers
	 * @return set of integers
	 */
	public Set<Integer> randomPick(){
		Random random = new Random();
		int selection;
		
		//create and populate the lottery numbers
		List<Integer> pick = new ArrayList<Integer>();
		Set<Integer> result = new HashSet<Integer>();
		for(int i = 1; i<=numberCount; i++) {
			
			pick.add(i);
		}//end for loop
		
		//picks the random winning lottery numbers
		for(int i = 0; i < pickCount; i++) {
			
			selection = random.nextInt(pick.size()) + 1;
			result.add(selection);
			if(result.size() == i + 1) {
				
				pick.remove(selection);
			} else {
				
				i--;
			}
		}//end for loop for picking random numbers
		
		return result;
		
	}//end randomPick method
}//end class
