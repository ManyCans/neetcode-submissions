class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> dups_check = new HashSet<>();
        int num_length = nums.length;
        for(int i =0 ; i < num_length ; i++){
            if (dups_check.contains(nums[i])){
                return true;
            }
            dups_check.add(nums[i]);

        }
        return false;
    }
}
