//LOOPS QUESTIONS

public class tut04{
    public static void main(String args[]){

        // PRINT REVERSE OF NUMBER,  EX. 245   INTO   542

        int number=245,last_digit;

        while(number>0){
            last_digit=number%10;
            System.out.print(last_digit);
            number=number/10;
        }
     
     System.out.println("");
     System.out.println("");

    //REVERSE THE GIVEN ORIGNAL NUMBER(ISME REVERSE KERKE AK VARIABLE M STORE KERVANA HAI VO NUM)
         
        int last,num=3672;
        int rev=0;

        while(num>0){
            last=num%10;
            rev= (rev*10)+last;
            num=num/10;
        }
        System.out.println(rev);
        


    }
}