


public class Inheritance1{
    public static void main(String args[]){

        Address adress1 = new Address("Hisar","Haryana","India");
        Address adress2 = new Address("Narwana","Haryana","India");

        Employee emp1= new Employee("Ajay",205);
        // Employee emp2= new Employee("Aman",102,adress1);

        emp1.getDetails();
        // emp2.getDetails();

    }
}


class Address{
    String city;
    String state;
    String country;

    Address(String c,String s,String con){
        city=c;
        state=s;
        country=con;
    }
    Address(){
    }
}

class Employee{
    String name;
    int id;
    Address address=new Address(); //Aggregation
    Employee(String name,int id){
        this.name=name;
        this.id=id;
        this.address=address;
    }

    void getDetails(){
        System.out.println("ID Number: "+id+" "+name+" adress is :"+ address.city+" "+address.state+" " +address.country);
    }
}