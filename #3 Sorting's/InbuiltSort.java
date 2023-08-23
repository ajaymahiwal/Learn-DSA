
import java.util.*;
public class InbuiltSort{
    public static void printArr(int num[]){
        for(int k=0;k<num.length;k++){
            System.out.print(num[k]+" ");
        }
        System.out.println();
    }
    public static void printArr(Integer num[]){
        for(int k=0;k<num.length;k++){
            System.out.print(num[k]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={1,3,5,1,3,4,5,9};
        Arrays.sort(arr,0,6);
        printArr(arr);
        Arrays.sort(arr);
        printArr(arr);

        Integer num[]={7,3,0,1,2,77,4,99};
        Arrays.sort(num,0,5,Collections.reverseOrder());
        printArr(num);
        Arrays.sort(num,Collections.reverseOrder());
        printArr(num);
    }
}