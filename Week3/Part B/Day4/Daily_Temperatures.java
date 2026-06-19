import java.util.Stack;

class Solution {

    public int[] dailyTemperatures(int[] temperatures) {

        int[] answer = new int[temperatures.length];
        Stack<Integer> indexStack = new Stack<>();

        for (int currentDay = 0; currentDay < temperatures.length; currentDay++) {

            while (!indexStack.isEmpty() &&
                   temperatures[currentDay] > temperatures[indexStack.peek()]) {

                int previousDay = indexStack.pop();
                answer[previousDay] = currentDay - previousDay;
            }

            indexStack.push(currentDay);
        }

        return answer;
    }
}
