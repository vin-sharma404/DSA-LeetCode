class Solution {
    public String longestPrefix(String s) {
        String prefix="";
        String longestPrefix="";
        for(int i=0;i<s.length();i++){
            prefix += s.charAt(i);
            if(s.endsWith(prefix) && prefix.length() < s.length()){
                longestPrefix=prefix;
            }
        }
        return longestPrefix;
    }
}