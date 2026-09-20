package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class array {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int num [] = {2,5,6,7,85,4};

        System.out.println(Arrays.toString(num));


        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }
}
