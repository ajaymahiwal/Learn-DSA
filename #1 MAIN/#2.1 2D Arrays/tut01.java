

//CREATION OR BASIC OF 2D AARRAYS 
//2D ARRAYS IS LIKE MATRIX
import java.util.*;
public class tut01{
    public static void main(String args[]){
        // int num[][]=new int[4][3];
        int num[][]={ {1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}}; 
        int n=num.length;
        int m=num[0].length;

        
        //ASCESS RANDOM ELEMENT FROM MATRIX OR 2D ARRAY
        int ran=num[1][2];
        System.out.println(ran);

        Scanner s=new Scanner(System.in);

        System.out.println("Enter here:");
        //INPUT
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                num[i][j]=s.nextInt();
            }
        }

        //OUTPUT
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }

        //LARGEST ELEMENT IN THIS
        int large=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               large=Math.max(large,num[i][j]);
            }   
        }
        System.out.println("LARGEST ELEMENT IN THIS:"+large);

        //SMALLEST ELEMENT IN THIS
        int small=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               small=Math.min(small,num[i][j]);
            }   
        }
        System.out.println("SMALLEST ELEMENT IN THIS:"+small);



    }
}