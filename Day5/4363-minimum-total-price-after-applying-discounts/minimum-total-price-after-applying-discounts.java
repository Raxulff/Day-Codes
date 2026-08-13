class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);

        int price_Index = prices.length-1;
        int discount_Index = discounts.length-1;

        double ans = 0;
        while(price_Index >= 0 && discount_Index >=0){
            ans += (double)prices[price_Index]*(double) (100-discounts[discount_Index])/100.0;
            System.out.print(ans+"\n");
            price_Index--;
            discount_Index--;
        }
        while(price_Index>=0){
            ans += prices[price_Index];
            price_Index--;
        }
        return ans;
    }
}