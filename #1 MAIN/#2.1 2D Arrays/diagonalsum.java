

//diagonal sum hum sirf square matrix()) k hi nikal skate hai

public class diagonalsum{
    public static int sumOfDiagonal(int num[][]){

        int n=num.length;
        int m=num[0].length;  //here we can use anyone n or m BECAUSE they both are equal n=m
        int sum=0;
        
//TIME COMPLEXITY OF 1ST METHOD IS O(n^2) but 2ND METHOD IS O(n)

/*      for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    //PRIMARY DIAGONAL
                    sum=+ num[i][j];
                }
                else if(i+j == n-1){
                    //SECONDARY DIAGONAL
                    sum=+ num[i][j];
                }
            }
        } 
        
        */

    //  2nd METHOD
    for(int i=0;i<n;i++){
        //PRIMARY DIAGONAL : i=j
        sum+=num[i][i];  

        //SECONDARY DIAGONAL : i+j=n-1  => j=n-i-1
        if(i != n-i-1){
            sum+=num[i][n-i-1];
        }
       
    }

        return sum;
    }
    public static void main(String args[]){
        //MATRIX SHOULD BE SQUARE IF WE WANT DIAGONAL SUM
        int num[][]={  //5 X 5 matrix 
            {5,2,3,4,5},
            {1,5,3,5,5},
            {1,2,5,4,5},
            {1,5,3,5,5},
            {5,2,3,4,5}
        };

        sumOfDiagonal(num);
    
        System.out.println("Sum Of Diagonals:"+sumOfDiagonal(num));

    }
}