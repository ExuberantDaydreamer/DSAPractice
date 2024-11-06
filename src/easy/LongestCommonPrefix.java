package easy;

import java.util.Arrays;

class LCPSolution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        if (strs.length == 1)
            return strs[0];

        String result = strs[0];
        for (String s : strs) {
            while (s.indexOf(result) != 0) {
                result = result.substring(0, result.length() - 1);
                if (result.isEmpty()) {
                    return result;
                }
            }
        }
        return result;
    }
}

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        String result = "";
        LCPSolution solution = new LCPSolution();
        System.out.println("Input : " + Arrays.toString(str));

        result = solution.longestCommonPrefix(str);

        System.out.println("Output : " + result);
    }
}

//Description :

/*

Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.

 */
