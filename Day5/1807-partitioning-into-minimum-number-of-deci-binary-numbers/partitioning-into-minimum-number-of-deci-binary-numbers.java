class Solution {
    public int minPartitions(String n) {
        int max = 0;
        for(int ind = 0;ind < n.length();ind++){
            char ch = n.charAt(ind);
            max = Math.max(max,(ch-'0'));
        }
        return max;
    }
}