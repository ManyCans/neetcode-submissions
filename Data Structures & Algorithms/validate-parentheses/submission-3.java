class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if (s.length()%2==1){return false;}
        for(char c:s.toCharArray()){
            if(c=='(' || c=='{' ||c=='['){ st.push(c);}
            else{
                if (st.empty()){return false;}
                if(c==')' && st.peek()=='('){st.pop();}
                else if(c=='}' && st.peek()=='{'){st.pop();}
                else if(c==']' && st.peek()=='['){st.pop();}
                else{return false;}
            }
        }
        if (st.empty()){return true;}
        return false;
    }
}
