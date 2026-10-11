class Solution {
    public int strStr(String haystack, String needle) {
        //BY KMP ALGO
        int n=haystack.length();
        int m=needle.length();
        int[] lps= buildLPS(needle);
        int i=0;
        int j=0;
        while(i<n){
            if(haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
                if(j==m){
                    return i-m;
                }
            }
            else{
                if(j==0){
                    i++;
                }
                else{
                    j=lps[j-1];
                }
            }
        }
        return -1;
    }
    
    private int[] buildLPS(String pattern){
        int n=pattern.length();
        int lps[]=new int[n];
        int len=0;
        int i=1;
        while(i<n){
            if(pattern.charAt(i)==pattern.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len==0){
                    i++;
                }
                else{
                    len=lps[len-1];
                }
            }
        }
        return lps;
    }
}