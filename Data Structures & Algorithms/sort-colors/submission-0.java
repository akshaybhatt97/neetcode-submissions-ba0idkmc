class Solution {
    public void sortColors(int[] nums) {

        int low = 0 ; int mid = 0 ; int high = nums.length - 1;


        while ( mid <= high){

            if (nums[mid] == 0){

                swap(nums , low , mid);
                low += 1;
                mid += 1;
            }
            else if (nums[mid] == 1){
                mid += 1;
            }
            else{
                swap(nums , mid , high);
                high -= 1;
            }
        }
        
    }

    public void swap(int[]nums , int l , int r){
        int temp = nums[l];
        nums[l]= nums[r];
        nums[r] = temp;
    }
}