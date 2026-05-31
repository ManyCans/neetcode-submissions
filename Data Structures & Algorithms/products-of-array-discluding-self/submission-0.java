class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res = 1;
        int zero_count =0 ;
        int num_len = nums.length;
        List<Integer> resl = new ArrayList<>();

        for(int i:nums){
            if(i==0) zero_count++; 
            else {res = res*i;}
        }

        if (zero_count>=1){

            for(int i=0;i<num_len;i++){
            
            if(zero_count==1 && nums[i]==0){resl.add(res);}
            else{resl.add(0);}

            }

            return resl.stream().mapToInt(Integer::intValue).toArray();

        }
        
        for (int i:nums){
            resl.add(res/i);
        }
        return resl.stream().mapToInt(Integer::intValue).toArray();


        
    }
}  
