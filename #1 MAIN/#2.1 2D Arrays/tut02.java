

//SEARCHING A ELEMENT IN 2D ARRAY
public class tut02{
        public static boolean search(int matrix[][],int key){
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==key){
                    System.out.println("Found at cell:(" + i +"," + j +")" );
                    return true;
                }
            }
        }
        System.out.println("NOT Found.");
        return false;
    }
    public static void main(String args[]){

        // int matrix[][]=new int[4][3];  // 4 is here rows and 3 is columns
        int matrix[][]={ {1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};  //matrix order=4*3
        int key=9;
        search(matrix,key);
    }

}