

public class AssignQ4{

   public static int substringWithSameStAndEnd_0(String str){

        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                    StringBuilder temp = new StringBuilder("");
                for(int k=i;k<=j;k++){
                    Character ch = str.charAt(k);
                    temp.append(ch);
                }
                    // System.out.print(i+" ");
                    System.out.print(temp+" ");
            }
            System.out.println();
        }
        return 0;
    } 


    public static int substringWithSameStAndEnd(String str){

          int result = 0;
        int n = str.length();
      
        // Starting point of substring
      for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++)
                if (s.charAt(i) == s.charAt(j))
                    result++;
      
        return result;
    }
    public static void main(String args[]){

        String str = "aba";
        System.out.println(substringWithSameStAndEnd(str));
    }
}