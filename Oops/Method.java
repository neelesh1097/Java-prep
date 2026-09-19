package Oops;

class cars {

    public void car(String s) {

        System.out.println("sedan");
    }

    public String newCar(String n) {

        return "Suv";
    }

}

public class Method {

    public static void main(String[] args) {

        cars c = new cars();
        c.car("Honda Civic");
        System.out.println(c.newCar("Harrier"));

    }

}
