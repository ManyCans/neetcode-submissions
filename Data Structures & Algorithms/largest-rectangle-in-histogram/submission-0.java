class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> sizes = new Stack<Integer>();
        Stack<Integer> indexs = new Stack<Integer>();
        int n = heights.length;
        
        int res = 0 ; 
        int max_height = 0;

        for(int i=0;i<n;i++){

            if(indexs.isEmpty()){
                sizes.push(heights[i]);
                indexs.push(i);
                continue;
            }
            
            if( heights[i] < sizes.peek() ){
                int new_idx = 0;

                while( !indexs.isEmpty() && heights[i] < sizes.peek()){
                
                    new_idx = indexs.peek() ;
                    res = Math.max( res , (i - indexs.pop()) * sizes.pop() );
                
                }
                
                sizes.push(heights[i]);
                indexs.push(new_idx);

            }
            else{
                indexs.push(i);
                sizes.push(heights[i]);
            }
        }

        while(!indexs.isEmpty()){
            res = Math.max( res , (n - indexs.pop()) * sizes.pop() );
            System.out.println(res);
        }
        return res;
           
    }
}
