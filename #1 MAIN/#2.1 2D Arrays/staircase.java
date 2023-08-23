

//WE CAN ALSO USE BRUTE FORCE OR ROW-WISE & COLUME-WISE METHOD TO FIND OR SEARCH A VALUE FROM 2D ARRAY
//BRUTE FORCE => O(n^2)       ROW-WISE & COLUME-WISE=> O(nlogn) solve using binary search

//THAT'S WHY WE USE STAIRCASE SEARCH ITS TIME COMPLEXITY IS O(n+m), n is no.OfRow m is no.OfCol

public class staircase{
    public static boolean staircaseSearch(int num[][],int key){

     //LEFT-BOTTOM APPROCH
/*
        int row=0,col=num[0].length-1;
        while(row<num.length && col>=0){
            if(num[row][col]==key){
                System.out.println("Found at:("+row+","+col+")");
                return true;
            }
            else if(key<num[row][col]){
                col--;
            }
            else if(key>num[row][col]){
                row++;
            }
        }
        System.out.println("Not Found !");
        return false;
 */

     //TOP-RIGHT APPROCH

     int row=num.length-1,col=0;
     while(row>=0 && col<=num[0].length-1){
        if(key==num[row][col]){
            System.out.println("Found at:("+row+","+col+")");
            return true;
        }
        else if(key<num[row][col]){
            row--;
        }
        else if(key>num[row][col]){
            col++;
        }
     }
     System.out.println("Not Found !");
        return false;
     

    }
    public static void main(String args[]){
        
        int num[][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };

        int key=33;
        staircaseSearch(num,key);
    }
}