package easy;

class RansomNoteSolution {
    public boolean ransomNoteSolution(String ransomNote, String magazine) {

        StringBuilder mag = new StringBuilder(magazine);
        int counter = -1;

        for (char r : ransomNote.toCharArray()) {
            int index = mag.indexOf(String.valueOf(r));
            if (index >= 0) {
                mag.deleteCharAt(index);
                counter++;
            }
            if (counter == ransomNote.length() - 1) {
                return true;
            }
        }

        return false;
    }
}

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        RansomNoteSolution solution = new RansomNoteSolution();
        boolean output = false;
        output = solution.ransomNoteSolution(ransomNote, magazine);
        System.out.println("Output : " + output);
    }
}

//Description :

/*

Given two strings ransomNote and magazine, return true if ransomNote can be constructed
by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.

Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true

Constraints:

1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters.

 */
