class Solution {
    public boolean isSubsequence(String s, String t) {
        int sInd = 0;
        int tInd = 0;
        int sLen = s.length();
        int tLen = t.length();
        while(sInd < sLen && tInd < tLen){
            char ch1 = s.charAt(sInd);
            char ch2 = t.charAt(tInd);

            if(ch1 == ch2){
                sInd++;
                tInd++;
            }else{
                tInd++;
            }
        }
        return sInd == sLen;
    }
}