

//print x to the power n

public class Power{
    //TIME COMPLEXITY O(n)
    public static int expo(int x,int n){

        if(n==0){
            return 1;   // x^0=1
        }
        // int xpnm1=expo(x,n-1);
        // int result= x*xpnm1;
        // return result;
        return x * expo(x,n-1);
    }



    //TIME COMPLEXITY IS O(logn)
    public static int expo1(int x,int n){
         if(n==0){
            return 1;
         }
         int halfPower=expo1(x,n/2);
         int halfPowerSq=halfPower * halfPower;
         //if n is odd power
         if(n % 2 !=0){
            halfPowerSq= x * halfPowerSq;
         }

         return halfPowerSq;
    }
    public static void main(String args[]){
        int base=2;
        int power=25;
        // System.out.println(expo(base,power));
        System.out.println(expo1(base,power));
        // System.out.println(1/2);

    }
} 