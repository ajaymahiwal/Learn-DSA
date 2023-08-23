

//TIME COMPLEXITY IS O(n) 
public class factorial{
    public static int fact(int num){
        if(num==0){
            return 1;
        }
        //factorial 5 =5*4*3*2*1 => 120
        int fnm1=fact(num-1);
        int result=num * fnm1;
        return result;
    }
    public static void main(String args[]){

        System.out.println(fact(5));
    }
}