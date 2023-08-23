

//TRAPPED WATER QUESTION  IMPORTANT !

import java.lang.Math;
public class trappedWater{
    public static int waterTrapped(int height[],int width){
        int n=height.length;
        //Calculate left max boundary -array
        int left_max[]=new int[n];
        left_max[0]=height[0];

        for(int i=1;i<n;i++){
            left_max[i]=Math.max(height[i],left_max[i-1]);
           }


        //Calculate right max boundary -array
        int right_max[]=new int[n];
        right_max[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            right_max[i]=Math.max(height[i],right_max[i+1]);
        }

        
        //Trapped water
        int trapped_water=0;
        for(int i=0;i<n;i++){
            //Water level=min(left_max bound,right_max bound)
            int waterlevel=Math.min(left_max[i],right_max[i]);
            // trapped_water=trapped_water+((waterlevel-height[i])*width);
            trapped_water+=((waterlevel-height[i])*width);
        }

        return trapped_water;


        }


    
    public static void main(String args[]){

        int height[]={4,2,0,6,3,2,5};
        int width=1;

        System.out.println("Trapped Water:"+waterTrapped(height,width));


    }
}