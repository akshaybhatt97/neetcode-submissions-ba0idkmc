class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        map = {}

        for c in s:
            map[c] = map.get(c , 0) + 1
        
        for c in t:
            map[c] = map.get(c , 0) - 1

        
        for c in map:
            if not map.get(c , 0) == 0:
                return False
        
        return True
        