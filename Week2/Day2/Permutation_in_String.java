class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] requiredChars = new int[26];
        int[] windowChars = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            requiredChars[s1.charAt(i) - 'a']++;
            windowChars[s2.charAt(i) - 'a']++;
        }

        if (matches(requiredChars, windowChars)) {
            return true;
        }

        for (int i = s1.length(); i < s2.length(); i++) {
            windowChars[s2.charAt(i) - 'a']++;
            windowChars[s2.charAt(i - s1.length()) - 'a']--;

            if (matches(requiredChars, windowChars)) {
                return true;
            }
        }

        return false;
    }

    private boolean matches(int[] first, int[] second) {
        for (int i = 0; i < 26; i++) {
            if (first[i] != second[i]) {
                return false;
            }
        }
        return true;
    }
}
