class Solution {
    public int longestConsecutive(int[] nums) {
        int res =0;

        Set<Integer> store = new HashSet<>();
        
        for(int i:nums){
            store.add(i);
        }

        for( int i : nums ){
            int streak = 0 , curr = i;
            while( store.contains(curr) ){
                curr++ ;
                streak++ ;
            }
            res = Math.max(res,streak);
        }
        return res;
    }
}
