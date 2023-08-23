

public class CountingSort{
    public static void CountingSort(int num[]){
        int maxN = Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            maxN = Math.max(maxN,num[i]);
        }

        int count[]=new int[maxN+1];

        for(int i=0;i<num.length;i++){
            count[num[i]]++;
        }

        //DESENDING ORDER
        int indexP=0;
        int n = count.length;
        for(int i=n-1;i>=0;i--){
            while(count[i]>0){
                num[indexP]=i;
                indexP++;
                count[i]--;
            }
        }
        
        // int indexP=0;
        // for(int i=0;i<count.length;i++){
        //     while(count[i]>0){
        //         num[indexP]=i;
        //         indexP++;
        //         count[i]--;
        //     }
        // }
        printArr(num);
        System.out.println("Sorted");
}
public static void printArr(int num[]){
    for(int interation=0;interation<num.length;interation++){
        System.out.print(num[interation]+" ");
    }
    System.out.println();
}
    public static void main(String args[]){
        int num[]={1,3,4,6,5,5,5,7,8,9,1};
        CountingSort(num);
    }
}