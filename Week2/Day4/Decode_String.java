import java.util.Stack;

class Solution {
    public String decodeString(String s) {

        Stack<Integer> numberStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder currentText = new StringBuilder();
        int currentNumber = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                currentNumber = currentNumber * 10 + (ch - '0');
            }
            else if (ch == '[') {
                numberStack.push(currentNumber);
                stringStack.push(currentText);

                currentNumber = 0;
                currentText = new StringBuilder();
            }
            else if (ch == ']') {
                int repeatTimes = numberStack.pop();
                StringBuilder previousText = stringStack.pop();

                for (int i = 0; i < repeatTimes; i++) {
                    previousText.append(currentText);
                }

                currentText = previousText;
            }
            else {
                currentText.append(ch);
            }
        }

        return currentText.toString();
    }
}
