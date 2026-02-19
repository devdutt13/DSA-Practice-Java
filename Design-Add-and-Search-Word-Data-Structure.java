class TrieNode{
    TrieNode[] children;
    boolean isWord;
    public TrieNode(){
        children = new TrieNode[26];
        isWord = false;
    }
}
class WordDictionary {
    private TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
        
    }

    public void addWord(String word) {
        TrieNode cur = root;
        for(char c : word.toCharArray()){
            if(cur.children[c-'a'] == null){
                cur.children[c-'a'] = new TrieNode();
            }
            cur = cur.children[c-'a'];
        }
        return cur.isWord;

    }

    public boolean search(String word) {

        return dfs(word,0, root);


    }
    public boolean dfs(String word, int j, TrieNode root){
        
    }
}
