class Solution {
    public int splitArray(int[] nums, int k) {
        int l = 0, r = 0, res = 0;

        for (int num : nums) {
            l = Math.max(l, num);  // max element
            r += num;              // sum of array
        }

        res = r;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (canSplit(nums, k, mid)) {
                res = mid;
                r = mid - 1;   // try smaller largest sum
            } else {
                l = mid + 1;   // need larger sum
            }
        }

        return res;
    }

    private boolean canSplit(int[] nums, int k, int largest) {
        int subarray = 1;
        int curSum = 0;

        for (int num : nums) {
            curSum += num;

            if (curSum > largest) {
                subarray++;
                curSum = num;

                if (subarray > k) {
                    return false;
                }
            }
        }
        return true;
    }
}
