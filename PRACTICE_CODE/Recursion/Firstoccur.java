//TIME COMPLEXITY IS O(n) and SPACE COMPLEXITY IS O(n) SAB METHOD KI
public class Firstoccur{
    public static int firstOccurence(int arr[],int key,int i){
        if(i==arr.length){ //base case ager key nhi mili to -1 return hoga
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr,key,i+1);
    }


    public static int lastOccurence(int arr[],int key,int i){
        if(i==0){  //here i equals to arr.length-1
            return -1;   //ager mili hi nhi key to return -1
        }
        if(arr[i]==key){
            return i;
        }
        return lastOccurence(arr,key,i-1);
    }


    public static int lastOccurence1(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOccurence1(arr,key,i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        } 
        return isFound;
    }
    public static void main(String args[]){

        int arr[]={8,3,6,9,5,10,2,5,3};
        // int len=arr.length-1;
        int key=5;
        // System.out.println(firstOccurence(arr,key,0));
        System.out.println(lastOccurence1(arr,key,0));
        // System.out.println(lastOccurence(arr,key,len));
    }
}