class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int n = garbage.length;
        int Gprefix[] = new int[n];
        int Pprefix[] = new int[n];
        int Mprefix[] = new int[n];
        
        String firstHouse = garbage[0];
        int G = 0;
        int P = 0;
        int M = 0;
        for(int ind = 0;ind < firstHouse.length();ind++){
            char ch = firstHouse.charAt(ind);
            if(ch == 'G'){
                G++;
            }else if(ch == 'P'){
                P++;
            }else if(ch == 'M'){
                M++;
            }
        }
        Gprefix[0] = G;
        Pprefix[0] = P;
        Mprefix[0] = M;

        for(int ind = 1;ind < garbage.length;ind++){
            String currHouse = garbage[ind];
            G = 0;
            P = 0;
            M = 0;
            for(int ind1 = 0;ind1 < currHouse.length();ind1++){
                char ch = currHouse.charAt(ind1);
                if(ch == 'G'){
                    G++;
                }else if(ch == 'P'){
                    P++;
                }else if(ch == 'M'){
                    M++;
                }
            }
            Gprefix[ind] = Gprefix[ind-1] + G + travel[ind-1];
            Pprefix[ind] = Pprefix[ind-1] + P + travel[ind-1];
            Mprefix[ind] = Mprefix[ind-1] + M + travel[ind-1];
        }
        int maxG = -1;
        int maxP = -1;
        int maxM = -1;

        for(int ind = 0;ind < garbage.length;ind++){
            if(garbage[ind].contains("G")){
                maxG = ind;
            }
            if(garbage[ind].contains("P")){
                maxP = ind;
            }
            if(garbage[ind].contains("M")){
                maxM = ind;
            }
        }
        int sum = 0;
        if(maxG != -1){
            sum = sum + Gprefix[maxG];
        }
        if(maxP != -1){
            sum = sum + Pprefix[maxP];
        }
        if(maxM != -1){
            sum = sum + Mprefix[maxM];
        }
        return sum;
    }
}