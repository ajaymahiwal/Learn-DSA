

//CLEAR RANGE OF BITS
public class clearrange{
    public static void main(String args[]){

        int n=2515;    //100111010011
        int i=2,j=7;
        int a=((-1)<<j+1);  //111100000000
        int b=(1<<i)-1;     //000000000011
        
        int bitmask= a | b; //111100000011

        int result= n & bitmask;    //100100000011
        System.out.println(result);
    }
}