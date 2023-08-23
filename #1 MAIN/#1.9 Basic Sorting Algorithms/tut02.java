

//SELECTION SORT

public class tut02{
    public static void selectionSort(int numbers[]){
        int n =numbers.length;

        for(int i=0;i<n-1;i++){
            int minPos=i ;
            int swap=0;
            for(int j=i+1;j<n;j++){
                if(numbers[minPos]>numbers[j]){  //FOR DESENDING < USE THIS AT PLACE OF >
                    minPos=j;
                    swap++;
                }
            }
            if(swap<1){
                System.out.println("already sorted");
                break;
            }
            // System.out.println("swap values:"+swap);
            int temp=numbers[minPos];
            numbers[minPos]=numbers[i];
            numbers[i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(numbers[i]);
        }
    }
    public static void main(String args[]){

        int numbers[]={5,4,1,3,2};
        // int numbers[]={1,2,3,4,5};
        selectionSort(numbers);
    }
}