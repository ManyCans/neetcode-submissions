class Solution {
    private void backtrack(int o,int c ,int n, StringBuilder stack, List<String> res){
        if( o == n && c == n ){
            res.add(stack.toString());
            return;
        }
        if( o < n ){
            stack.append('(');
            backtrack(o+1,c,n,stack,res);
            stack.deleteCharAt(stack.length()-1);
        }
        if( c < o ){
            stack.append(')');
            backtrack(o,c+1,n,stack,res);
            stack.deleteCharAt(stack.length()-1);
        }
    }

    public List<String> generateParenthesis(int n) {

        List<String> res = new ArrayList<>();
        StringBuilder stack = new StringBuilder();
        backtrack(0,0,n,stack,res);
        return res;
    }

}
