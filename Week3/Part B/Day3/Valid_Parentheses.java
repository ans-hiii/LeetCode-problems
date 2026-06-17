import java.util.Stack;

class Solution {

    public boolean isValid(String s) {

        Stack<Character> brackets = new Stack<>();

        for (char currentChar : s.toCharArray()) {

            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                brackets.push(currentChar);
            } else {

                if (brackets.isEmpty()) {
                    return false;
                }

                char topBracket = brackets.pop();

                if ((currentChar == ')' && topBracket != '(') ||
                    (currentChar == '}' && topBracket != '{') ||
                    (currentChar == ']' && topBracket != '[')) {
                    return false;
                }
            }
        }

        return brackets.isEmpty();
    }
}
