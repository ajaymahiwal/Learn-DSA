

//Date 21-07-23

public class LastOccurence{
    public static int lastOccur(int arr[],int i,int key,int lastOc){
        if(i==arr.length){
            return lastOc;
        }
        if(arr[i]==key){
            lastOc=i;
        }
        return lastOccur(arr,i+1,key,lastOc);
    }
    public static void main(String args[]){
        int arr[]={8,3,4,6,56,6,5};
        System.out.println(lastOccur(arr,0,5,-1));
    }
}