package easy;

class ValidPalindromeSolution {
    boolean validPalindromeSolution(String s) {

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        StringBuilder reverse = new StringBuilder(s);
        reverse = reverse.reverse();
        return reverse.toString().equals(s);
    }
}

public class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindromeSolution solution = new ValidPalindromeSolution();
        String input = "A man, a plan, a canal: Panama";
        System.out.println("Input : " + input);
        boolean output = solution.validPalindromeSolution(input);
        System.out.println("Output : " + output);
    }
}

//Description :

/*

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.

 */