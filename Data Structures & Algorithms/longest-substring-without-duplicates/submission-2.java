class Solution {
    public int lengthOfLongestSubstring(String s) {

        int l = 0;
        int r = 0;

        HashSet <Character> set = new HashSet<>();

        int longest = 0;

        while (r < s.length()){

            while (set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l += 1;
            }

            set.add(s.charAt(r));
            longest = Math.max(longest, (r - l +1));
            r += 1;
        }

        return longest;
        
    }
}
