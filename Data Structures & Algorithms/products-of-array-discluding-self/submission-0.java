class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prod = 1;
        int zeroCount = 0;

        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                prod *= num;
            }
        }

        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                nums[i] = 0;
            } else if (zeroCount == 1) {
                if (nums[i] == 0) {
                    nums[i] = prod;
                } else {
                    nums[i] = 0;
                }
            } else {
                nums[i] = prod / nums[i];
            }
        }

        return nums;
    }
}
