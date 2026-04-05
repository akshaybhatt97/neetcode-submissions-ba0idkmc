class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap <Character , Integer>  sMap = new HashMap<>();
        HashMap <Character , Integer>  tMap = new HashMap<>();


        if ( s.length() != t.length()){
            return false;
        }



        for(char c : s.toCharArray()){

            sMap.put(c , sMap.getOrDefault(c , 0) + 1);


        }


        for(char c : t.toCharArray()){

            tMap.put(c , tMap.getOrDefault(c , 0) + 1);


        }


        for (char c : sMap.keySet()){

            if ( ! sMap.get(c).equals(tMap.getOrDefault(c , 0))){

                return false;
            }
        }

        return true;

    }
}
