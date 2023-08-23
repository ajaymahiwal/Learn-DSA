
public class Sudoku {
    public static boolean isSafe(int sudoku[][],int row,int col,int digit){
        // column
        for(int i=0;i<=8;i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }

        // row
        for(int j=0;j<=8;j++){
            if(sudoku[row][j]==digit){
                return false;
            }
        }

        // grid
        int sr=(row/3)*3;  //starting row
        int sc=(col/3)*3;  //starting col
        //3x3 grid
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }

        return true;
    }


    public static boolean sudokuSolver(int sudoku[][],int row,int col){
        //base case
        if(row==9){
            return true; 
        }

        //recursion
        int nextRow=row; int nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }

        if(sudoku[row][col]!=0){
            return sudokuSolver(sudoku,nextRow,nextCol);
        }
        for(int digit=1;digit<=9;digit++){
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
                if(sudokuSolver(sudoku,nextRow,nextCol)){ // sol'n exits.
                     return true;
                }
            }
            sudoku[row][col]=0;
        }

        return false;
    }

    public static void printSuduko(int sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int sudoku[][]={
         {3, 0, 6, 5, 0, 8, 4, 0, 0}, 
         {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
         {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
         {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
         {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
         {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
         {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
         {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
         {0, 0, 5, 2, 0, 6, 3, 0, 0} 
        };

        if(sudokuSolver(sudoku,0,0)){
            System.out.println("Solution Exits:");
            printSuduko(sudoku);
        }
        else{
            System.out.println("Solution does not Exits.");
        }
    }
}