

import java.util.*;
class JobSeq_1{
    public static void main(String args[]){
        int jobsInfo[][]={{4,20}, {1,10}, {1,40}, {1,30}}; //col-0 =>deadline //col-1=>profit
        int jobs[][] = new int [jobsInfo.length][3];
        for(int i=0;i<jobsInfo.length;i++){
            jobs[i][0] = i; //idx
            jobs[i][1] = jobsInfo[i][0]; //deadline
            jobs[i][2] = jobsInfo[i][1]; //profit
        }

        //sort on the basic of profit
        Arrays.sort(jobs, Comparator.comparingDouble(o->o[2])); 
        //isne ascending order mein sort kiya hai lekin hmme to decreasing mein chaiye hai to uske liye hum reverse loop use ker lege piche se access kerna start ker lege

        for(int i=jobs.length-1;i>=0;i--){
            for(int j=0;j<jobs[0].length;j++){
                System.out.print(jobs[i][j]+" ");
            }
            System.out.println();
        }
       //  id  deadline  profit
        //  2     1        40 
        //  3     1        30
        //  0     4        20
        //  1     1        10


        ArrayList<Integer> seq = new ArrayList<>();
        int maxProfit = 0;
        int time = 0;
        for(int i=jobs.length-1;i>=0;i--){
            if(time<jobs[i][1]){
                seq.add(jobs[i][0]);
                time++;
                maxProfit+=jobs[i][2];
            }
        }
        System.out.println("Total Jobs Which a Person Can Do,To get Max Profit:"+ seq.size());
        System.out.println("Total Max Profit:"+ maxProfit);
        for(int x=0;x<seq.size();x++){
            System.out.println("Job-"+seq.get(x));
        }

        // Total Jobs Which a Person Can Do,To get Max Profit:2
        // Total Max Profit:60
        // Job-2
        // Job-0
    }
}