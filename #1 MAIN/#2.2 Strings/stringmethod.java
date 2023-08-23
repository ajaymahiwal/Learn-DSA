

//STRING METHODS
public class stringmethod{
    public static void main(String args[]){

        String txt = "Hello World";
System.out.println(txt.toUpperCase());
System.out.println(txt.toLowerCase());



        String s1="AjayMahiwal";
        String s2="hello";
        String s3=new String("HELLO");

        // System.out.println(s1==s3);
        // System.out.println(s1.equals(s2));

        System.out.println(s1==s3);
        System.out.println(s1.equalsIgnoreCase(s3));


        // String str=
        System.out.println(s1.substring(0,5));

        String myStr1 = "A";
        // System.out.println(myStr1.codePointAt(0)); 
        String myStr2 = " ";
        System.out.println(myStr1.compareToIgnoreCase(myStr2)); // Returns 0 because they are equal
    }
}