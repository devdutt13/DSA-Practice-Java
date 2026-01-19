class Solution {
    int MOD = 1_000_000_007;
    public int countTexts(String pressedKeys) {
        int[] repetitions = new int[] {0,0,3,3,3,3,3,4,3,4};
        int[] memo=new int[pressedKeys.length()+1];
        return dfs(0,repetitions,pressedKeys,memo);

    }
    public int dfs(int index,int[] rep, String s, int[] memo){
        if(index==s.length()){
            return 1;
        }
        if(memo[index] != 0){
            return memo[index];
        }
        int count =0;
        int number = s.charAt(index) - '0';
        int key = rep[number];
        for(int i=0;i<key && index+i<s.length() && s.charAt(index) == s.charAt(index+i); i++){
            count += dfs(index+i+1,rep,s,memo);
            count %= MOD;
        }
        return memo[index] = count;
    }
}
