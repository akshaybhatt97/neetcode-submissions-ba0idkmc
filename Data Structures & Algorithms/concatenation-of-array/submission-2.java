class Solution {
    public int[] getConcatenation(int[] nums) {

        int [] output = new int[2 * nums.length] ; 
        int idx = 0;


        for ( int i = 0 ; i < 2; i ++){
            for (int j = 0 ; j < nums.length ; j ++){
                output[idx ++] = nums[j];


            }
        }
        return output;
        
    }
}