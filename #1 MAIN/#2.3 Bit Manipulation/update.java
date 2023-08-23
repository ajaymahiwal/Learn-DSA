


public class update{     
    public static void main(String args[]){  // main method ka only void return type hota hai

        int n=10;
        int i=1;
        int newbit=0 ;

        // if(newbit==0){
        //     int result=n & (~(1<<i));
        // System.out.println(result);
        // }
        // else{
        //     int result=n | (1<<i);
        // System.out.println(result);
        // }

        n=n & (~(1<<i));
        int bitmask=newbit<<i;
        // int result=n | bitmask;
        System.out.println(n | bitmask);


    }
}