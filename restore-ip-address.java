class Solution {
    public List<String> restoreIpAddresses(String s) {
        if(s.length() > 12){
            return Collections.emptyList();
        }
        
        List<String> results = new ArrayList();
        backTrack(s,0,new ArrayList(),results);
        return results;
    }
    public void backTrack(String s, int start,List<String> segments, List<String> results){
        if(segments.size() ==4){
            if(start == s.length()){
                results.add(String.join(".",segments));
            }
        return;
        }
        for(int i=1;i<=3;i++){
            if(start+i<=s.length()){
                String segment = s.substring(start,start+i);
                if(isValid(segment)){
                    segments.add(segment);
                    backTrack(s,start+i,segments,results);
                    segments.remove(segments.size()-1);
                }
            }


        }

    }
    public boolean isValid(String s){
        if(s.length()>1 && s.charAt(0)=='0'){
            return false;
        }
        int number = Integer.parseInt(s);
        return number>=0 && number<=255;

    }
}
