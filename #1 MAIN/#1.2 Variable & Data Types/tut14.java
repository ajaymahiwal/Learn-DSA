//TYPE PROMOTION IN JAVA

public class tut14{
    public static void main(String args[]){

    byte a=7;
    short b=23;
    char c='a';    
    // byte bt=a+b+c;
    byte bt=(byte)(a+b+c); //ager sum of a,b,c BYTE range 127 ya 128 se jyda ho gya to -ve aayegi
    System.out.println("Answer:"+ bt);   


    int num1=40;
    short num2=20;
    long num3=80;
    float num4=40.25f;
    /*YHA EXPRESSION(num1+num2+num3+num4) ME FLOAT SABSE BDAA HAI ISLIE JAVA AUTOMATIC SAB KO FLOAT M CONVERT KER DEGA
    */
    // long ans=num1+num2+num3+num4;  //FOR CHECKING UNCOMMENT THIS LINE
    float ans=num1+num2+num3+num4;
    System.out.println("Answer:"+ ans);   










      /*  int c=100,d=2;
        int a=5+'h'; 
        char b=(char)(c-d);
        System.out.println(b);    //ASCII VALUE PRINT HOGI 97 KI YANI b



    
        char ch1='a';
        char ch2='b';
        char ch3='A';
        char ch4='B';
        int number1=ch1;
        int number2=ch2;
        int number3=ch3;
        int number4=ch4;

    // ASCII CHARACTER VALUE WILL PRINT
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);S
    */

    }
}