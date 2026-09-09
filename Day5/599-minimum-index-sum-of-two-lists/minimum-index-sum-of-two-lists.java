class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int ind1 = 0;ind1 < list1.length;ind1++){
            for(int ind2 = 0;ind2 < list2.length;ind2++){
                String str1 = list1[ind1];
                String str2 = list2[ind2];

                if(str1.equals(str2)){
                    if(min > ind1 + ind2){
                        list.clear();
                        list.add(str1);
                        min = ind1+ind2;
                    }else if(min == ind1+ind2){
                        list.add(str1);
                    }
                }
            }
        }
        String[] ans = new String[list.size()];
        int index = 0;
        for(String str : list){
            ans[index++] = str;
        }
        return ans;
    }
}

//hashmap