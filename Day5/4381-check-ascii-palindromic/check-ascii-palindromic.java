class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb = new StringBuilder();
        //Integer.toBinaryString();
        for(char ch : s.toCharArray()){
            sb.append(String.format("%8s", Integer.toBinaryString((int) ch)).replace(' ', '0'));
        }
        //String.format("%8s", Integer.toBinaryString(number)).replace(' ', '0')
        String real = sb.toString();
        int st = 0;
        int end = real.length()-1;
        //System.out.println(real);
        while(st <= end){
            //System.out.println(real.charAt(st)+" == "+real.charAt(end));
            if(real.charAt(st) != real.charAt(end)){
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
}
