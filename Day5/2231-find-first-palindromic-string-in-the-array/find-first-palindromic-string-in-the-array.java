class Solution {
    public String firstPalindrome(String[] words) {
        String result = "";
        for(String s : words){
            if(check(s)){
                result = s;
                break;
            }
        }
        return result;
    }
    public static boolean check(String s){
        for(int st = 0,end = s.length()-1;st <= end;st++,end--){
            if(s.charAt(st) != s.charAt(end)){
                return false;
            }
        }
        return true;
    }
}