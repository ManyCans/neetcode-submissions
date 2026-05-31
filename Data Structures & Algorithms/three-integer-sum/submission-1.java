class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> res = new HashSet<>();
        int n_len = nums.length;
        for(int i=0;i<n_len;i++){
            if(nums[i]>0) break;
            if(i>0 && nums[i]==nums[i-1]) continue;
            int f_id = i+1;
            int l_id = nums.length-1;
            while(f_id<l_id){
                if(nums[i]+nums[f_id]+nums[l_id]==0){
                    List<Integer> ans =Arrays.asList(nums[i],nums[f_id],nums[l_id]);
                    res.add(ans);
                    f_id++;l_id--;
                }
                else if(nums[i]+nums[f_id]+nums[l_id]>0){
                    l_id--;
                }
                else{
                    f_id++;
                }
            }
        }
        List<List<Integer>> list = new ArrayList<>(res);
        return list;



    }
}
