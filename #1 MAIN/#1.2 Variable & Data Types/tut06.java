//DATA TYPE IN JAVA

 
public class tut06{
    public static void main(String args[]){
        //PRIMITIVE DATA TYPES
        int a=10815;
        long b=23459626725678L;   //AGER YE L HTA DE TO ERROR AAYE GI CHECK KER K DEKH
        float c=5667.55678958f;   //f or F is must at the suffix in float .
        double d=54545.3233345678765478;
        byte e=50;
        short f=500;
        boolean g=true;

//FOR CHECK THE DATA TYPE OF VARIABLES : ((Object)VARIBLE_NAME).getClass().getSimpleName()
System.out.println(a + " is of type " + ((Object)a).getClass().getSimpleName());
System.out.println(b + " is of type " + ((Object)b).getClass().getSimpleName());
System.out.println(c + " is of type " + ((Object)c).getClass().getSimpleName());
System.out.println(d + " is of type " + ((Object)d).getClass().getSimpleName());

    }
}
