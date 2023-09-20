

import java.util.*;
class HeapSort{

    public static void heapify(int i, int size,int arr[]){
        int maxIdx = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if(left < size && arr[maxIdx] < arr[left]){
            maxIdx = left;
        }
        if(right < size && arr[maxIdx] < arr[right]){
            maxIdx = right;
        }

        if(maxIdx!=i){
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(maxIdx,size,arr);
        }
    }
    public static void heapSort(int arr[]){
        int n = arr.length;

        for(int i=n/2;i>=0;i--){
            heapify(i,n,arr);
        }

        for(int i=n-1;i>0;i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            heapify(0,i,arr);
        }
    }
    public static void main(String args[]){
        int arr[] = {1,4,5,2,3,6};
        heapSort(arr);

        for(int k:arr){
            System.out.print(k+" ");
        }
    }
}