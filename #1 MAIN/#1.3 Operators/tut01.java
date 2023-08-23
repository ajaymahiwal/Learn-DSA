//ARITHMETIC OPERATORS

public class tut01{
    public static void main(String args[]){

      int a=10,b=3;   
      //BINARY OPERATORS
      System.out.println("ADDITION OF "       +(a)+" & " +(b) +" is " +(a+b));
      System.out.println("SUBTRACTION OF "    +(a)+" & " +(b) +" is " +(a-b));
      System.out.println("MULTIPLICATION OF " +(a)+" & " +(b) +" is " +(a*b));
      System.out.println("DIVISION OF "       +(a)+" & " +(b) +" is " +(a/b));
      System.out.println("MODULUS OF "        +(a)+" & " +(b) +" is " +(a%b));
      System.out.println("");

     //UNARY OPERATORS
     int x=20;
    //  int y=x;
     
      System.out.println(++x);
      System.out.println(x);

      System.out.println("");

      System.out.println(--x);
      System.out.println(x);

      System.out.println("");

      System.out.println(x--);
      System.out.println(x);

      System.out.println("");

      System.out.println(x++);
      System.out.println(x);


//TERNARY OPERATOR

int marks=50;
System.out.println("You are " + (marks>40 ?"Pass":"Fail"));

    }
}
