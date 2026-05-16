class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        print(res,ans,nums,0);
        return res;  
    }
    public void print(List<List<Integer>>res,List<Integer>ans,int nums[],int index){
        if(index==nums.length){
            res.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[index]);
        print(res,ans,nums,index+1);
        ans.remove(ans.size()-1);
        print(res,ans,nums,index+1);
    }
}
