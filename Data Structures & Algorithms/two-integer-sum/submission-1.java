class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> solut= new HashMap<>();
        int arr[] =new int[2];
        int n_len = nums.length;
        for(int i =0;i<n_len;i++){
            if(solut.containsKey( target - nums[i] )){
                arr[1] =i;
                arr[0] =solut.get(target - nums[i]);
                return arr;
            }
            solut.put(nums[i],i);
        }
        return arr;
    }
}
