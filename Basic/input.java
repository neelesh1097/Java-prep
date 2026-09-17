package Basic;
import java.util.Scanner;

public class input {

    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        System.out.println("The number you entered is: " + n);

        for(int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        scn.close();
        
    }
    
}
