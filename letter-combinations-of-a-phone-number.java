class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return Collections.emptyList();
        }
        String[] map = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> output = new ArrayList();
        String combination = "";
        output = findCombination(combination,digits,map,output);
        return output;
    }
    public List<String> findCombination(String combination, String digits, String[] map, List<String> output){
        if(digits.isEmpty()){
            output.add(combination);
            return output;
        }
        String letters = map[digits.charAt(0)-'2'];
        for(char letter : letters.toCharArray()){
            findCombination(combination+letter,digits.substring(1),map,output);
        }
         return output;
    }
}
