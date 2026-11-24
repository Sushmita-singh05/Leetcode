import java.util.*;

class Solution {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(nums, 0, new ArrayList<>(), result);

        return result;
    }

    public void backtrack(int[] nums, int index,
                          List<Integer> current,
                          List<List<Integer>> result) {

        // Store current subset
        result.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {

            // Include element
            current.add(nums[i]);

            // Recursive call
            backtrack(nums, i + 1, current, result);

            // Backtracking
            current.remove(current.size() - 1);
        }
    }
}