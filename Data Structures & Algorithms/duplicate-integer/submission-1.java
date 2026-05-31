class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        int num_len = nums.length;
        for(int i:nums){
            if (map.contains(i)) return true;
            map.add(i);
        }
        return false;
        
    }
}
