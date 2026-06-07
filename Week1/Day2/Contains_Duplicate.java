import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbersSeen = new HashSet<>();

        for (int num : nums) {
            if (numbersSeen.contains(num)) {
                return true;
            }

            numbersSeen.add(num);
        }

        return false;
    }
}
