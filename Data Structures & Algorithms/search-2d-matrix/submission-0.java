class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length,n = matrix[0].length ;
        int f_r =0, f_c =0, l_r = m-1,l_c = n-1;
        while(( f_r * n + f_c ) <= (l_r * n + l_c)){
            int diff = (l_r * n + l_c) - ( f_r * n + f_c ) ;
            int mid =  ( f_r * n + f_c ) + diff/2;
            int m_r = mid / n , m_c = mid % n ;
            if( matrix[m_r][m_c] == target){return true;}
            else if ( matrix[m_r][m_c] < target ){
                mid++;
                f_r = mid / n;
                f_c = mid % n ;
            }
            else{
                mid--;
                l_r = mid / n;
                l_c = mid % n ;
            }

        }
        return false;
        
    }
}
