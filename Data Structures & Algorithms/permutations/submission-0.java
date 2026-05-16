class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        boolean seen[]=new boolean[nums.length];
        finding(res,ans,seen,nums);
        return res;   
    }

    public void finding(List<List<Integer>>res,List<Integer>ans,boolean seen[],int nums[]){
        if(ans.size()==nums.length){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i=0;i<nums.length;i++){
        if(!seen[i]){
            ans.add(nums[i]);
            seen[i]=true;
            finding(res,ans,seen,nums);
            seen[i]=false;
            ans.remove(ans.size()-1);
            
        }
        }
    }
}
