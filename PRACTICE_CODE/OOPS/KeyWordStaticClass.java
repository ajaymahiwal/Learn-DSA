
//READ
//https://www.geeksforgeeks.org/static-class-in-java/

//Nested class = static class
//inner class = non static class 
public class KeyWordStaticClass{

    private static String msg="Hello Everyone today date is 09/06/2023. I am static";
    private String msg1="Hello Everyone today date is 09/06/2023.I am not static";

    static class NestedClass{
        public void display(){
            System.out.println(msg);
        }
        public static void displayStaticMethod(){
            System.out.println(msg);
        }
    }

    class InnerClass{
        public void display(){
            System.out.println(msg);
            System.out.println(msg1);
        }
        public static void displayStaticMethod(){
            System.out.println(msg);
        }
    }

    public static void main(String args[]){
        KeyWordStaticClass.NestedClass nc = new KeyWordStaticClass.NestedClass();
        nc.display();
        KeyWordStaticClass kws= new KeyWordStaticClass();
        KeyWordStaticClass.InnerClass ic= kws.new InnerClass();
        ic.display();

        // KeyWordStaticClass.NestedClass.displayStaticMethod();
        //static method hai isliye direct class se access ker pa rhe hai
// Hello Everyone today date is 09/06/2023. I am static

        // KeyWordStaticClass.InnerClass.displayStaticMethod();
         //static method hai isliye direct class se access ker pa rhe hai
        /**
Hello Everyone today date is 09/06/2023. I am static
/  error: non-static variable msg1 cannot be referenced from a static context
            System.out.println(msg1); /
         */
    }
}