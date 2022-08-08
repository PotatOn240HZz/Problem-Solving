// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii

class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int buy=prices[0];
        int profit=0;
        for(int i=1;i<prices.size();i++)
        {
            cout<<prices[i];
            if(buy>prices[i] || buy==-1)
                buy=prices[i];
            else if(buy<prices[i])
            {
                int max=prices[i];
                if(prices.size()>2 && i!=prices.size()-1)
                for(int j=i;j<prices.size()-1 && prices[j+1]>prices[j];j++,i++)
                    max=prices[j+1];
                profit+=(max-buy);
                buy=-1;
            }
        }
        return profit;
    }
};