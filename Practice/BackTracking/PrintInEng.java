

public class PrintInEng{
    public static void printInENG(int n, String arr[]){
        if(n==0){
            return;
        }
        int lastNum = n % 10;
        n = n / 10;

        printInENG(n,arr);
        System.out.print(arr[lastNum]+" ");
    }

    public static int length(String str){
        if(str==""){
            return 0;
        }
        return 1 + length(str.substring(1)); //ye 1 har baar ak kam character kam kerke aage se string se aage call lga rha hai 
    }
    public static void main(String args[]){
        String arr[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        printInENG(2019,arr);
        
        System.out.println();

        String str = "Ajay";
        System.out.println(length(str));
    }
}