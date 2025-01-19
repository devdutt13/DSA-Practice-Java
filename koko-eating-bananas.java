class Solution {
    public int calculateHours(int[] piles, int rate){
        int totalHours = 0;
        for(int i=0;i<piles.length;i++){
            totalHours += Math.ceil((double)piles[i]/(double)rate);
        }
        return totalHours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low =1;
        int high = 0;
        for(int i=0;i<piles.length;i++){
            high = Math.max(high,piles[i]);
        }
        while(low<=high){
            int mid = low + (high-low)/2;
            int hours = calculateHours(piles,mid);
            if(hours <= h){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}
