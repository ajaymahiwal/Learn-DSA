

//Majority Elements

public class MooresVoting{

    public static void majorityElement(int arr[]){
        int count=0;
        int participant = mooresVotingAlgo(arr);

        for(int i=0;i<arr.length;i++){
            if(participant==arr[i]){
                count+=1;
            }
        }

        if(count>(arr.length)/2){
            System.out.print("Majority Elements are: "+ participant);
        }
        else{
            System.out.println("No Majority Elements Exist.");
        }
    }

    public static int mooresVotingAlgo(int arr[]){
        int count=0;
        int participant=0;

        for(int i:arr){
            if(count==0){
                participant=i;
            }
            if(participant==i){
                count+=1;
            }else{
                count-=1;
            }
        }
        return participant;
    }
    public static void main(String args[]){
        // int arr[]={3,5,3};
        // int arr[]={3,3,5,5};
        int arr[]={3,3,1,1,5};
        // int arr[]={7,7,5,7,5,1,5,5,7,7,5,5,5,5};
        majorityElement(arr);
    }
}