
import java.util.*;
public class MaxAreaInHistogram{
    public static int maxAreaInHistogram_1(int height[]){
        int maxArea = 0;
        for(int i=0;i<height.length;i++){
            int width=1;
            int prev=i-1;
            int next=i+1;
            while(prev>=0 && height[prev]>=height[i]){
                width++;
                prev--;
            }
            while(next<height.length && height[next]>=height[i]){
                width++;
                next++;
            }

            int currArea = height[i]*width;
            maxArea = Math.max(maxArea,currArea);
        }
        return maxArea;
    }

    public static int maxAreaInHistogram_2(int height[]){
        int n = height.length;
        Stack<Integer> s = new Stack<>();
        int nsr[] = new int[n];
        int nsl[] = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && height[s.peek()] >= height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=n;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        s = new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && height[s.peek()] >= height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        // for(int i:nsr){
        //     System.out.print(i+" ");
        // }
        // System.out.println();
        // for(int i:nsl){
        //     System.out.print(i+" ");
        // }
        // System.out.println();
        int maxArea=0;
        for(int i=0;i<n;i++){
            int width = nsr[i]-nsl[i]-1;
            int currArea = height[i]*width;
            maxArea = Math.max(currArea,maxArea);
        }
        return maxArea;
    }
    public static void main(String args[]){
        int height[]={2,1,5,6,3,6,5};
        System.out.println("Using my method: "+maxAreaInHistogram_1(height));
        System.out.println("Using `Didi method: "+maxAreaInHistogram_2(height));
    }
}