

//CALCULATE NTH TERM IN FIBNACCI
//TIME COMPLEXITY IS O(2^n) very poor
public class fibnacci{
    public static int fib(int n){

        /*if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }*/
        if(n==0 || n==1){
            return n; //ager n 0 huaa to return 0 hoga ager n 1 huaa to 1 return ho jayega
        }
        return fib(n-1)+fib(n-2);  //nth term of fib is sum of previous two numbers
    }
    public static void main(String args[]){

        System.out.println(fib(7));

    }
}