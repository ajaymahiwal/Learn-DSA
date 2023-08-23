


public class Inheritance{
    public static void main(String args[]){  
        // C obj=new C();  
        // obj.msg();//Now which msg() method would be invoked?  -> No
        Circle cir = new Circle(1);
        Square sq = new Square(5);

        Shape sh=new Shape(cir,sq);
        System.out.println(sh.getTotalArea());
        // System.out.println(Math.PI);
    }  
}

//Aggregation
class Shape{
    Circle cir;//Aggregation (If a class have an entity reference, it is known as Aggregation.)
    Square sq; //Aggregation

    Shape(Circle cir,Square sq){
        this.cir=cir;
        this.sq=sq;
    }
    double getTotalArea(){
        return cir.getArea()+sq.getArea();
    }
}
class Circle{
    double rad;
    Circle(double rad){
        this.rad=rad;
    }
    double getArea(){
        return Math.PI*rad*rad;
    }
}

class Square{
    double side;
    Square(double side){
        this.side=side;
    }
    double getArea(){
        return side*side;
    }
}



class A {
    int a=0;
}
class B extends A{

}

/**
class A{  
    void msg(){System.out.println("Hello");}  
}  
class B{  
    void msg(){System.out.println("Welcome");}  
}  
class C extends A,B{//suppose if it were  
   
}  
//COMPILE TIME ERROR WILL OCCUR
 */