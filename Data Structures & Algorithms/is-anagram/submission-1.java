class Solution {
    public boolean isAnagram(String s, String t) {
        int slen = s.length();
        if ( slen != t.length() ) return false;
        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();
        for (int i =0 ; i < slen ; i++ ) smap.put(s.charAt(i),smap.getOrDefault(s.charAt(i),0)+1);
        for (int i =0 ; i < slen ; i++ ) tmap.put(t.charAt(i),tmap.getOrDefault(t.charAt(i),0)+1);
        return smap.equals(tmap);
         
    }
}
