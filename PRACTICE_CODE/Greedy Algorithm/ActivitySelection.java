

import java.util.*;
public class ActivitySelection{

    // Time complexity: O(n) & Space O(n) because Already Sorted Given on end basic
    public static void activitySelectionAlreadySorted(){
        // start.length == end.length kykui har activity ka start or end time dono hoge
        int start[] = {1,3,0,5,8,5};
        int end[] =   {2,4,6,7,9,9}; //if end basic is Already Sorted

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        maxAct = 1;
        ans.add(0); //activity index
        int lastEnd = end[0]; //1st activity end time
        for(int i=1;i<start.length;i++){
            if(start[i] >= lastEnd){
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("Max Activities Which Can Be Done: "+ maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.println("A"+ans.get(i));
        }
    }
    
    // Time complexity: O(nlogn) & Space O(n*3) = n
    public static void activitySelection(){
        int start[] = {0,1,3,5,5,8};
        int end[] =   {6,2,4,7,9,9}; //if end basic is NOT Sorted We Will Sort

        int activities[][] = new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0] = i; //index
            activities[i][1] = start[i]; //start
            activities[i][2] = end[i]; //end
        }
        //Sorting on the basic of end 
        //Time complexity : O(nlogn)
        Arrays.sort(activities, Comparator.comparingDouble(o->o[2])); 

        for(int i=0;i<start.length;i++){
            for(int j=0;j<3;j++){
                System.out.print(activities[i][j]+" ");
            }
            System.out.println();
        }
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        maxAct = 1;
        ans.add(activities[0][0]); //activity index
        int lastEnd = activities[0][2]; //1st activity end time
        for(int i=1;i<start.length;i++){
            if(activities[i][1] >= lastEnd){
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Max Activities Which Can Be Done: "+ maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.println("A"+ans.get(i));
        }
    }
    public static void main(String args[]){
        activitySelectionAlreadySorted();
        activitySelection();
    }   
}