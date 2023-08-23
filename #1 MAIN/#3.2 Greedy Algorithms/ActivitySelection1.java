/*You are given n activities with their start and finish times. Select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time. */
//Activities are Not sorted to end time.(Given Time is Not sorted). ❗❗

//Time Complexity: O(nlogn)
import java.util.*;
public class ActivitySelection1{
    public static void main(String args[]){
        int start[]={0,1,3,5,5,8};
        int end[]={6,2,4,7,9,9};  //end time basis is not sorted

        //Sorting 
        int activities[][]=new int[start.length][3];

                                          //idx start end
    for(int i=0;i<start.length;i++){      // 0    0    6 
        activities[i][0]=i;  //idx        // 1    1    2
        activities[i][1]=start[i];//start // 2    3    4
        activities[i][2]=end[i];//end     // 3    5    7
                                          // 4    5    9
                                          // 5    8    9                              
        }

        //lamda function -> shortform of big funx. bigfunx->Compartor.
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));

        //  idx  start  end
        //   1     1     2 
        //   2     3     4
        //   0     0     6
        //   3     5     7
        //   4     5     9
        //   5     8     9


        //End Time Basis Sorted complete
        int maxAct=0;  
        ArrayList<Integer>ans=new ArrayList<>();

        //1st Activity
        maxAct=1;
        ans.add(activities[0][0]);
        int lastEnd=activities[0][2];
        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=lastEnd){ //Checking activity Overlapping condition
                //activity selection
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd=activities[i][2];
            }
        }

        System.out.println("Max Activities = "+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        
    }
}
//Output:
// Max Activities = 4
// A1 A2 A3 A5 