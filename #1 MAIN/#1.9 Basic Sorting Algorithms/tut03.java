

//INSERTION SORT

public class tut03{
    public static void insertionSort(int numbers[]){

        int n=numbers.length;
        
        for(int i=1;i<n;i++){
            int curr=numbers[i]; //current
            int pre=i-1;      //previous
            //finding out the correct position to insert
            while(pre >= 0 && numbers[pre]>curr){
                numbers[pre+1]=numbers[pre];
                pre--;
            }
            //Insertion
            numbers[pre+1]=curr;
        }
        //PRINT THE SORTED NUMBER
        for(int i=0;i<n;i++){
            System.out.println(numbers[i]);
        }
    }
    public static void main(String args[]){

        int numbers[]={5,4,1,3,2};
        insertionSort(numbers);
    }
}