class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String str : sentences){
            String[] parts = str.trim().split(" ");
            int count = 0;
            for(String s : parts){
                count++;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}