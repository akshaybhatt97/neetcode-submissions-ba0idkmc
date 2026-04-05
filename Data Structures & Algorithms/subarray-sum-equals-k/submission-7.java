class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap <Integer, Integer> map = new HashMap<>();
        int count = 0;
        int sum = 0;

        

            map.put(0 , 1);
        for (int n : nums){


            sum += n;

            int key = sum - k;

            if (map.containsKey(key)){
                System.out.println(map.containsKey(key));
                count += map.get(key);
            }
            map.put(sum , map.getOrDefault(sum , 0) + 1);

        }

        return count;
    }
}