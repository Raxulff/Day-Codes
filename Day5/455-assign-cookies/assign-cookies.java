class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);
        int childIndex = 0;
        int cookieIndex = 0;
        int n1 = g.length;
        int n2 = s.length;
        int count = 0;
        while(childIndex < n1 && cookieIndex < n2){
            if(s[cookieIndex] >= g[childIndex]){
                count++;
                cookieIndex++;
                childIndex++;
            }
            else if(s[cookieIndex] < g[childIndex]){
                cookieIndex++;
            }
        }
        return count;
    }
}