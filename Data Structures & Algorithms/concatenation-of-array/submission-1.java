class Solution {
    public int[] getConcatenation(int[] nums) {

        List <Integer> list = new ArrayList<>();
 
        for (int i = 0; i <= 1; i++){

            for (int n : nums){
                list.add(n);
            }


        }

        int [] res = new int[2 * nums.length];

        System.out.println(list);

        for (int i = 0; i < list.size() ; i ++){
            res[i] = list.get(i);
        }
        
        return res;
    }
}