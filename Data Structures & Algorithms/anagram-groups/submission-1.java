class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] cc = new char[26];
            
            for(char c : str.toCharArray()){
                cc[c-'a']++;
            }
            
            String ss = String.valueOf(cc);
            if(!map.containsKey(ss)) map.putIfAbsent(ss,new ArrayList<>());

            map.get(ss).add(str);
        }

        return new ArrayList<>(map.values());

    }
}
