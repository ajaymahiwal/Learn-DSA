

// https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/
public class stringbuild{
    public static void main(String args[]){
        
        //STRING-BUILDER IS MUTABLE MEANS CHANGABLE
        StringBuilder name=new StringBuilder("hello");
        System.out.println(name);
        name.append('a');
        System.out.println(name);
        //STRING IS IMMTUABLE MEANS NOT-CHANGABLE
        //https://www.javatpoint.com/immutable-string
        String str="ajay";
        System.out.println(str);
        str.concat("mahi");
        System.out.println(str);

        Integer a=10;
        String b=a.toString();  //now this is "10" 
        System.out.println(b);

        StringBuilder sb=new StringBuilder("ajay");  
        System.out.println(sb.reverse(););//prints olleH

        StringBuilder str1=new StringBuilder("Hello");  
        // str1.charAt(1);
        System.out.println(str1.substring(0,2));
    
    }

}