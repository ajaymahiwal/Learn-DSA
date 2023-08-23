public class butterfly{
    public static void butterfly(int n){
        int m=n/2;
        //1st half
            for(int i=1;i<=m;i++){
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space
            for(int space=1;space<=n-(2*i);space++){   //space condition : 2*(m-i) ye bhi tik hai
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
         
         //2nd half
        for(int i=m;i>=1;i--){
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space
            for(int space=1;space<=n-(2*i);space++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            
            

            System.out.println();
        }

    }

    public static void main(String args[]){
        butterfly(8);
    }
}