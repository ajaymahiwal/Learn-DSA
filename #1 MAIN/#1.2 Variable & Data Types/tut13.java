//TYPE CASTING

public class tut13{
    public static void main(String args[]){
     int num1=50;
     float num2=num1;  //Widening Casting (automatically) 
     System.out.println("Value of num2:"+num2); 

    
    float num3=55.25f;
    int num4=(int)(num3);    //Narrowing Casting (manually) OR lossy conversion
     System.out.println("Value of num2:"+num4); 


    }
}