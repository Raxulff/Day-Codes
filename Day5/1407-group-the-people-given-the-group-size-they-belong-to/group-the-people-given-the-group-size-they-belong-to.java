class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int st = 1;st <= 500;st++){
            List<Integer> element = new ArrayList<>();
            for(int ind = 0;ind < groupSizes.length;ind++){
                if(groupSizes[ind] == st){
                    element.add(ind);
                }
                if(element.size() == st){
                    ans.add(new ArrayList<>(element));
                    element.clear();
                }
            }
            if(element.size() > 0){
                ans.add(new ArrayList<>(element));
            }
        }
        return ans;
    }
}