



//Date 26-07-23 (PENDING code vse smaj mein aagya CHATGPT Q)
import java.util.*;
public class SubsetSum{
    // public static boolean subsetSum(int arr[],int sum,int i,int tarSum,ArrayList<Integer>list){
    public static boolean subsetSum(int arr[],int sum,int i,int tarSum){
        if(i==arr.length){
            return false;
        }
        if(sum==tarSum){
            // System.out.println(sum);
            return true;
        }
        // list.add(arr[i]);
        System.out.println(tarSum);
        subsetSum(arr,sum+=arr[i],i+1,tarSum+1);
        // sum-=arr[i];
        // subsetSum(arr,sum+=arr[i],i+1,tarSum,list);
        // list.remove(i);
        return subsetSum(arr,sum,i+1,tarSum);
        // subsetSum(arr,sum,i+1,tarSum,list);
        // return false;
    }
    public static void main(String args[]){
        int arr[]={1,2,3};
        int tarSum=8;
        System.out.println(subsetSum(arr,0,0,tarSum));
        // System.out.println(subsetSum(arr,0,0,tarSum,new ArrayList<Integer>()));
    }
}