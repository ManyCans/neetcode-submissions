class Solution {
    public boolean isPalindrome(String s) {
        boolean res = false;
        s = s.replace(" ","").toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int st_idx =0 , ed_idx = s.length()-1;
        while(st_idx<ed_idx){
            if(s.charAt(st_idx) != s.charAt(ed_idx)){return false;}
            st_idx++;ed_idx--;
        }
        return true;
    }
}
