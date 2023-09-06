

import java.util.*;
public class StockSpan{
    public static void stockSpan_1(int stock[]){
        int spanArr[]=new int[stock.length];
        for(int i=0;i<stock.length;i++){
            int span = 1;
            for(int j=i-1;j>=0;j--){
                if(stock[j]<=stock[i]){
                    span++;
                }
                else{
                    break;
                }
            }
            spanArr[i] = span;
        }
        for(int i:spanArr){
            System.out.print(i+" ");
        }
            System.out.println();
    }

    public static void stockSpan_2(int stock[]){
        int spanArr[]=new int[stock.length];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<stock.length;i++){
            while(!s.isEmpty() && stock[s.peek()]<=stock[i]){
                s.pop();
            }
            if(s.isEmpty()){
                spanArr[i] = i+1;
            }
            else{
                spanArr[i] = i - s.peek();
            }
            s.push(i);
        }
         for(int i:spanArr){
            System.out.print(i+" ");
        }
            System.out.println();
    }
    public static void main(String args[]){
        int stock[] = {100,80,60,70,60,85,100};
       System.out.println("Using MY Method: ");
       stockSpan_1(stock);
       System.out.println("Using Didi Method: ");
        stockSpan_2(stock);
    }
}