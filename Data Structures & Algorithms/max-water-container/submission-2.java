class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length ; 
        int l = 0, r = n - 1 ;
        int area = 0;
        while(l < r){
            int ca = Math.min(heights[l],heights[r]) * (r-l);
            area = Math.max( area , ca );
            if(heights[l]>=heights[r]){r--;}
            else{l++;}
        }
        return area;
    }
}
