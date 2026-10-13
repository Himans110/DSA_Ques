class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        int i = 0, j = n - 1;
        long ans = 0;
        while (i < j) {
            ans += (long) nums[j] * nums[j] - (long) nums[i] * nums[i];
            i++;
            j--;
        }
        if (i == j) {
            ans += (long) nums[i] * nums[i];
        }
        return ans;
    }
}