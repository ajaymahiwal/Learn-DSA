
//reverse a stack or push at bottom
import java.util.Stack;
public class PushAtBottom{
    public static void bottomPushing(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        bottomPushing(s,data);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        bottomPushing(s,top);
    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String args[]){
        
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
    /*
        int data=4;
        bottomPushing(s,data);
        while(!s.isEmpty()){
            // System.out.println(s.pop());
            System.out.println(s.peek());
            s.pop();
        }
     */
    //Before reverse  3, 2, 1
    reverse(s);
    // 1, 2, 3 
    printStack(s);

    }
}