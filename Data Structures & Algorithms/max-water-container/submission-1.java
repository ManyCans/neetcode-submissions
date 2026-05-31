class Solution {
    public int maxArea(int[] heights) {
        int f_id =0,l_id= heights.length -1;
        if(l_id<1){return 0;}

        int max_amount = (l_id-f_id) * Math.min(heights[f_id],heights[l_id]);

        while(f_id<l_id){
            int cur_amount = (l_id-f_id) * Math.min(heights[f_id],heights[l_id]);
            max_amount = Math.max(cur_amount,max_amount);

            if( heights[f_id] <= heights[l_id] ){
                f_id++;
            }
            else{
                l_id--;
            }
        }
        return max_amount;
        
    }
}
