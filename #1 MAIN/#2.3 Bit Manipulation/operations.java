


public class operations{
    public static void main(String args[]){

        //GET ith Bit
        int n=12; //101
        int i=5; //ith index no.
        int bitmask=1<<i;
        if((n & bitmask)==0){
            System.out.println("ith bit of this number is 0");
        }
        else{
            System.out.println("ith bit of this number is 1");
        }

        //SET ith Bit
        int result=(n | bitmask);
        System.out.println("result after set on ith bit:"+result); 
        //NOW n=111  set bit ko hum 1 set kerna bhi kh skte h

        //CLEAR ith Bit
        int result1= n & (~(bitmask));
        System.out.println("result after clear ith bit:"+result1);
        //NOW n=101 after clear 1st position index bit [ 111 se 101 ]

    }
}