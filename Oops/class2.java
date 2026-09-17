package Oops;

class Car{

    public String typeofcar(){

        return "suv";
    }
}

public class class2 {

     public static void main(String[] args){

        Car c = new Car();

        String car = c.typeofcar();

        System.out.print(car);


     }
    
}
