import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> combinations = new ArrayList<>();
        buildParentheses(combinations, "", 0, 0, n);
        return combinations;
    }

    private void buildParentheses(List<String> combinations,
                                  String current,
                                  int openCount,
                                  int closeCount,
                                  int n) {

        if (current.length() == n * 2) {
            combinations.add(current);
            return;
        }

        if (openCount < n) {
            buildParentheses(combinations,
                    current + "(",
                    openCount + 1,
                    closeCount,
                    n);
        }

        if (closeCount < openCount) {
            buildParentheses(combinations,
                    current + ")",
                    openCount,
                    closeCount + 1,
                    n);
        }
    }
}
