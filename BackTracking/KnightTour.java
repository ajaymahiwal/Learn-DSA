
//Date 01-08-23

public class KnightTour{
    public static boolean isSafe(int board[][],int i,int j){
        if(i>=0 && i<board.length && j>=0 && j<board.length && board[i][j]==-1){
            return true;
        }
        return false;
    }
    
    static int totalWay=0;
    public static void knightTour(int board[][],int i,int j,int count,int moveX[],int moveY[]){
        if(count == board.length*board.length){
            System.out.println("Method-"+(totalWay+=1));
            printArr(board);
            return ;
        }

        for(int k=0;k<8;k++){
            int nextRow= i + moveX[k];
            int nextCol= j + moveY[k];

            if(isSafe(board,nextRow,nextCol)){
                board[nextRow][nextCol]=count;
                knightTour(board,nextRow,nextCol,count+1,moveX,moveY);
                    // return true;
                // }
                board[nextRow][nextCol]=-1;
            }
        }
        // return false;
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
        int moveX[]={2,1,-1,-2,-2,-1,1,2};
        int moveY[]={1,2,2,1,-1,-2,-2,-1};
        board[0][0]=0; //start point 
        knightTour(board,0,0,1,moveX,moveY);
        // printArr(board);
    }
}