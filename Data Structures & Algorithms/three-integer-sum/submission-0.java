class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

         List<List<Integer>> res = new ArrayList<>();
         Arrays.sort(nums);

         for (int i = 0 ; i < nums.length ; i++){

            if (i > 0 && nums[i - 1] == nums[i]){

                continue;
            }

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r){

                int threeSum = nums[l] + nums[r] + nums[i];

                if (threeSum < 0){
                     l += 1;
                }
                else if (threeSum > 0){
                    r -= 1;
                }

               else{
                    res.add(Arrays.asList(nums[i] , nums[l] , nums[r]));
                    l += 1;
                    r -= 1;

                    while (r > l && nums[l - 1] == nums[l]){
                        l += 1;
                    }
                }
            }
         }

         return res;
        
    }
}
