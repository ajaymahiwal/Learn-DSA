

//RETURN THE MAXIMUM PROFIT IF PRICE IS GIVEN OF iTH DAYS

public class BuySellStocks{
    public static int stocks(int price[]){

        int buy_price=Integer.MAX_VALUE;
        int max_profit=0;

        for(int i=0;i<price.length;i++){
            if(buy_price<price[i]){
                int profit=price[i]-buy_price;  //today's profit
                max_profit=Math.max(max_profit,profit);
            }
            else{
                buy_price=price[i];   //matlab ki jis din price kam hai us din kharid lege 
            }
        }
        return max_profit;

    }
    public static void main(String args[]){

        int price[]={10,5,1,4,3,6,2};

        System.out.println("Maximum Price:"+stocks(price));
    }
}