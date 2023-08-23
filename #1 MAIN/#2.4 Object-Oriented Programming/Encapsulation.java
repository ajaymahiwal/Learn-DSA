


public class Encapsulation{
    public static void main(String args[]){

        Person obj=new Person();
        obj.setNaam("Ajay Mahiwal");
        System.out.println(obj.getNaam());
    }
}

class Person{
    private String name="aj";

    //SETTER
    public void setNaam(String name){
        this.name=name;
    }
    //GETTER
    public String getNaam(){
        return name;
    }
}