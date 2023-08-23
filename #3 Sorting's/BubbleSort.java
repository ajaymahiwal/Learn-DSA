

public class BubbleSort{
    public static void BubbleSort(int num[]){

        for(int i=0;i<=num.length-2;i++){
            boolean swap=false;
            System.out.println("Turn "+i+" :");
            for(int j=0;j<=num.length-2-i;j++){
                if(num[j]>num[j+1]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                    swap=true;
                }
                
                printArr(num);
            System.out.println();
            
            }
            if(!swap){  //swap==false
                System.out.println("SOrt Completed Early then Normal:");
                return;
            }
            
        }
        System.out.println("Sort Completed with O(n^2).");
    }
    public static void printArr(int num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String args[]){
        int num[]={1,5,3,7,8};
        // int num[]={1,2,3,4,5};
        // int num[]={5,3,4,2,1};
        BubbleSort(num);
    }
}

/***
Turn 0 :
1 5 3 7 8 
1 3 5 7 8 
1 3 5 7 8
1 3 5 7 8
Turn 1 :
1 3 5 7 8 
1 3 5 7 8
1 3 5 7 8
SOrt Completed Early then Normal:
 */



 /***
 Turn 0 :
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5
1 2 3 4 5
SOrt Completed Early then Normal:


  */


  /***
  Turn 0 :
3 5 4 2 1 
3 4 5 2 1
3 4 2 5 1
3 4 2 1 5
Turn 1 :
3 4 2 1 5
3 2 4 1 5
3 2 1 4 5
Turn 2 :
2 3 1 4 5 
2 1 3 4 5
Turn 3 :
1 2 3 4 5
Sort Completed with O(n^2).
   */