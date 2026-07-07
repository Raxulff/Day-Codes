class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] parts = s.trim().split("\\s++");
        System.out.print(Arrays.asList(parts));
        for(int ind = parts.length-1; ind >= 0;ind--){

            sb.append((ind==0) ? parts[ind] : parts[ind]+" ");
        }
        return sb.toString();
    }
}