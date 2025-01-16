class Solution {
    public List<List<Integer>> permute(int[] nums) {
        if(nums.length == 0){
            return Collections.emptyList();
        }
        List<List<Integer>> output = new ArrayList();
        List<Integer> temp = new ArrayList();
        backtrack(nums,output,temp);
        return output;
    }
    public void backtrack(int[] nums, List<List<Integer>> output,List<Integer> temp){
        if(temp.size()==nums.length){
            output.add(new ArrayList<>(temp));
        }else{
            for(int i=0;i<nums.length;i++){
                if(temp.contains(nums[i])){
                    continue;
                }
                temp.add(nums[i]);
                backtrack(nums,output,temp);
                temp.remove(temp.size()-1);
            }
        }
    }

}
