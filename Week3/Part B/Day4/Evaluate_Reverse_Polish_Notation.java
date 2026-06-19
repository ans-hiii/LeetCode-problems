import java.util.Stack;

class Solution {

    public int evalRPN(String[] tokens) {

        Stack<Integer> numbers = new Stack<>();

        for (String token : tokens) {

            if (token.equals("+")) {
                int second = numbers.pop();
                int first = numbers.pop();
                numbers.push(first + second);

            } else if (token.equals("-")) {
                int second = numbers.pop();
                int first = numbers.pop();
                numbers.push(first - second);

            } else if (token.equals("*")) {
                int second = numbers.pop();
                int first = numbers.pop();
                numbers.push(first * second);

            } else if (token.equals("/")) {
                int second = numbers.pop();
                int first = numbers.pop();
                numbers.push(first / second);

            } else {
                numbers.push(Integer.parseInt(token));
            }
        }

        return numbers.pop();
    }
}
