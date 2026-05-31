class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int tlen = temperatures.length;
        int[] res = new int[tlen];

        stack.push(0);

        
        for( int i = 1 ; i < tlen ; i++ ){
            if( temperatures[stack.peek()] >= temperatures[i] ) stack.push(i);
            else{
                while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                    int old = stack.pop();
                    res[old] = i-old ;
                }
                stack.push(i);
            }
        }
        while(!stack.isEmpty()){
            res[stack.pop()] =0;
        }
        return res;
        
    }
}
