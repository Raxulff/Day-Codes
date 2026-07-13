class Solution {
    public int minimumRecolors(String blocks, int k) {
        char[] charArray = blocks.toCharArray();
        int blackCount = 0;
        int whiteCount = 0;
        int left = 0;
        int min = Integer.MAX_VALUE;

        for(int right = 0;right < charArray.length;right++){
            if(charArray[right] == 'B'){
                blackCount++;
            }else{
                whiteCount++;
            }
            if((blackCount + whiteCount) == k){
                min = Math.min(min,whiteCount);
                if(charArray[left] == 'B'){
                    blackCount--;
                }else{
                    whiteCount--;
                }
                left++;
            }
        }
        return min;
    }
}