class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int sum = 0;
        int l = 0;
        int r = 0;
        int totalSum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int n : nums){
            totalSum += n;
        }

        if (totalSum < target){
            return 0;
        }
        while ( r  < nums.length){


            sum += nums[r];
            while(sum >= target){
            minLen = Math.min(minLen, r - l + 1);
                sum -= nums[l];
                l += 1;
            }

            r += 1;
        }

          return minLen == Integer.MAX_VALUE ? 0 : minLen;
        
    }
}