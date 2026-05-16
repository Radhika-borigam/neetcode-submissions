class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        finding(res,ans,nums,target,0,0);
        return res;
    }
    public void finding(List<List<Integer>>res,List<Integer>ans,int nums[],int target,int sum,int index){
        if(sum==target){
            res.add(new ArrayList<>(ans));
            sum=0;
            return;
        }
        if(sum>=target||index>=nums.length){
            return;
        }
        ans.add(nums[index]);
        finding(res,ans,nums,target,sum+nums[index],index);
        ans.remove(ans.size()-1);
        finding(res,ans,nums,target,sum,index+1);
    }
}
