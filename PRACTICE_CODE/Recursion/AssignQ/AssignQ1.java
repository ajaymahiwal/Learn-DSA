

public class AssignQ1{
    public static void findAllOccurance(int arr[],int idx,int key){
        if(arr.length==idx){
            return;
        }
        if(arr[idx]==key){
            System.out.print(idx+" ");
        }
        findAllOccurance(arr,idx+1,key);
    }
    public static void main(String args[]){
        int arr[]={1,2,35,6,7,8,2,9,2,5,2};
        findAllOccurance(arr,0,2);
    }
}