

public class KeyWordFin{
    static final int a;  //uninitialized final variable //blank final variable.
    // a=10;
    KeyWordFin(int a){
        // this.a=a;
    }
    static{
        a=10;
    }
    public static void main(String args[]){
        KeyWordFin obj = new KeyWordFin(10);
        System.out.println(obj.a);
    }
}