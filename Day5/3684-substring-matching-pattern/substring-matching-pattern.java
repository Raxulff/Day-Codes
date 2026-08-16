class Solution {
    public boolean hasMatch(String s, String p) {
        int index = p.indexOf('*');//2
        int prefix = s.indexOf(p.substring(0,index));//1
        int suffix =  s.indexOf(p.substring(index + 1), prefix + index); 
        return (prefix != -1 && suffix != -1);

    }
}