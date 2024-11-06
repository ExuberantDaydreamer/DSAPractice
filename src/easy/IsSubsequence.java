package easy;

class IsSubsequenceSolution {
    public boolean isSubsequence(String s, String t) {
        if (s == null || t == null || (s.length() > 1 && t.length() < 1))
            return false;

        int i = 0;
        int j = t.indexOf(s.charAt(0));

        while ((i < s.length()) && (j < t.length())) {
            if (s.charAt(i) == t.charAt(j))
                i++;
            j++;
        }
        return i == s.length();
    }
}

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        boolean output = false;
        IsSubsequenceSolution solution = new IsSubsequenceSolution();

        System.out.println("Input s : " + s);
        System.out.println("Input t : " + t);
        output = solution.isSubsequence(s, t);
        System.out.println("Output : " + output);

    }
}

//Description :

/*

Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by deleting
some (can be none) of the characters without disturbing the relative positions of the remaining
characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false

Constraints:

0 <= s.length <= 100
0 <= t.length <= 104
s and t consist only of lowercase English letters.

Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 109,
and you want to check one by one to see if t has its subsequence. In this scenario, how would you change your code?

 */