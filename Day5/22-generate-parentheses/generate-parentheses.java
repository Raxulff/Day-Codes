class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(0,0,n,new StringBuilder(),ans);
        return ans;
    }
    public static void generate(int open,int close,int n,StringBuilder sb,List<String> ans){
        if(open == n && close == n){
            ans.add(sb.toString());
            return;
        }
        if(open < n){
            generate(open+1,close,n,sb.append("("),ans);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close < open){
            generate(open,close+1,n,sb.append(")"),ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}