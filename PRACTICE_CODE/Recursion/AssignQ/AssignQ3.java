

public class AssignQ3{
    public static int strLength(String str){
        if(str.equals("")){
            return 0;
        }
        else{
            return strLength(str.substring(1))+1;  //har baar ak char kam hota jayega
        }
    }
    public static void main(String args[]){
        String str="ajay";
        System.out.println(strLength(str));
        // System.out.println(str.substring(2));
    }
}