


public class BinaryQues{
    public static void printBinary(int n,int lastPlace,String str){
        //base
        if(n==0){
            System.out.println(str);
            return;
        }
        //kaam & call with viswas
        printBinary(n-1,0,str+"0");
        if(lastPlace==0){
            printBinary(n-1,1,str+"1");
        }
    }
    public static void printBinary_1(int n,int lastPlace,String str){
        //base
        if(n<1){
            System.out.println(str);
            return;
        }
        //kaam & call with viswas
        if(lastPlace==0){
            printBinary_1(n-1,0,str+"0");
            printBinary_1(n-1,1,str+"1");
        }else{
            printBinary_1(n-1,0,str+"0");
        }
    }
    public static void main(String args[]){
        printBinary(3,0,"");
    }
}