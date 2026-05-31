class Solution {

    public String encode(List<String> strs) {
        if(strs.size() == 0){return "";}
        
        StringBuilder stb = new StringBuilder();

        for(String ss : strs){
            stb.append(ss.length());
            stb.append(',');
        }
        
        stb.append('#');
        
        for(String ss : strs){
            stb.append(ss);
        }
        
        return stb.toString();
    }

    public List<String> decode(String str) {
        if(str.length()==0){return new ArrayList<>();}
        
        int hid =  str.indexOf('#');
        
        String st1 = str.substring(0,hid);
        String st2 = str.substring(hid+1);
        st1 = st1.substring(0,st1.length()-1);
        
        String[] parts = st1.split(",");
        int[] lens = Arrays.stream(parts).mapToInt(Integer::parseInt) .toArray();

        List<String> res = new ArrayList<>();
        
        int k = 0 ;
        
        for( int i : lens ){
            res.add(st2.substring(k,k+i));
            k = k + i ;
        }
        return res ;
        
    }
}
