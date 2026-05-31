class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> cal = new Stack<>();

        for(String s : tokens){
            if (s.equals("+")){
                int a = cal.pop();
                int b = cal.pop();
                cal.push(b+a);
            } 
            else if(s.equals("-")){
                int a = cal.pop();
                int b = cal.pop();
                cal.push(b-a);
            } 
            else if( s.equals("*")){
                int a = cal.pop();
                int b = cal.pop();
                cal.push(b*a);
            } 
            else if(s.equals("/")) {
                int a = cal.pop();
                int b = cal.pop();
                cal.push(b/a);
            }
            else{
                cal.push(Integer.parseInt(s));
            }
        }
        return cal.pop();
    }
}
