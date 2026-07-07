class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == ' ') continue;
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                sb.append(ch);
            }
        }
        return check(sb.toString());

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