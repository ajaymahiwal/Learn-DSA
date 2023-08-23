

//SPIRAL MATRIX IMPORTNT!

public class spiral{
    public static void spiralMatrix(int num[][]){
        int startRow=0;
        int endRow=num.length-1;
        int startCol=0;
        int endCol=num[0].length-1;

        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(num[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(num[i][endCol]+" ");
            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(num[endRow][j]+" ");
            }
            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(num[i][startCol]+" ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
    public static void main(String args[]){

        int num[][]={
            {1,2,3,4,5},
            {1,2,3,4,5},
            {1,2,3,4,5},
            {1,2,3,4,5},
            {1,2,3,4,5}
            // {1,1,1,1,1},
            // {2,2,2,2,2},
            // {3,3,3,3,3},
            // {4,4,4,4,4},
            // {5,5,5,5,5}
        };
        spiralMatrix(num);

    }
}