class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int majorityElement =-1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(count==0){
                majorityElement = nums[i];
                   count++;
            }
            else if(nums[i]==majorityElement){
                count++;
            }
            
           else{
                count--;
            }
        }
        return majorityElement;
    }
}
