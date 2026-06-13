class Solution {
    public int compress(char[] chars) {

        int writeIndex = 0;
        int readIndex = 0;

        while (readIndex < chars.length) {

            char currentChar = chars[readIndex];
            int count = 0;

            while (readIndex < chars.length && chars[readIndex] == currentChar) {
                count++;
                readIndex++;
            }

            chars[writeIndex] = currentChar;
            writeIndex++;

            if (count > 1) {
                String countString = String.valueOf(count);

                for (char digit : countString.toCharArray()) {
                    chars[writeIndex] = digit;
                    writeIndex++;
                }
            }
        }

        return writeIndex;
    }
}
