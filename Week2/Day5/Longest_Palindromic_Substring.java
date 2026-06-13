class Solution {

    public String longestPalindrome(String s) {

        if (s == null || s.length() < 2) {
            return s;
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {

            int oddLength = expandFromCenter(s, i, i);
            int evenLength = expandFromCenter(s, i, i + 1);

            int currentLength = Math.max(oddLength, evenLength);

            if (currentLength > end - start + 1) {
                start = i - (currentLength - 1) / 2;
                end = i + currentLength / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandFromCenter(String text, int left, int right) {

        while (left >= 0 &&
               right < text.length() &&
               text.charAt(left) == text.charAt(right)) {

            left--;
            right++;
        }

        return right - left - 1;
    }
}
