class Solution {
    public int minMovesToMakePalindrome(String s) {
        char[] arr = s.toCharArray();
        int n = s.length();
        int i = 0;
        int j = n-1;
        int ans = 0;
        while(i<j){
            int k = j;
            while(k > i && arr[k] != arr[i]){
                k--;
            }
            if(i == k){
                char temp = arr[k];
                arr[k] = arr[k+1];
                arr[k+1] = temp;
                ans++;
            }else{
                while(k < j){
                    char temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                    k++;
                    ans++;
                }
                i++;
                j--;
            }
        }
        return ans;
    }
}