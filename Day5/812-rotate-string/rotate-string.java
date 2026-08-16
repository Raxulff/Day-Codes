class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)){
            return true;
        }
        if(s.length() != goal.length()){
            return false;
        }
        for(int shift = 1;shift < s.length();shift++){
            StringBuilder sb = new StringBuilder();
            for(int ind = 0;ind < s.length();ind++){
                sb.append(s.charAt((ind+shift)%s.length()));
            }
            if(sb.toString().equals(goal)){
                return true;
            }
        }
        return false;
    }
}