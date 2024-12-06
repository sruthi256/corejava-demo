package assesment2;
import java.util.*;
/**
* Author : Kopparapu.Sruthi
* Date   : 15 Nov 2024
* Time   : 10:08:18 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class LongestSubString {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int maxLength = 0, left = 0;
 
        for (int right = 0; right < n; right++) {
            // If the character is already in the set, shrink the window
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            // Add the current character to the set and calculate the length
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
 
    public static void main(String[] args) {
        // Example test cases
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input string:");
        String input = scanner.nextLine();
        System.out.println(lengthOfLongestSubstring(input));
        scanner.close();
    }
}