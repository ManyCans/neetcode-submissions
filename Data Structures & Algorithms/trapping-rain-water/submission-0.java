class Solution {
    public int trap(int[] height) {
        int hlen = height.length;
        if( hlen < 2 ) return 0; 
        int res = 0;

        // Max elemement and id iheight
        int m_id = 0 , m_ele = height[0];
        for( int i = 1 ; i < hlen ; i++ ){
            if(height[i] > m_ele ){
                m_ele = height[i];
                m_id = i;
            }
        } 
        int lm = height[0];

        for(int i = 1;i < m_id;i++){
            if( lm <= height[i] ){
                lm = height[i];
            }
            else{
                res += (lm - height[i]);
            }
        }

        int rm = height[hlen-1];

        for(int i = hlen -2;i > m_id ;i--){
            if( rm <= height[i] ){
                rm = height[i];
            }
            else{
                res += (rm - height[i]);
            }
        }

        return res;
        
    }
}
