package Basic;
import java.util.Scanner;

//find prime number till n 

public class Prime_n {

    public static void main (String[] args){
        Scanner scn  = new Scanner(System.in);

        int low = scn.nextInt();
        int high = scn.nextInt();

         int count;

        for(int i = low; i <= high; i++){

           count =0;
           for(int div =2; div*div <= i; div++){
            if(i % div == 0){
                count++;
                break;
            }

           }
           if(count > 0){
            System.out.println("Composite/not Prime");
           }
        }

        scn.close();
    }
    
}
