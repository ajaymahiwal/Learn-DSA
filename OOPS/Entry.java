

import java.util.*;

class Car{
    public String color="yellow";
    private int price=10;
    protected int highSpeed=200;
    int tiresN=4; 

    // public void showDetails(){
    //     System.out.println(price);
    //     System.out.println(color);
    //     System.out.println(highSpeed);
    //     System.out.println(tiresN);
    //     System.out.println();
    // }

    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
}


public class Entry{
    public static void main(String args[]){
        Car bmw= new Car();
        // bmw.showDetails();
        System.out.println(bmw.getPrice());
        bmw.setPrice(100001);
        System.out.println(bmw.getPrice());
        // bmw.showDetails();
        System.out.println(bmw.tiresN);
        System.out.println(bmw.highSpeed);
        // System.out.println(bmw.price);
        System.out.println(bmw.color);
        // int _a=0;
        // int $ajay=0;
        // int $=1;
        // System.out.println($);  //working
        // int 1J=1;
        // System.out.println(1J);  //error
        // int j&=5;
        // System.out.println(j&);  //error
    }
    
}
