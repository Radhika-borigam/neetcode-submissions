class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int leftmax=height[0];
        int rightmax=height[n-1];
        int left=0;
        int right=n-1;
        int ans=0;
        while(left<=right){
            if(leftmax<rightmax){
                leftmax=Math.max(height[left],leftmax);
                ans+=leftmax-height[left];
                left++;
            }
            else{
                rightmax=Math.max(height[right],rightmax);
                ans+=rightmax-height[right];
                right--;
            }
        }
        return ans;
    }
}