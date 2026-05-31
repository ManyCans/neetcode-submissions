class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        
        if(n==0){return ans;}

        Stack<String> strs = new Stack<>();
        Stack<Integer> lefts = new Stack<>();
        Stack<Integer> rights = new Stack<>();

        strs.push("(");lefts.push(1);rights.push(0);

        while(!strs.isEmpty()){
            String str = strs.pop();
            int le = lefts.pop();int ri = rights.pop();
            if(le == n){
                while(str.length() != (2 * n)){
                    str = str + ")" ;
                }
                ans.add( str );
            }
            else{
                if(le==ri){
                    str = str + "(" ;
                    le++;
                    strs.push(str);lefts.push(le);rights.push(ri);
                }
                else{
                    strs.push(str+"(");lefts.push(le+1);rights.push(ri);
                    strs.push(str+")");lefts.push(le);rights.push(ri+1);
                }
            }
        }
        return ans;
    }

}
