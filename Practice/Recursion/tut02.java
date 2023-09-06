

//TYPE OF RECURSION : DIRECT AND INDIRECT
public class tut02{

    //DIRECT RECUSION
    public static void directRecFun(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        directRecFun(n-1);
        System.out.print(n+" ");
    }


    //INDIRECT RECURSION
    public static void indirectRecFun1(int n){

        if(n==1){ 
            System.out.print(n+"@ ");   //@ or # ye bus sumjne k liye lgaye hai recursion ko
            return;
        }
        indirectRecFun2(n-1);
        System.out.print(n+"@ ");
    }
    public static void indirectRecFun2(int n){

        if(n==1){
            System.out.print(n+"# ");
            return;
        }
        indirectRecFun1(n-1);
        System.out.print(n+"# ");
    }



    public static void main(String args[]){

        // directRecFun(20);
        indirectRecFun1(5);
    }
}