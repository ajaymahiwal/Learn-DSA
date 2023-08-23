

//COUNTING SORT
public class tut05{
    public static void countingSort(int num[]){
        int n=num.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(num[i],max);
        }

        int count[]=new int[max+1];
        for(int i=0;i<n;i++){
            count[num[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                num[j]=i;
                j++; 
                count[i]--;
            }

        }
        //PRINT
            for(int i=0;i<n;i++){
                System.out.println(num[i]);
            }

    }
    public static void main(String args[]){
        int num[]={3,6,2,4,6,12,4,1,3};

        countingSort(num);
    }
}