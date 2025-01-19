class Solution {
    public int firstOccurence(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int mid = -1;
        int ans = -1;
        while(start<=end){
            mid = start +(end-start)/2;
            if(nums[mid] == target){
                ans = mid;
                end = mid-1;
            }else if(nums[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return ans;
    }
    public int lastOccurence(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int mid = -1;
        int ans = -1;
        while(start<=end){
            mid = start +(end-start)/2;
            if(nums[mid] == target){
                ans = mid;
                start = mid+1;
            }else if (nums[mid] > target){
                end = end -1;
            }else{
                start = mid+1;
            }
        }

        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        res[0] = firstOccurence(nums,target);
        res[1] = lastOccurence(nums,target);
        return res;
        
    }
}
