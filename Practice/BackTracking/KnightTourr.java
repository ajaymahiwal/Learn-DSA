
//Date 30-07-23
//  to
//Date 01-08-23

public class KnightTourr{
    public static boolean isSafe(int board[][],int i,int j){
        // if(i<0 || i >= board.length || j<0 || j>= board.length || board[i][j] != -1){
        //     return false;
        // }
        // return true;
        return (i>=0 && i<board.length && j>=0 && j<board.length && board[i][j]==-1);
    }
    public static boolean checkNum(int board[][],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==-1){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean knightTour(int board[][],int i,int j,int count){
        // if(i<0 || i >= board.length || j<0 || j>= board.length){
        //     return;
        // }

        if(count == board.length*board.length){
            printArr(board);
            return true;
        }
        if(isSafe(board,i+2,j+1)){
            board[i+2][j+1]=count;
            knightTour(board,i+2,j+1,count+1);
            board[i+2][j+1]=-1;
        }
         if(isSafe(board,i+1,j+2)){
            board[i+1][j+2]=count;
            knightTour(board,i+1,j+2,count+1);
            board[i+1][j+2]=-1;
        }
         if(isSafe(board,i-1,j+2)){
            board[i-1][j+2]=count;
            knightTour(board,i-1,j+2,count+1);
            board[i-1][j+2]=-1;
        }
         if(isSafe(board,i-2,j+1)){
            board[i-2][j+1]=count;
            knightTour(board,i-2,j+1,count+1);
            board[i-2][j+1]=-1;
        }
         if(isSafe(board,i-2,j-1)){
            board[i-2][j-1]=count;
            knightTour(board,i-2,j-1,count+1);
            board[i-2][j-1]=-1;
        }
         if(isSafe(board,i-1,j-2)){
            board[i-1][j-2]=count;
            knightTour(board,i-1,j-2,count+1);
            board[i-1][j-2]=-1;
        }
         if(isSafe(board,i+1,j-2)){
            board[i+1][j-2]=count;
            knightTour(board,i+1,j-2,count+1);
            board[i+1][j-2]=-1;
        }
         if(isSafe(board,i+2,j-1)){
            board[i+2][j-1]=count;
            knightTour(board,i+2,j-1,count+1);
            board[i+2][j-1]=-1;
        }
        return false;
    }
    public static void printArr(int board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
            System.out.println();
            System.out.println();
    }
    public static void main(String args[]){
        int n = 8;
        int board[][]=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]=-1;
            }
        }
        board[0][0]=0;
        knightTour(board,0,0,1);
        printArr(board);
    }
}