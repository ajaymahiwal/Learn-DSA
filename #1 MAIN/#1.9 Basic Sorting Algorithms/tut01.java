

//sorting defination
//Bubble sort-CODE  

public class tut01{
    public static void bubbleSort(int numbers[]){
        int n=numbers.length;
        // int swap;

        for(int turn=0;turn <= n-2;turn++){
            int swap=0;  
            for(int j=0;j <= n-2-turn;j++){
                if(numbers[j]>numbers[j+1]){ //FOR DESENDING < USE THIS AT PLACE OF >
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                    swap++;
                }
            }
        System.out.println("now swap value is:"+swap);
             if(swap<1){
                // System.out.println("already sorted");
                    break;
                } 
        }

        for(int i=0;i<n;i++){
            System.out.println(numbers[i]);
        }
    }
    public static void main(String args[]){

        int numbers[]={5,4,3,1,2};
        // int numbers[]={1,2,3,4,5};
        bubbleSort(numbers);
    }
}

