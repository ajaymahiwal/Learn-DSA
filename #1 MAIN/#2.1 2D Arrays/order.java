

//I AM CONFUSED WITH ROW ORDER OR COLUMN ORDER WHICH IS GIVEN AT JAVATPOINT WEBSITE

//ORDER OF STORE DATA IN CELLS  
import java.util.*;
public class order{
    public static void main(String args[]){

        int array[][]=new int[3][3];
        int n=array.length;   //rows length
        int m=array[0].length;  //columns length

        Scanner s=new Scanner(System.in);
        System.out.println("Enter here");

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                array[i][j]=s.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(array[j][i]);
            }
            System.out.println();
        }
    }
}