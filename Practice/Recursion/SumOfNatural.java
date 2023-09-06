

//SUM OF NN NAATURAL NUMBERS
public class SumOfNatural{

    public static int sum(int n){
        if(n==1){
            return 1;
        }
        //sum of n naturalno.= 5+4+3+2+1 =>15  so n to sum(n-1)
        int snm1=sum(n-1);
        int result=n+snm1;
        return result;
    }

    public static void main(String args[]){

        System.out.println(sum(5));
    }
}