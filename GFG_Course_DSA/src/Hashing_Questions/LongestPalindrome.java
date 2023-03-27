package leetCodeProblems;

import java.util.HashSet;

public class LongestPalindrome {

	public static void main(String[] args) {

		String s= "abccccdd";
		System.out.println(longestPalindrome(s));
	}

	private static int longestPalindrome(String s) {

		if(s.length()==1){
            return 1;
        }

        int length = 0;
        // Create a HashSet...
        HashSet<Character> hset = new HashSet<Character>();
        // Traverse every element through the loop...
        for (int idx = 0; idx < s.length(); idx++) {
            // Convert string to character array...
            char character = s.charAt(idx);
            // If hset contains character already, emove that character & adding 2 to length...
            // It means we get pair of character which is used in palindrome...
            if (hset.contains(character)) {
                length += 2;
                hset.remove(character);
            }
            // Otherwise, add the character to the hashset...
            else {
                hset.add(character);
            }
        }
        // If the size of the set is greater than zero, move length forward...
        if (hset.size() > 0) {
            length ++;
        }
        return length;
	}

}
