

//BASIC OF RECURSION 
public class tut01{
    public static void printDec(int num){ //DECREASING ORDER
        if(num==1){
            System.out.print(num+" ");
            return;
        }
        System.out.print(num+" ");
        printDec(num-1);
        System.out.print("* ");  //* IS JUST USED FOR UNDERSTNDING THE CODE OR RECURSION WORKING
    }

    public static void printInc(int num){ //INCREASING ORDER
        if(num==1){
            System.out.print(num+" ");
            return;
        }
        printInc(num-1);
        System.out.print(num+" ");
        System.out.print("* "); 
    }
 
    public static void main(String args[]){

        printDec(10);
        // System.out.println();
        printInc(10);
    }
}