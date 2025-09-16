class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
         Collections.sort(intervals,(a,b) -> Integer.compare(a.start,b.start));

         for(int i=1;i<intervals.size();i++){
            if(intervals.get(i).start < intervals.get(i-1).end){
                return false;
            }

         }
         return true;

         
    }
}
