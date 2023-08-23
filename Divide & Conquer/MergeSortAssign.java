

public class MergeSortAssign{

    public static void mergeSort(String arr[],int si,int ei){
        if(si>=ei){
            return ;
        }
        int mid = si+(ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);

        merge(arr,si,mid,ei);
    }

    public static void merge(String arr[],int si,int mid,int ei){
        int i=si,j=mid+1,k=0;
        String temp[]= new String[ei-si+1];

        while(i<=mid && j<=ei){
            // if(compare(arr[i],arr[j]))
            if(arr[i].compareTo(arr[j]) > 0){
                temp[k] = arr[j];
                j++;
            }
            else{
                temp[k] = arr[i];
                i++;
            }

            k++;
        }

        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }

    public static boolean compare(String str1,String str2){
        if(str1.compareTo(str2) > 0){
            return true;  
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        String arr[]={"sun","earth","mars","mercury"};
        mergeSort(arr,0,arr.length-1);

        for(String i:arr){
            System.out.print(i+" ");
        }
    }
}