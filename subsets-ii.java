class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList();
        backTrack(nums,0,new ArrayList(),res);
        return res;
    }
    public void backTrack(int[] nums, int start, List<Integer> temp, List<List<Integer>> res){
        res.add(new ArrayList(temp));
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]){
                continue;
            }
            temp.add(nums[i]);
            backTrack(nums,i+1,temp,res);
            temp.remove(temp.size()-1);
                    
        }
    }
}
