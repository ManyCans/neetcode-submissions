class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numset = new HashSet<>();
        if(nums.length<2){return nums.length;}
        for(int num:nums) numset.add(num);
        int whole_max = 1;
        for(int num:nums){
            if (numset.contains(num-1)) continue;
            int local_max =1;
            int index = num;
            while(numset.contains(index+1)){
                index++;
                local_max++;
                whole_max = Math.max(local_max,whole_max);
            }

        }
        return whole_max;
    }
}
