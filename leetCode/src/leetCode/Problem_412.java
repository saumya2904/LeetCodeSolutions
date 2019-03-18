package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Problem_412 {

		  public static List<String> fizzBuzz(int n) {
		    // ans list
		    List<String> ans = new ArrayList<String>();

		    for (int num = 1; num <= n; num++) {

		      boolean divisibleBy3 = (num % 3 == 0);
		      boolean divisibleBy5 = (num % 5 == 0);

		      String numAnsStr = "";

		      if (divisibleBy3) {
		        // Divides by 3, add Fizz
		        numAnsStr += "Fizz";
		      }

		      if (divisibleBy5) {
		        // Divides by 5, add Buzz
		        numAnsStr += "Buzz";
		      }

		      if (numAnsStr.equals("")) {
		        // Not divisible by 3 or 5, add the number
		        numAnsStr += Integer.toString(num);
		      }

		      // Append the current answer str to the ans list
		      ans.add(numAnsStr);
		    }

		    return ans;
		  }
    public static void main(String args[]) {
    	List<String> new1 = new ArrayList<String>();
    	new1 = fizzBuzz(15);
    	for(int i =0; i<new1.size();i++) {
    		System.out.println(new1.get(i));
    	}
    }
}
