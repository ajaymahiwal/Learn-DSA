

public class InsertionSort{
    public static void InsertionSort(int num[]){
        //Hum phle element of array ko sorted assume ker rhe hai, fir next element ko compare ker k uske sath usko sahi postion per lga dege
        for(int i=1;i<num.length;i++){
            int curr=num[i];
            int prev=i-1;  //ye alreaady sorted man rkha hai

            while(prev>=0 && num[prev]>curr){
                num[prev+1] = num[prev];
                prev--;
            }
            num[prev+1]=curr;
            printArr(num);
        }
        System.out.println("SOrting Complted with O(n^2).");
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
        int num[]={0,4,3,5,1};
        InsertionSort(num);
        //In thhis No need of Swap, if already sorted huya array to O(n) hi TC hogi kuykki ander vala loop ki condition true hi nhi hogii
    }
}

/**
0 4 3 5 1 
0 3 4 5 1
0 3 4 5 1
0 1 3 4 5
SOrting Complted with O(n^2).
 */