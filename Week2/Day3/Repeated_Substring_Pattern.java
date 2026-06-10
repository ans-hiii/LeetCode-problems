class Solution {
    public boolean repeatedSubstringPattern(String s) {

        int length = s.length();

        for (int partLength = 1; partLength <= length / 2; partLength++) {

            if (length % partLength != 0) {
                continue;
            }

            String pattern = s.substring(0, partLength);
            StringBuilder formedString = new StringBuilder();

            int repeatCount = length / partLength;

            for (int i = 0; i < repeatCount; i++) {
                formedString.append(pattern);
            }

            if (formedString.toString().equals(s)) {
                return true;
            }
        }

        return false;
    }
}
