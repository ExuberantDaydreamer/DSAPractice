package easy;

import java.util.Arrays;
//import java.util.stream.Stream;

class LengthOfLastWordSolution {
    public int LOLWSolution(String s) {
        return (Arrays.stream(s.trim().split(" "))
                .reduce((first, second) -> second)
                .map(String::length)
                .orElse(0)
        );
    }
}

public class LengthOfLastWord {
    public static void main(String[] args) {
        LengthOfLastWordSolution solution = new LengthOfLastWordSolution();
        String s = "   fly me   to   the moon  ";
        System.out.println("Input String : " + s);
        int len = solution.LOLWSolution(s);
        System.out.println("Length of Last Word : " + len);
    }
}

//Description :

/*

Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.

Constraints:

1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.

 */