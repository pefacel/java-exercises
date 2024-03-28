package Timer;

import java.util.Scanner;
 
public class Timer {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese el primer número");
        int number = sc.nextInt();
        while (number >= 0) {
            System.out.println(number);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            --number;
        }

    }
}
