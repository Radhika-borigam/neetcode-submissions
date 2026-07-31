class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[(i+k)%n]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=ans[i];
        }
    }
}