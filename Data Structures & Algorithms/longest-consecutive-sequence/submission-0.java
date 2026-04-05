class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet <Integer> set = new HashSet<>();

        for (int n : nums){
            set.add(n);
        }

            int longest = 0;
        for (int n : set){
            int length = 0;
            while (set.contains(n + length)){
                length += 1;
            }

            longest = Math.max(longest , length);
        }
    return longest;
        
    }
}
