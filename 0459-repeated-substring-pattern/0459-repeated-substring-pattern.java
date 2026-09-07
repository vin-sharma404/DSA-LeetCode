class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String r= s+s;
        r=r.substring(1,r.length()-1);
        return r.contains(s);
    }
}