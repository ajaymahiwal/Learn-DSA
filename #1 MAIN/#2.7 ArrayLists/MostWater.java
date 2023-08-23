


import java.util.*;
public class MostWater{
    /*
    //brute force O(n^2)
    public static int waterStored(ArrayList<Integer> height){
        int maxwater=0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int minHeight=Math.min(height.get(i),height.get(j));
                int width=j-i;
                int currWater=minHeight*width;
                maxwater=Math.max(currWater,maxwater);
            }
        }
        return maxwater;
    }*/

    // 2 pointer approach =>  O(n)
    public static int waterStored(ArrayList<Integer> height){
        int lp=0;//left point
        int rp=height.size()-1;//right point
        int maxwater=0;
        while(lp<rp){
            int minHeight=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int currWater=minHeight*width;
            maxwater=Math.max(currWater,maxwater);

            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxwater;
    }

    public static void main(String args[]){

        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(height);

        System.out.println("MostWater stored :"+waterStored(height));
    }
}