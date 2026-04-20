class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Map = new int[26];
        int[] s2Map = new int[26];

        if (s2.length() < s1.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            s1Map[s1.charAt(i) - 'a'] += 1;
            s2Map[s2.charAt(i) - 'a'] += 1;
        }

        if (matches(s1Map, s2Map))
            return true;

        for (int i = s1.length(); i < s2.length(); i++) {
            s2Map[s2.charAt(i) - 'a'] += 1;
            s2Map[s2.charAt(i - s1.length()) - 'a'] -= 1;

            if (matches(s1Map, s2Map))
                return true;
        }

        return false;
    }

    public  boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
