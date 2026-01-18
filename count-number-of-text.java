class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        if(n==0 || k==0 || target ==0){
            return 0;
        }
        Integer[][] memo = new Integer[n+1][target+1];
        return dfs(n,k,target,0,0,memo);
    }
    public int dfs(int n, int k, int target,int sum, int dice, Integer[][] memo){
        int MOD = 1_000_000_007;
        if(dice == n){
            return sum == target ? 1 : 0;
        }
        if(sum > target){
            return 0;
        }
        if(memo[dice][sum] != null){
            return memo[dice][sum];
        }
        int ways =0;
        for(int f=1;f<=k;f++){
            ways = (ways+dfs(n,k,target,sum+f,dice+1,memo))% MOD;

        }
        memo[dice][sum] = ways;
        return ways;
       
    }
}
