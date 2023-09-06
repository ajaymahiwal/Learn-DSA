


public class QuickSort{

    //QUICKSORT METHOD
    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        //here last element is taken as pivot
        int pIdx=patrition(arr,si,ei); 
        quickSort(arr,si,pIdx-1); //left
        quickSort(arr,pIdx+1,ei); //right
    }

    //PARTITION METHOD
    public static int patrition(int arr[],int si,int ei){
        int pivot=arr[ei]; //here last element is taken as pivot
        int i=si-1; //to make place for elements smaller than pivot

        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        //swap if arr[j]>pivot
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;

        return i;
    }

    //PRINT METHOD
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(); 
    }

    //MAIN METHOD
    public static void main(String args[]){

        int arr[]={6,3,9,8,2,5};
        quickSort(arr,0,arr.length-1);
        printArr(arr);
    }
}