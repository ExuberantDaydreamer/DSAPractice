package easy;

import java.util.HashMap;

class ValidAnagramSolution {
    public boolean solution(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (int count : map.values()) {
            if (count != 0)
                return false;
        }

        return true;
    }
}

public class ValidAnagram {
    public static void main(String[] args) {
        ValidAnagramSolution solution = new ValidAnagramSolution();
        boolean output = false;
        output = solution.solution("anagram", "nagaram");
        System.out.println("Output 1 : " + output);
        output = solution.solution("rat", "car");
        System.out.println("Output 2 : " + output);
    }
}

//Description

/*

Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.

Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

*/