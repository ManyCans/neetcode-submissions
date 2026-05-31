class Solution {
    public int trap(int[] height) {
        int n = height.length ;
        int l,m,r ;
        l = 0 ;r = n - 1 ;m = 0 ;

        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < n ; i++ ){
            if(max < height[i]){
                m = i ;
                max =  height[i];
            }
        }

        int area = 0 ;

        int lh = height[l]; int rh = height[r];
        System.out.println(m);
        for(int k = l + 1 ; k < m ; k++ ){
            if( height[k] >= lh ){
                lh = height[k];
            }
            else{
                area += lh-height[k];
            }
        }


        for(int k = r-1 ; k > m ; k-- ){
            if( height[k] >= rh ){
                rh = height[k];
            }
            else{
                area += rh-height[k];
            }
        }
        return area;

        

        
    }
}
