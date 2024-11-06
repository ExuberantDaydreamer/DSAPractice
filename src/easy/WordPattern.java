package easy;

import java.util.HashMap;

class WordPatternSolution {
    boolean wordPatternSolution(String pattern, String s) {

        String[] sArr = s.split(" ");

        if (pattern.length() != sArr.length)
            return false;

        HashMap<Character, String> patternTosArr = new HashMap<>();
        HashMap<String, Character> sArrToPattern = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char p = pattern.charAt(i);
            String st = sArr[i];
            if ((patternTosArr.containsKey(p)) && (!(patternTosArr.get(p).equals(st)))) {
                return false;
            }

            if ((sArrToPattern.containsKey(st)) && (sArrToPattern.get(st) != p)) {
                return false;
            }

            patternTosArr.put(p, st);
            sArrToPattern.put(st, p);

        }

        return true;
    }
}

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat dog";
        WordPatternSolution solution = new WordPatternSolution();
        boolean output = solution.wordPatternSolution(pattern, s);
        System.out.println("Output : " + output);
    }
}

//Description

/*

Given a pattern and a string s, find if s follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true

Example 2:

Input: pattern = "abba", s = "dog cat cat fish"
Output: false

Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false

Constraints:

1 <= pattern.length <= 300
pattern contains only lower-case English letters.
1 <= s.length <= 3000
s contains only lowercase English letters and spaces ' '.
s does not contain any leading or trailing spaces.
All the words in s are separated by a single space.

 */