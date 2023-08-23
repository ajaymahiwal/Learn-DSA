
import java.util.*;
public class NextGreater{
    public static void nextGreaterRight(int[] arr,int[] nextG){
        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextG[i]=-1;
            }else{
                nextG[i]=arr[s.peek()]; //yani peek per bda element hai curr ele se
            }
            s.push(i);

        }

        for(int i:nextG){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void nextGreaterLeft(int[] arr,int[] nextG){
        Stack<Integer> s = new Stack<>();

        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextG[i]=-1;
            }else{
                nextG[i]=arr[s.peek()]; //yani peek per bda element hai curr ele se
            }
            s.push(i);

        }

        for(int i:nextG){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void nextSmallerRight(int[] arr,int[] nextG){
        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextG[i]=-1;
            }else{
                nextG[i]=arr[s.peek()]; //yani peek per bda element hai curr ele se
            }
            s.push(i);

        }

        for(int i:nextG){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void nextSmallerLeft(int[] arr,int[] nextG){
        Stack<Integer> s = new Stack<>();

        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextG[i]=-1;
            }else{
                nextG[i]=arr[s.peek()]; //yani peek per bda element hai curr ele se
            }
            s.push(i);

        }

        for(int i:nextG){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void bruteForceMethod(int[] arr,int[] nextG){ //O(n^2)
        for(int i=0;i<nextG.length;i++){
            nextG[i]=-1; //un cases k liye jha per unse bda koi nhi exist kerta
            //to unke index per 0 by default ki jghe per -1 hoga jo show kre ga ki unse bda koinhi hai array mein unke next left mein
        }
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    nextG[i]=arr[j];
                    break;
                }
            }
        } 
        for(int i:nextG){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {6,8,0,4,3};
        int nextG[]= new int[arr.length];
        // nextGreaterRight(arr,nextG);
        // nextGreaterLeft(arr,nextG);
        // nextSmallerRight(arr,nextG);
        // nextSmallerLeft(arr,nextG);

        bruteForceMethod(arr,nextG);
    }
}