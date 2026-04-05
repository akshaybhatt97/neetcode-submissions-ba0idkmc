class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap <String , List<String>> map = new HashMap<>();

        for (String s : strs){


            char [] str = s.toCharArray();

            Arrays.sort(str);

            String key = new String (str);

            map.putIfAbsent(key, new ArrayList<>());

            map.get(key).add(s);


        }
        System.out.println(map.values().getClass());
        return new ArrayList <>(map.values());




        
        
    }
}
