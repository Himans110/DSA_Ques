class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = -1;
        for(int i : nums){
            max = Math.max(max, i);
        }
        int sum = max;
        for(int i = 1; i < k; i++){
            max += 1;
            sum += max;
        }
        return sum;
    }
}