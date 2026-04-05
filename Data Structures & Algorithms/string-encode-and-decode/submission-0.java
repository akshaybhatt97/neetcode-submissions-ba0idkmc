class Solution {

    public String encode(List<String> strs) {

        StringBuilder res = new StringBuilder();

        for (String s : strs){

            res.append(s.length()) ;
            res.append('#') ;
            res.append(s);

        }
        System.out.println(res.toString());
        return res.toString();

    }

    public List<String> decode(String str) {
        System.out.println(str);

        ArrayList <String> res = new ArrayList<>();

        int i = 0;
        while (i < str.length()){
            int j = i;

            while (str.charAt(j) != '#' ){
                j += 1;
            }

            System.out.println("i = " + i + ", j = " + j);
            System.out.println("length part = [" + str.substring(i, j) + "]");
            int length = new Integer(str.substring(i ,j));
            j += 1;

            res.add(str.substring(j , j + length));

            j = j + length;

            i = j;

            
        }

        return res;



    }
}
