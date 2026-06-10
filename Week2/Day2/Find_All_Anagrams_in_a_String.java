import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            return result;
        }

        int[] patternCount = new int[26];
        int[] windowCount = new int[26];

        for (int i = 0; i < p.length(); i++) {
            patternCount[p.charAt(i) - 'a']++;
            windowCount[s.charAt(i) - 'a']++;
        }

        if (isSame(patternCount, windowCount)) {
            result.add(0);
        }

        for (int i = p.length(); i < s.length(); i++) {

            windowCount[s.charAt(i) - 'a']++;
            windowCount[s.charAt(i - p.length()) - 'a']--;

            if (isSame(patternCount, windowCount)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }

    private boolean isSame(int[] first, int[] second) {
        for (int i = 0; i < 26; i++) {
            if (first[i] != second[i]) {
                return false;
            }
        }
        return true;
    }
}
