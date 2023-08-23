

//BASIC OF BITWISE OPERATOR
public class tut01{
    public static void main(String args[]){

        int a=3,b=10;
        System.out.println("BITWISE AND: "+ (a & b));
        System.out.println("BITWISE OR: "+ (a | b));
        System.out.println("BITWISE XOR: "+ (a ^ b));
        System.out.println("BITWISE COMPLIMENT: "+ (~a));
        System.out.println("BITWISE LEFT SHIFT: "+ (a<<2));
        // a<<num= a*2^num
        System.out.println("BITWISE RIGHT SHIFT: "+ (a>>1));
        // a>>num= a/2^num
    }
}