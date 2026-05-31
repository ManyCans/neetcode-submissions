class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1_l = s1.length(),s2_l = s2.length(),l=0;
        if(s1_l>s2_l){return false;}
        
        char[] sa1 = new char[26];
        char[] sa2 = new char[26]; 
        
        for(int i = 0; i < s1_l ; i++){
            sa1[s1.charAt(i)-'a']++; 
            sa2[s2.charAt(i)-'a']++;     
        }

        int matches = 0;
        for(int i = 0; i < 26 ; i++){
            if(sa1[i]==sa2[i]){
                matches++;
            }
        }
        for(int j = s1_l; j < s2_l ; j++ ){
            
            if(matches==26){return true;}
            int index = s2.charAt(j) - 'a';

            sa2[index]++;
            if(sa2[index] == sa1[index]){
                matches++;
            }
            else if(sa2[index] == sa1[index]+1){
                matches--;
            }

            index = s2.charAt(l) -'a';
            sa2[index]--;

            if(sa2[index] == sa1[index]){
                matches++;
            }
            else if(sa1[index]-1 == sa2[index]){
                matches--;
            }
            l++;
        }
        return matches==26;
        
    }
}
