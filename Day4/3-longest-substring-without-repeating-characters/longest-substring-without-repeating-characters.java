class Solution {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;
        
        for (int right = 0; right < s.length(); right++) {
           
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
	}
}
/*
s =    p   w   w   k   e   w
       0   1   2   3   4   5
r->            r
l->    l

set = {'w'}
max = 2

 */