class Solution {
    private int sum(int n) {
        if (n == 0) return 0;
        return n % 10 + sum(n / 10);
    }
    public int minSwaps(int[] nums) {
        Integer[] arr = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        Arrays.sort(arr, (a, b) -> {
            int x = sum(a);
            int y = sum(b);
            if (x == y) return Integer.compare(a, b);
            return Integer.compare(x, y);
        });
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            mp.put(arr[i], i);
        }
        int ans = 0;
        int i = 0;
        while (i < nums.length) {
            if (mp.get(nums[i]) == i) {
                i++;
            } else {
                ans++;
                int j = mp.get(nums[i]);
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return ans;
    }
}