import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> seenCharacters = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            while (seenCharacters.contains(s.charAt(right))) {
                seenCharacters.remove(s.charAt(left));
                left++;
            }

            seenCharacters.add(s.charAt(right));

            int currentLength = right - left + 1;

            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }

        return maxLength;
    }
}
