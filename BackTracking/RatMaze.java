

public class RatMaze{
    static int count =0;
    public static boolean isSafe(int maze[][],int ans[][],int x,int y,int n){
        if(x==n || x<0 || y==n || y<0 || maze[x][y]==0 || ans[x][y]==1){
            return false;
        }
        return true;
    }
    public static void ratMaze(int maze[][],int x,int y,int n,int ans[][]){
        if(x==n-1 && y==n-1 && maze[x][y]==1){
            ans[x][y]=1;
            // return true;
            printArr(ans);
            ans[x][y]=0;
            count++;
            System.out.println("DOne : "+count);
            
            return;
        }
        
        // if(ans[x][y]==1){ //visited or not
        //     return ;
        // }
        
        if(isSafe(maze,ans,x+1,y,n)){  // down
           ans[x][y]=1;
             ratMaze(maze,x+1,y,n,ans);
            ans[x][y]=0;
        }

        if(isSafe(maze,ans,x,y-1,n)){  //  left
        ans[x][y]=1;
             ratMaze(maze,x,y-1,n,ans);
            ans[x][y]=0;
        }
        
        if(isSafe(maze,ans,x,y+1,n)){  // right
        ans[x][y]=1;
             ratMaze(maze,x,y+1,n,ans);
            ans[x][y]=0;
        }
        
        if(isSafe(maze,ans,x-1,y,n)){  // up
        ans[x][y]=1;
             ratMaze(maze,x-1,y,n,ans);
            ans[x][y]=0;
        }

        
            // ratMaze(maze,x-1,y,n);
            // ratMaze(maze,x,y+1,n);
            // ratMaze(maze,x,y-1,n);
            // ratMaze(maze,x+1,y,n);

        

        

        return ;
    }
    public static void printArr(int maze[][]){
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze.length;j++){
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        // n x n 2D maze
        int maze[][]={
            {1,0,1,1},
            {1,1,0,1},
            {1,1,1,0},
            {1,1,1,1}
        };
        int ans[][]=new int[maze.length][maze.length];//this array is for checking places, that place is visited or not. OR to check that place is part of Path or not

        //maze[0][0] must equal to 1 kukyki 0 per to jana nhi hai Rat ko
        if(maze[0][0]==1){
        ratMaze(maze,0,0,maze.length,ans);
        }
        //     System.out.println("Solution Exits");
        //     printArr(ans);
        // }else{
        //     System.out.println("Solution Not Exits");
        // }

                    // printArr(ans);

    }
}

// 1 0 0 0 
// 1 0 0 0
// 1 0 0 0
// 1 1 1 1
// DOne : 1


// 1 0 0 0
// 1 0 0 0
// 1 1 1 0
// 1 1 1 1 
// DOne : 2


// 1 0 0 0
// 1 0 0 0
// 1 1 0 0
// 0 1 1 1
// DOne : 3


// 1 0 0 0 
// 1 0 0 0
// 1 1 1 0
// 0 0 1 1
// DOne : 4


// 1 0 0 0
// 1 1 0 0 
// 0 1 0 0
// 0 1 1 1
// DOne : 5


// 1 0 0 0
// 1 1 0 0
// 1 1 0 0
// 1 1 1 1
// DOne : 6


// 1 0 0 0
// 1 1 0 0
// 0 1 1 0 
// 0 0 1 1
// DOne : 7
