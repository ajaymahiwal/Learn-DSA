
//Sort 0s,1s,2s  in O(n) TC
public class NationalDutchProblem{
    public static void nationalDutchProblem(int arr[]){
        int left=0,i=0,right=arr.length-1;

        while(i<=right){
            int num = arr[i];
            switch(num){
                case 0:
                    int temp = arr[i];
                    arr[i] = arr[left];
                    arr[left] = temp;
                    left++;
                    i++;
                    break;

                case 1:
                    i++;
                    break;

                case 2:
                    int temp1 = arr[i];
                    arr[i] = arr[right];
                    arr[right]=temp1;
                    right--;
                    break;
            }
        }
    }
    public static void main(String args[]){
        int arr[]={1,1,0,0,2,2,0,1,1,2};
        nationalDutchProblem(arr);

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}