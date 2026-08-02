class Solution {
    public int minLength(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            int n = sb.length();
            if (n > 0){
                int last=sb.charAt(n-1);
                if(((last== 'A' && ch == 'B') || (last == 'C' && ch == 'D'))){
                    sb.deleteCharAt(n - 1);   
                 }
                 else{
                    sb.append(ch);
                 }
            } else {
                sb.append(ch);            
            }
        }

        return sb.length();
    }
}