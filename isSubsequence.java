class Solution {
    public boolean isSubsequence(String s, String t) {
        Map<Character,List<Integer>> map = new HashMap();
        for(int i=0;i<t.length();i++){
            char temp = t.charAt(i);
            map.putIfAbsent(temp,new ArrayList());
            map.get(temp).add(i);
        }
        int currentPos = -1;
        int newPos = -1;
        for( int i=0;i<s.length();i++){
             if(!map.containsKey(s.charAt(i))){
                return false;
             }
             List<Integer> list = map.get(s.charAt(i));
             newPos = binarySearch(list,currentPos);
             if(newPos == -1){
                return false;
             }
             currentPos = newPos;
        }
        return true;

    }
    public int binarySearch(List<Integer> list, int currentPos){
        int low =0;
        int high = list.size()-1;
        while(low <= high){
            int mid = low +(high - low)/2;
            if(list.get(mid) > currentPos){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
     
      return  low < list.size() ? list.get(low) : -1;
    }

}
