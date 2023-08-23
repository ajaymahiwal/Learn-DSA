

//MERGE SHORT KO "DEPTH FIRST" BHI KHTE HAI
//TIME COMPLEXITY: O(nlogn)  & SPACE COMPLEXITY:O(n)
public class MergeSort{
    //DIVIDE METHOD
    public static void divide(int arr[],int si,int ei){

        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;  //OR  = (si+ei)/2

        divide(arr,si,mid);
        divide(arr,mid+1,ei);

        merge(arr,si,mid,ei);
    }
  
    //MERGE METHOD
    public static void merge(int arr[],int si,int mid,int ei){

        int temp[]=new int[ei-si+1];
        int i=si;  //iteration for left part
        int j=mid+1;  //iteration for right part
        int k=0;    //iteration for temp

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        //for leftover elements of 1st sorted part
        while(i<=mid){
            temp[k++]=arr[i++]; 
            //k++,i++ vala doubt dur go gya ye post increment hai to jo k or i ki value aaye gi uper se to phle vhi le jayegi fir increment hoga k or i me
        }

        //for rightover elements of 2nd sorted part
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        //Copy temp[] to arr[] (Original array)
        for( k=0,i=si;k<temp.length;i++,k++){
            arr[i]=temp[k];
        }
    }

    //PRINT METHOD
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    //MAIN METHOD
    public static void main(String args[]){

        int arr[]={6,3,6,234};
        divide(arr,0,arr.length-1);
        printArr(arr);
    }
}