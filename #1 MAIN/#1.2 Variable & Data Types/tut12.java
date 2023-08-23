//AREA OF CIRCLE

import java.util.*;
public class tut12{
    public static void main(String args[]){
        float pi=3.14f,area,radius;
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE RADIUS VALUE:");
        radius=s.nextFloat();
        area=pi*radius*radius;
        System.out.println("Area of Circle:"+area);
    }
}