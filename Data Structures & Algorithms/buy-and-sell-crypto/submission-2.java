class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length ; 
        if(n==1){return 0;}
        if(n < 3){return Math.max(0,prices[1]-prices[0]);}
        int i =0,j =1;
        int max = 0 ;
        while(j<n){
            int imd = prices[j] - prices[i];
            max = Math.max(imd,max);
            if(imd<0){ 
                i = j;
                j = j+1;
            }
            else{
                j++;
            }
        }
        return max;
    }
}
