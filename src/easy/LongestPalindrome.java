package easy;


import java.util.HashMap;

public class LongestPalindrome {

    public static int solution(String s) {
        int count = 0;
        boolean hasOdd = false;
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int freq : map.values()) {
            if (freq % 2 == 0) {
                count =+ freq;
            } else {
                count =+ freq - 1;
                hasOdd = true;
            }
        }
        return (hasOdd == true) ? count + 1 : count;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        int count = solution(s);
        System.out.println("Count : " + count);
    }
}

//Description

/*

Given a string s which consists of lowercase or uppercase letters, return the length of the longest
palindrome that can be built with those letters.
Letters are case sensitive, for example, "Aa" is not considered a palindrome.

Example 1:
Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.

Example 2:
Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.

Constraints:

1 <= s.length <= 2000
s consists of lowercase and/or uppercase English letters only.

*/