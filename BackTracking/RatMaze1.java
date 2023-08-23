
//Date 01-08-23
public class RatMaze1{
    public static boolean isSafe(int maze[][],int visited[][],int x,int y,int n){
        if(x>=0 && x<n && y>=0 && y<n && maze[x][y]==1 && visited[x][y]==0){
            return true;
        }
            return false; 
    }
    public static boolean ratMaze(int maze[][],int visited[][],int x,int y,int n,int dx[],int dy[]){
        if(x==n-1 && y==n-1 && maze[x][y]==1){
            visited[x][y]=1;
            printArr(visited);
            // visited[x][y]=0;
            return true;
        }

        for(int j=0;j<4;j++){
            int nextRow = x+dx[j];
            int nextCol = y+dy[j];
            if(isSafe(maze,visited,nextRow,nextCol,n)){
                visited[x][y]=1;
                if(ratMaze(maze,visited,nextRow,nextCol,n,dx,dy)){
                    return true;
                }
                visited[x][y]=0;
            }
        }
        return false;
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
        int visited[][]=new int[maze.length][maze.length];

        int dx[]={1,0,0,-1};
        int dy[]={0,-1,1,0};

        if(maze[0][0]==1 && ratMaze(maze,visited,0,0,maze.length,dx,dy)){
            System.out.println("Solution Exits");
            printArr(visited);
        }else{
            System.out.println("Soultion not exits");
        }
    }
}