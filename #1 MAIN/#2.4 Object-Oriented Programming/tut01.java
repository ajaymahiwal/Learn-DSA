public class tut01 {

  public static void main(String args[]) {
    Pen myObj1 = new Pen();
    myObj1.setColor("yellow");
    System.out.println("color is: " + myObj1.color);
    // myObj1.tip=100;
    System.out.println("color is: " + myObj1.tip);

    Car Rollsroyce = new Car(); //objects
    Car Swift = new Car();
    Car Audi = new Car();
    Car Toyata = new Car();
    Car Volvo = new Car();

    Rollsroyce.price = 450000;
    Swift.price = 12200;
    Audi.price = 42000;
    Toyata.price = 26500;
    Volvo.price = 45000;
  }
}

class Car {

  String wheel; //FILEDS OR ATTRIBUTES
  public int price;
}

class Pen {

  String color;
  int tip = 100;

  void setColor(String newcolor) {
    color = newcolor;
  }

  void setTip(int newtip) {
    tip = newtip;
  }
}
