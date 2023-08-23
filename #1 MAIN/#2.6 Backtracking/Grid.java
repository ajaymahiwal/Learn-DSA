


public class Grid{
    public static int findPath(int i,int j,int n,int m){
        if(i == n-1 && j== m-1){
            return 1;
        }
        else if(i==n || j==m){
            return 0;
        }

        int w1=findPath(i+1,j,n,m);
        int w2=findPath(i,j+1,n,m);

        return w1+w2;
    }
    public static void main(String args[]){
        int n=3,m=3;
        // int grid[][]=new int[n][m];
        int row=0,col=0;

System.out.print("total number of ways to go from source to desination:"+findPath(row,col,n,m));
    }
}