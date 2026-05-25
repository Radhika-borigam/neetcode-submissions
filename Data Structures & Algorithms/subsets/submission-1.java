class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        solve(res,nums,0,new ArrayList<>());
        return res;   
    }
    void solve(List<List<Integer>>res,int nums[],int i,List<Integer>ans){
        if(i==nums.length){
            res.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[i]);
        solve(res,nums,i+1,ans);
        ans.remove(ans.size()-1);
        solve(res,nums,i+1,ans);
    }
}
