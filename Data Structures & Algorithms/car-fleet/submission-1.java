class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int pl = position.length;
        int[][] pair = new int[pl][2];
        
        for(int i=0;i<pl;i++){
            pair[i][0]=position[i];
            pair[i][1]=speed[i];
        }

        Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));
        Stack<Double> stack = new Stack<>();
        
        for( int[] p :pair ){
            
            double a = ( (double) target - p[0]) / p[1];
            System.out.println(a);
            if(stack.isEmpty()){
                stack.push(a);
                continue;
            }
            if(stack.peek()<a){
                stack.push(a);
            }            
        }
        return stack.size();

    }
}
