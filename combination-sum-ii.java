class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList();
        Arrays.sort(candidates);
        backTrack(candidates,target,0,res,new ArrayList<>());
        return res;
    }
    public void backTrack(int[] candidates, int target, int start, List<List<Integer>> res, List<Integer> temp){
        if(target < 0){
            return;
        }
        if(target == 0){
            res.add(new ArrayList(temp));
            return;
        }
        
        for(int i=start;i<candidates.length && candidates[i]<=target;i++){
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            temp.add(candidates[i]);
            backTrack(candidates,target-candidates[i],i+1,res,temp);
            temp.remove(temp.size()-1);
        }

    }
}
