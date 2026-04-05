class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();


        int  l = 0;
        int r = 0 ;
        int longest = 0;

        while ( r < s.toCharArray().length){

            System.out.println(s.charAt(r)); 

            while (set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l += 1;
            }

            longest = Math.max((r - l + 1) , longest);

            set.add(s.charAt(r)); 

            r += 1;


        }

        return longest;
    }
}
