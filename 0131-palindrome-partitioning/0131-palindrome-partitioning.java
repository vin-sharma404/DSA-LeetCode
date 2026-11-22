class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>(); 
        List<String> curr = new ArrayList<>();
        backtrack(0,s,res,curr);
        return res;
    }
    public void backtrack(int partIndex, String s, List<List<String>> res, List<String> current){
        if(partIndex==s.length()){
            res.add(new ArrayList<>(current));
            return;
        }
        for(int end=partIndex;end<s.length();end++){
            if(isPalindrome(partIndex,end,s)){
                current.add(s.substring(partIndex,end+1));
                backtrack(end+1,s,res,current);
                current.remove(current.size()-1);
            }
        }
    }
    public boolean isPalindrome(int start, int end, String s){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}