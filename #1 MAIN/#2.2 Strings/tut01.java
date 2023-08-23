


public class tut01{
    public static void main(String args[]){

        String s="Sachin";  
        s.concat(" Tendulkar");//concat() method appends the string at the end  
        System.out.println(s);//will print Sachin because strings are immutable objects  

        String s1="ajay";
        String s2="ajay";
        String s3=new String("ajay");
    }
}