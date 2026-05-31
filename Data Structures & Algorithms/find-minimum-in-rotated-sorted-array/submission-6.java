class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l = 0, r = n - 1 ;
        int res = Math.min(nums[l],nums[r]);

        while(l<=r){            
            int mid = l + ( r - l ) / 2 ;
            if( nums[mid] < nums[l] ){
                res = Math.min(res,nums[mid]);
                r = mid - 1 ;
            }
            else{
                if(nums[mid]<=nums[r]){
                    return Math.min(nums[l],res);
                }
                l = mid + 1 ;
            }
        }
        return res;
    }
}
