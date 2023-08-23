

public class SelectionSort{
    public static void SelectionSort(int num[]){
        
        for(int turn=0;turn<num.length-1;turn++){
            int minPosInd=turn;
            boolean swap=false;
            for(int j=turn+1;j<num.length;j++){
                if(num[minPosInd]>num[j]){
                    minPosInd=j;
                    swap=true;
                }
            }

            
            int temp = num[minPosInd];
            num[minPosInd]=num[turn];
            num[turn]=temp;
            printArr(num);
            // if(!swap){ // swap==false
            //     System.out.println("SOrt Completed Early then Normal:");
            //     return;
            // }
        }
        System.out.println("Sort Completed with O(n^2).");

    }
    public static void printArr(int num[]){
        
        for(int i:num){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        // int num[]={2,5,3,4,1};
        // int num[]={2,4,3,5,1};
        // int num[]={0,4,3,5,1};
        int num[]={0,4,3,5,1,1,1,5};

        SelectionSort(num);
    }
}

/**
SWAP NOT WORKING
0 4 3 5 1 
SOrt Completed Early then Normal:   
yha bus 0 hi sorted tha baaki to nhi fir  nhi ye sorted h rh hai Swap ki vajhe se
 */

 /**
 WITHOUT ANY SWAP LOGIC giving right output
0 4 3 5 1 
0 1 3 5 4
0 1 3 5 4
0 1 3 4 5
Sort Completed with O(n^2).
  */

  /**
0 4 3 5 1 1 1 5 
0 1 3 5 4 1 1 5 
0 1 1 5 4 3 1 5 
0 1 1 1 4 3 5 5
0 1 1 1 3 4 5 5
0 1 1 1 3 4 5 5
0 1 1 1 3 4 5 5 
Sort Completed with O(n^2).
   */