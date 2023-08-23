

//DIRECTION IS GIVE IN THE FORM OF N(north),S(south),E(east),W(west)
//EVERY DIRECTION DISTANCE IS 1 IN THIS 
//TIME COMPLEXITY OF THIS PROGRAM => O(n)
import java.util.*;
// import java.lang.Math;
public class shortestpath{
    public static float shortPath(String direction){

        int n=direction.length();
        int x=0,y=0;
        for(int i=0;i<n;i++){
            if(direction.charAt(i)=='N'){
                y++;
            }
            else if(direction.charAt(i)=='S'){
                y--;
            }
            else if(direction.charAt(i)=='E'){
                x++;
            }
            else if(direction.charAt(i)=='W'){
                x--;
            }
        }
        //DISTANCE FORMULA LGA KER KRA H 
        //
        int x2=x*x;
        int y2=y*y;
        int total=x2+y2;
        // System.out.println(total);
        float distance=(float)Math.sqrt(total);
        return distance;
    }
    public static void main(String args[]){

        Scanner s=new Scanner(System.in);
        String direction;
        System.out.println("Enter the directions:");
        direction=s.nextLine();
        
        System.out.println("Shortest distance:"+shortPath(direction));
    }
}