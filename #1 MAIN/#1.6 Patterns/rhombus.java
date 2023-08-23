

//SOLID RHOMBUS
public  class rhombus{
    public static void solid_Rhombus(int n){

        for(int i=1;i<=n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        
    }
    //HOLLOW RHOMBUS(KHALII RHOMNUS)
    public static void hollow_Rhombus(int n){

        for(int i=1;i<=n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
            if(i==1  || j==1 || j==n || i==n){
                      System.out.print("*");
                }
            else{
                System.out.print(" ");
            }
            }

            System.out.println();
        }
        
    }
    public static void main(String args[]){
    //  solid_Rhombus(4);
    hollow_Rhombus(5);
    }
}