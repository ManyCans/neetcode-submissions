class Solution {
    public String minWindow(String s, String t) {
        // Early exit condition
        int tlen = t.length() , slen = s.length() ;
        if(tlen>slen || t.isEmpty()){return "";}

        // variables that will be used to match substring with string t
        Map<Character,Integer> countT = new HashMap<>() ;
        Map<Character,Integer> window = new HashMap<>() ;
    
        // First we find unique combination of tmap to comapre to t 
        for( char c : t.toCharArray()){
            countT.put(c,countT.getOrDefault(c,0)+1);
        }

        //two pointers , match count , len and minlen
        int have =0, need = countT.size();
        int[] res = {-1,-1};
        int reslen = Integer.MAX_VALUE;
        int l = 0;

        for(int r = 0;r < s.length() ; r++ ){
            char c = s.charAt(r);
            window.put(c,window.getOrDefault(c,0)+1);
            if( countT.containsKey(c) && window.get(c).equals(countT.get(c))){
                have++;
            }
            while(have==need){
                if(r-l+1 < reslen){
                    reslen = r - l +1 ;
                    res[0] = l;res[1]=r;
                }
                char lchar = s.charAt(l);
                window.put(lchar,window.get(lchar)-1);
                if( countT.containsKey(lchar) && window.get(lchar) < countT.get(lchar)){
                    have--;
                }
                l++;
            }
        }
        return reslen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }
}
