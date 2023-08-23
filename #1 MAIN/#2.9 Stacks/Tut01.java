
//IMPLEMENTATION USING ARRAYLIST
import java.util.ArrayList;
public class Tut01{
    public static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();
        //is empty method
        public static boolean isEmpty(){
            return list.size()==0;  //arraylist ka size ager 0 huaa to true else false
        }
        //push method
        public static void push(int data){
            list.add(data);
        }
        //pop method    (delete kerna ya fir nikal dena stack me se)
        public static int pop(){
            if(isEmpty()){
                return -1;  //jab stack khali ho jaye gi
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //peek method
        public static int peek(){
             if(isEmpty()){
                return -1;  //jab stack khali ho jaye gi
            }
            return list.get(list.size()-1);
        }
    }

    public static void main(String args[]){
        // Tut01 name=new Tut01();
        Stack obj=new Stack();
        /*hume obj bnana pda in pop(),push() etc. method ko call kerne k liye jabki ye static methods the uska karan hai ki ye main class m nhii ak nested class Stack m the isliye hume in static method ko call kerne k liye Stack class ka object ki jarurt padiii*/
        obj.push(1);
        obj.push(2);
        obj.push(3);

          System.out.println("LIFO(last in first out) method is used in Stack");
          //jo last m aayga vhi phle jayega.
        while(!obj.isEmpty()){  //jab tak stack empty nhi hogi loop clta rhega
           System.out.println(obj.peek());
           obj.pop();
        }
    }
}
