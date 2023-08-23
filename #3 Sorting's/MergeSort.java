

public class MergeSort{
    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        mergeSort(arr,si,mid);  //break and go left side
        mergeSort(arr,mid+1,ei);//break and go right side

        merge(arr,si,mid,ei); // place elements at right position (with merging)
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int i=si,j=mid+1,k=0;
        //eg si=3 and ei=5  then arr size 5-3+1 = 3(because 3 elem exits from idx 3 to 5)
        int temp[]=new int[ei-si+1];

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

        while(i<=mid){
            temp[k++]=arr[i++];
            //k++ i++;
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        for(k=0,i=si;k<temp.length;i++,k++){
            arr[i]=temp[k];
        }
    }
    public static void main(String args[]){
        int arr[]={5,2,3,-1,9,10};
        mergeSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}