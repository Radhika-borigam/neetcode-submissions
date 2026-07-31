class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int left=0;
        int leftmax=0;
        int rightmax=heights[n-1];
        int right=n-1;
        int maxarea=0;
        while(left<=right){
            leftmax=Math.max(heights[left],leftmax);
            rightmax=Math.max(heights[right],rightmax);
            maxarea=Math.max(maxarea,Math.min(leftmax,rightmax)*(right-left));
            if(rightmax>leftmax){
                left++;
            }else{
                right--;
            }
        }
        
     return maxarea;

        
    }
   
}
