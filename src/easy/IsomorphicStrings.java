package easy;

import java.util.HashMap;

class IsomorphicStringsSolution {
    public boolean isomorphicStringsSolution(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> sToT = new HashMap<>();
        HashMap<Character, Character> tToS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sToT.containsKey(sChar) && sToT.get(sChar) != tChar) {
                return false;
            }
            if (tToS.containsKey(tChar) && tToS.get(tChar) != sChar) {
                return false;
            }

            sToT.put(sChar, tChar);
            tToS.put(tChar, sChar);
        }

        return true;
    }
}

public class IsomorphicStrings {
    public static void main(String[] args) {
        IsomorphicStringsSolution solution = new IsomorphicStringsSolution();
        boolean output = solution.isomorphicStringsSolution("paper", "title");
        System.out.println("Output : " + output);
    }


}

//Description

/*

Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving
the order of characters. No two characters may map to the same character, but a character may map to itself.

Example 1:
Input: s = "egg", t = "add"
Output: true

Example 2:
Input: s = "foo", t = "bar"
Output: false

Example 3:
Input: s = "paper", t = "title"
Output: true

Constraints:

1 <= s.length <= 5 * 104
t.length == s.length
s and t consist of any valid ascii character.

*/