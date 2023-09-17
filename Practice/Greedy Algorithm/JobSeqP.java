
import java.util.*; 
public class JobSeqP{
    static class Job{
        int deadline;
        int profit;
        int id;
        public Job(int d,int p,int i){
            deadline = d;
            profit = p;
            id = i;
        }
    }
    public static void main(String args[]){
        int jobsInfo[][]={{4,20}, {1,10}, {1,40}, {1,30}}; //col-0 =>deadline //col-1=>profit

        ArrayList<Job> jobs= new ArrayList<>();
        for(int i=0;i<jobsInfo.length;i++){
            jobs.add(new Job(jobsInfo[i][0],jobsInfo[i][1],i));
        }

        Collections.sort(jobs, (obj1,obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> seq = new ArrayList<Integer>();
        int time = 0;
        for(int i=0;i<jobs.size();i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("Total Jobs Which a Person Can Do,To get Max Profit:"+ seq.size());
        for(int x=0;x<seq.size();x++){
            System.out.println("Job-"+seq.get(x));
        }
        // Total Jobs Which a Person Can Do,To get Max Profit:2
        // Job-2
        // Job-0
    }
}