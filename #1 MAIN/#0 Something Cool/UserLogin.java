

import java.util.*;
public class UserLogin{
    public static void main(String args[]){
        System.out.println();
        System.out.println("----------");
        if(args.length != 0){
            if("Gargi007".equalsIgnoreCase(args[0]) && "2030".equalsIgnoreCase(args[1])){
                System.out.println("Welcome, Gargi Mahiwal.");
                System.out.print("Now You Can Access All of Data, Which is Saved Here.\n If you face any problem contact me on: \n ajaymahiwal  [Linkedin]  \n ajaymahiwal  [GitHub]  \n If something is urgent then, \n Mail Me : jaymahiwal007@gmail.com \n");
            }else{
                System.out.println("UserName or Password Is Wrong. Try Again.");
            }
        }else{
            System.out.println("You Are a New User!! \nWelcome to UserLoginSystem! ");
        }

        System.out.println("----------");
        System.out.println();
    }
}

/*

    System.out.println(args.length);

    for(int i=0;i<args.length;i++){
        System.out.println(args[i]);
    }


*/