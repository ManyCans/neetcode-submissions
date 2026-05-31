class Solution {
    public int lengthOfLongestSubstring(String s) {

        int slen = s.length();
        if(slen<2){return slen;}
        
        int i = 0 , j = 1 ;
        int res = 1 ;
        // Assumption on first two chars

        HashSet<Character> set = new HashSet<>();
        set.add(s.charAt(0));
        
        while(j<slen){
            System.out.println("Res : "+res);
            char c = s.charAt(j);
            int len = j-i;
            if(set.contains(c)){
                res = Math.max(res,len);
                while(set.contains(c) && j > i){
                    set.remove(s.charAt(i++));
                }
                if(j==i){
                    i = j;
                    set.add(s.charAt(i));
                }
                set.add(c);
            }
            else{
                res = Math.max(res, len + 1 );
                set.add(c);
            }
            j++;
        }
        return res;

        
    }
}
