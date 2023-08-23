

// Find total no. of 1(set bit) in a number
public class count{
    public static void main(String args[]){

        //https://youtu.be/h7meukyY_bQ?t=730
        int n=10; //1010   so,in this 1's are 2 times
        int count=0;
        while(n != 0){
            n=n & (n-1);
            count++;
        }
        System.out.println("Total no. of 1(set bit): "+count);

    }
}