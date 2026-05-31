class Solution {
    public int search(int[] nums, int target) {

        int n = nums.length ;
        int l_id =0 , r_id = n-1;
        while( l_id <= r_id ){
            int mid = l_id + (r_id - l_id) / 2;
            System.out.println(mid);
            if(nums[mid] == target) return mid;
            else if ( nums[mid] > target ){
                r_id = mid - 1;
            }
            else{
                l_id = mid + 1;
            }
        }
        return -1;
        
    }
}
