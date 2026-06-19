import java.util.Deque;
import java.util.LinkedList;

class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> windowIndices = new LinkedList<>();
        int[] result = new int[nums.length - k + 1];
        int resultIndex = 0;

        for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {

            while (!windowIndices.isEmpty() &&
                   windowIndices.peekFirst() <= currentIndex - k) {
                windowIndices.pollFirst();
            }

            while (!windowIndices.isEmpty() &&
                   nums[windowIndices.peekLast()] < nums[currentIndex]) {
                windowIndices.pollLast();
            }

            windowIndices.offerLast(currentIndex);

            if (currentIndex >= k - 1) {
                result[resultIndex] = nums[windowIndices.peekFirst()];
                resultIndex++;
            }
        }

        return result;
    }
}
