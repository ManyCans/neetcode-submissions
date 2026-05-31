class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int nlen = nums.length;
        int arr[] =new int[2];
        for(int i = 0 ; i < nlen ; i++ ){
            if(map.containsKey(target-nums[i])){
                arr[0] = map.get(target-nums[i]) ;
                arr[1] = i ;
                return arr;
            }
            map.put(nums[i],i);
        }
        return arr;
    }
}
