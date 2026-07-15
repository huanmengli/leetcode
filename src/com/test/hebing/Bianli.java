package com.test.hebing;

public class Bianli {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        int n =prices.length;
        if(n==1){
            return 0;
        }
        int min = prices[0];

        int max = prices[1]-prices[0];

        for(int i =0;i<n;i++){
            if(prices[i] < min){
                min = prices[i];
            }else if(max < prices[i] - min){
                max = prices[i] - min;
            }
        }
        return max;
    }
}
