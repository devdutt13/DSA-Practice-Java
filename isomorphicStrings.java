class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
         return false;
        }
        HashMap<Character,Character> h = new HashMap();
        Set<Character> s1 = new HashSet();
        for(int i=0;i<s.length();i++){
            if(!h.containsKey(s.charAt(i)) && !s1.contains(t.charAt(i))){
                h.put(s.charAt(i),t.charAt(i));
                s1.add(t.charAt(i));
            }
            else if(h.containsKey(s.charAt(i)) && !h.get(s.charAt(i)).equals(t.charAt(i))){
                return false;
            }else if(!h.containsKey(s.charAt(i)) && s1.contains(t.charAt(i))){
                return false;
            }
        }
        return true;
        
    }
}
