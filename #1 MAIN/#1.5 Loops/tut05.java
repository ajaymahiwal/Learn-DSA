// BREAK AND CONTINUE IN JAVA

public class tut05{
    public static void main(String args[]){

        int a;   //CONTINUE 
        for(a=0;a<=10;a++){
         if(a==5){
            continue;
         }
        // System.out.print(a +" ");
        System.out.print(a +"\t");
        }

    System.out.println();
    System.out.println();
    System.out.println();

        for(a=0;a<=10;a++)   //BREAK
        {
         if(a==5){
            break;
         }
        // System.out.print(a +" ");
        System.out.print(a +"\t");
        }

    



    }
}