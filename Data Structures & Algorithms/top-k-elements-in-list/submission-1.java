class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        
        int n = nums.length ;
        List<Integer> [] list = new List[n+1];
        for( int i =0; i <= n ; i++ ) list[i] = new ArrayList<>();
        
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }


        for(Map.Entry<Integer,Integer> entry : map.entrySet()){

            list[entry.getValue()].add(entry.getKey());
        
        }
        
        int[] res = new int[k];
        k=  k-1 ;
        int rec = n;
        while(k >= 0){
            for( int i : list[rec] ){
                if( k < 0 ) break;
                res[k--] = i;
            }
            rec--;
        }
        return res;  
    }
}
