package Oops;

class Calculator {

    public int add (int n1, int n2 ,int n3){

       return n1 + n2 +n3;
        
    }


    public int add (int n1, int n2){
            return n1 + n2;
    }

    
}

public class Methodoverload{
public static void main(String[] args){

    Calculator m = new Calculator();

   System.out.println(m.add(2, 405 , 5));
    System.out.println(m.add(2, 6));

}
}