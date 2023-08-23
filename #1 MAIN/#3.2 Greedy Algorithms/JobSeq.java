
//https://www.geeksforgeeks.org/job-sequencing-problem/#:~:text=Given%20an%20array%20of%20jobs,for%20any%20job%20is%201.

import java.util.*;
public class JobSeq{
    static class Job{
        int id;
        int deadline;
        int profit;

    //Objects m data store kervane k liye Constructre bna lege
        public Job(int i,int d,int p){ 
            id=i;
            deadline=d;
            profit=p;
        }
    }
    public static void main(String args[]){
        int jobInfo[][]={{4,20}, {1,10}, {1,40}, {1,30}}; //col-0 =>deadline //col-1=>profit
//Arraylist bnaii hai Job type ki jisme Objects Store hoge with Data=>(id,deadline,profit)
        ArrayList<Job> jobs=new ArrayList<>();

        //ab object m data store kerva dege
        for(int i=0;i<jobInfo.length;i++){
            jobs.add(new Job(i ,jobInfo[i][0] ,jobInfo[i][1]));
        }

       //Sort the ArrayList(Objects) On the basis of profit
      //Collections.sort(jobs, (obj1,obj2) -> obj1.profit - obj2.profit); //Asecending Order
        Collections.sort(jobs, (obj1,obj2) -> obj2.profit - obj1.profit); //Desecending Order
        //print Sorted objects on the basis of profit
        for(int i=0;i<jobs.size();i++){
        Job currJ=jobs.get(i);
            System.out.print(currJ.id+" "+currJ.deadline+" "+currJ.profit);
            System.out.println();
        }
/**
2 1 40
3 1 30
0 4 20
1 1 10
 */
//ager hume yha sorting kisi or k basis per kerni hoti to hum profit ki jaghe per vo likh dete 
//Ex.sort on the basis of id => Collections.sort(jobs,(obj1,obj2)-> obj2.id - obj1.id);

//ab sort to chuke hai object on the basis of profit to ab hum compare kerke us seq ko store kerva lege is seq naam ki arraylist m
        ArrayList<Integer> seq=new ArrayList<>();
        int time=0;
        for(int i=0;i<jobs.size();i++){
            Job curr=jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }
        }

        //print seq
        System.out.println("Max jobs jitne hum ker skte hai= "+ seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
    }
}
/**
Max jobs jitne hum ker skte hai= 2
 2 0    <= ye index hai yani id of jobs
 */