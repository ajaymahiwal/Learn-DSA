


public class Nqueen{
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


    public static void nQueens(char board[][],int row){
        //base case
        if(row==board.length){
            count++;
            printArr(board);
            return;
        }
        // here j is column
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
            board[row][j]='Q';
            nQueens(board,row+1);
            board[row][j]='x';   //backtracking step
            }
        }

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
        
        nQueens(board,row);
        System.out.println("Total numbers of ways:"+count);
        
    }
}

/*
---chessboard---
Qxxxx
xxQxx
xxxxQ
xQxxx
xxxQx
---chessboard---
Qxxxx
xxxQx
xQxxx
xxxxQ
xxQxx
---chessboard---
xQxxx
xxxQx
Qxxxx
xxQxx
xxxxQ
---chessboard---
xQxxx
xxxxQ
xxQxx
Qxxxx
xxxQx
---chessboard---
xxQxx
Qxxxx
xxxQx
xQxxx
xxxxQ
---chessboard---
xxQxx
xxxxQ
xQxxx
xxxQx
Qxxxx
---chessboard---
xxxQx
Qxxxx
xxQxx
xxxxQ
xQxxx
---chessboard---
xxxQx
xQxxx
xxxxQ
xxQxx
Qxxxx
---chessboard---
xxxxQ
xQxxx
xxxQx
Qxxxx
xxQxx
---chessboard---
xxxxQ
xxQxx
Qxxxx
xxxQx
xQxxx
Total numbers of ways:10
 */