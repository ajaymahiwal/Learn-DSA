

//PRINT ONLY ONE SOLUTION OF N QUUENS PROBLEM
public class NquuenPrintOneSol{
    static int count=0;

    public static boolean isSafe(char board[][],int row,int col){
        //vertical up
        for(int i=row;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonal left up
        for(int i=row-1,j=col-1; i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diagonal right down
        for(int i=row-1,j=col+1; i>=0 && j<board.length;  i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }


    public static boolean nQueens(char board[][],int row){
        //base case
        if(row==board.length){
            count++;
            // printArr(board);
            return true;
        }

        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
            board[row][j]='Q';
            if(nQueens(board,row+1)){
                return true;
            }
            board[row][j]='x'; //backtracking step
            }
        }
        return false;
    }


    public static void printArr(char board[][]){
        System.out.println("---chessboard---");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }


    public static void main(String args[]){

        int n=5;
        char board[][]=new char[n][n];
        int row=0;
        //initilization
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        
        if(nQueens(board,row)){
            System.out.println("Solution is possible.");
            printArr(board);
        }
        else{
            System.out.println("Solution is not possble.");
        }
        // System.out.println("Total numbers of ways:"+count);
    }
}