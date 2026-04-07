class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> dq = new LinkedList<>();
        int  l = 0 ;
        int n = nums.length;
        int r = 0;
        int[] output = new int[ n - k + 1];

        while (r < nums.length){

            while (!dq.isEmpty() && nums[dq.getLast()] < nums[r]){
            dq.removeLast();

            }
            dq.addLast(r);

            if (l > dq.getFirst()){
                dq.removeFirst();
            }

            if ((r + 1) >= k){
                output[l] = nums[dq.getFirst()];
                l += 1;
            }
            r += 1;

        }
        return output;
    }
}
