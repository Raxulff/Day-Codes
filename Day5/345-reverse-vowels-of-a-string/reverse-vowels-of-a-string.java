class Solution {
    public String reverseVowels(String s) {
        String vow = "aeiouAEIOU";
        char[] arr = s.toCharArray();
        
        int st = 0;
        int end = s.length()-1;

        while(st < end){
            while(vow.indexOf(arr[st]) == -1 && st < end){
                st++;
            }
            while(vow.indexOf(arr[end]) == -1 && st < end){
                end--;
            }
            char temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : arr){
            sb.append(ch);
        }
        return sb.toString();
    }
}