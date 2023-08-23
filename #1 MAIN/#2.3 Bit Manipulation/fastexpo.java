


public class fastexpo{
    public static void main(String args[]){

       
        int a=2;
        int n=25;
        int ans=1;
        System.out.print(a+"^"+n+" answer is: ");
        while(n>0){
            if((n & 1) !=0){
                ans= ans * a;
            }
            a=a*a;
            n=n>>1;
        }
        System.out.println(ans);
    }
}