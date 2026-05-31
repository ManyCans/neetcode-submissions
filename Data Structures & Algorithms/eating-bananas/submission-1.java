class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int res = r ;
        int n = piles.length;

        while(l<=r){

            int mid = l + (r-l)/2 ;
            int time = 0;
            
            for(int i = 0 ; i < n; i++){

                if(piles[i] <= mid){
                    time += 1;
                }
                else{
                    if(piles[i] % mid == 0){
                        time += piles[i] / mid;
                    }
                    else{ 
                        time += piles[i] / mid + 1;
                    }
                }
            }
            System.out.println("time : " + time);
            System.out.println("res  : " +res);

            if(time <= h){
                r = mid - 1;
                res = mid;
            }
            else{
                l = mid + 1 ;
            }
        }
        return res;
    }
}
