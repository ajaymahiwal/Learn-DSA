


public class Sorted{
    public static boolean IsSorted(int n[],int i){

        if(i==n.length-1){
            return true;
        }
        if(n[i]>n[i+1]){
            return false;
        }
        return IsSorted(n,i+1);
    }
    public static void main(String args[]){

        int n[]={1,2,3,49,5};
        System.out.println(IsSorted(n,0)); //HERE  0 is index 
    }
}