class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        for(int i=0;i<k;i++){
            char ch= s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        int maxCount=count;
        for(int j=k;j<s.length();j++){
            char add=s.charAt(j);
            if(add=='a' || add=='e' || add=='i' || add=='o' || add=='u'){
                count++;
            }
            char del=s.charAt(j-k);
            if(del=='a' || del=='e' || del=='i' || del=='o' || del=='u'){
                count--;
            }
            maxCount=Math.max(count,maxCount);
        }
        return maxCount;
    }
}