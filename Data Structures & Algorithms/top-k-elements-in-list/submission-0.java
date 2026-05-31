class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // first I will generate a Hasmap that will make element : freq

        HashMap <Integer,Integer> map= new HashMap<>();
        List<Integer>[] freq_list = new List[nums.length + 1];

        for (int i = 0; i < freq_list.length; i++) {
            freq_list[i] = new ArrayList<>();
        }
        
        for(int i :nums){
            map.put( i , map.getOrDefault(i,0) + 1);
        }
        
        for ( Map.Entry<Integer,Integer> entry : map.entrySet()){
            freq_list[entry.getValue()].add(entry.getKey());
        }
        
        
        //  Now i want to remove top k elements 
        int n_len = nums.length;
        int[] arr = new int[k];
        int k_fils = 0 ;

        for (int i = freq_list.length-1; i > 0 && k_fils < k ; i--){
            for(int n : freq_list[i]){
                arr[k_fils++] = n;
                if (k_fils == k){return arr;}
            }
        }
        return arr;


        
    }
}
