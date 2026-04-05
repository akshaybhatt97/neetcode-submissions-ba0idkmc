class Solution {
    public int majorityElement(int[] nums) {

        HashMap <Integer , Integer> map = new HashMap<>();

        int size= nums.length;

        for(int n : nums){
            map.put(n , map.getOrDefault(n , 0) + 1);
        }


        for (int n : map.keySet()){

            if (map.get(n) > size/ 2){
                return n;
            }
        }

        return -1;
        
    }
}