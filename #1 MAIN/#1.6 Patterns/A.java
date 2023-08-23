public class A{
    public static void a1_and_a3(int n){
         for(int i=0;i<n/5;i++){
            for(int j=0;j<n;j++){
                System.out.print("0");
            }
            System.out.println();
        }
    }
    public static void a2_and_a4(int n){
         for(int i=0;i<(n/5)+1;i++){
            for(int j=0;j<3;j++){
                System.out.print("0");
            }
            for(int space=0;space<4;space++){
                System.out.print(" ");
            }
            for(int j=0;j<3;j++){
                System.out.print("0");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){

        int n=10;
        a1_and_a3(n);
        a2_and_a4(n);
        a1_and_a3(n);
        a2_and_a4(n);
     
    }
}