

public class asending_decending{
    public static void asending(int numbers[]){
        int n=numbers.length;
   
        for(int i=0;i<n;i++){
           
            for(int j=i+1;j<n;j++){
             
            if(numbers[i]>numbers[j]){
                int temp=numbers[i];
                numbers[i]=numbers[j];
                numbers[j]=temp;
           }
            }
       
            
        }

        for(int i=0;i<n;i++){
            System.out.println(numbers[i]);
        }

    }
    public static void main(String args[]){

        int numbers[]={4,3,2,10,1};
        asending(numbers);

    }
}

