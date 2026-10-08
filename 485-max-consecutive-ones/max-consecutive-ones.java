class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int start = 0;
        int max = 0;

        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0) {
                max = Math.max(max, end - start);
                start = end + 1;
            }
        }

        // Check sequence after the last 0
        max = Math.max(max, nums.length - start);

        return max;
    }
}