class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> st= new Stack<>();
        st.push(new StringBuilder());
        for(char ch : s.toCharArray()){
            if(ch=='('){
                st.push(new StringBuilder());
            }
            else if(ch==')'){
                StringBuilder top=st.pop().reverse();
                st.peek().append(top);
            }
            else{
                st.peek().append(ch);
            }
        }
        return st.peek().toString();
    }
}