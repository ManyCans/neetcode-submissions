class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        res[0]=-1;res[1]=-1;
        int f_id=0,l_id = numbers.length-1;
        while( f_id < l_id ){
            if(numbers[f_id]+numbers[l_id]==target){
                res[0]=f_id+1;res[1]=l_id+1;return res;
            }
            else if(numbers[f_id]+numbers[l_id]>target){
                l_id--;
            }
            else{
                f_id++;
            }

        }
        return res;
        
    }
}
