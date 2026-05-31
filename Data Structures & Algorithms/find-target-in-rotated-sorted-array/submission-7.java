class Solution {
    public int search(int[] nums, int target) {
        int n= nums.length;
        int l =0, r =n-1;

        while(l<=r){
            int mid = l +  (r-l)/2;
            System.out.println("l : "+l);
            System.out.println("r : "+r);
            System.out.println("mid : "+mid);
            if(nums[mid]==target) return mid;
            else if(nums[mid] > target){
                if(nums[mid] < nums[l]){
                    r = mid -1;
                }
                else{
                    if(nums[l] <= target){
                        r = mid - 1;
                    }
                    else{
                        l = mid + 1 ;
                    }
                }
            }
            else{
                if(nums[mid] > nums[r]){
                    l = mid + 1;
                }
                else{
                    if(nums[r]>=target){
                        l = mid +1;
                    }
                    else{
                        r = mid -1;
                    }
                }

            }            
        } 
        return -1;
        
    }
}
