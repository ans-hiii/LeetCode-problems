import java.util.Stack;

class Solution {

    public int largestRectangleArea(int[] heights) {

        Stack<Integer> indexStack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= heights.length; i++) {

            int currentHeight = (i == heights.length) ? 0 : heights[i];

            while (!indexStack.isEmpty() &&
                   currentHeight < heights[indexStack.peek()]) {

                int height = heights[indexStack.pop()];

                int width;

                if (indexStack.isEmpty()) {
                    width = i;
                } else {
                    width = i - indexStack.peek() - 1;
                }

                maxArea = Math.max(maxArea, height * width);
            }

            indexStack.push(i);
        }

        return maxArea;
    }
}
