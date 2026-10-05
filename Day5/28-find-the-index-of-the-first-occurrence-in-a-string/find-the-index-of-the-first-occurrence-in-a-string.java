class Solution {
    public int strStr(String str1, String str2) {
        int str2Len = str2.length();
        int str1Len = str1.length();
        int[] lps = new int[str2Len];
        int len = 0;
        int index = 1;
        while(index < str2Len){
            if(str2.charAt(index) == str2.charAt(len)){
                len++;
                lps[index++] = len;
            }else if(len > 0){
                len = lps[len-1];
            }else{
                lps[index] = 0;
                index++;
            }
        }

        int ind1 = 0;
        int ind2 = 0;

        while(ind1 < str1Len && ind2 < str2Len){
            if(str1.charAt(ind1) == str2.charAt(ind2)){
                ind1++;
                ind2++;
                if(ind2 == str2Len){
                    return ind1-str2Len;
                }
            }else if(ind2 > 0){
                ind2 = lps[ind2-1];
            }else{
                ind1++;
            }
        }
        return -1;
    }
}