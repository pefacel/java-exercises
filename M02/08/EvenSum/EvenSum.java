package EvenSum;

import java.util.Scanner;

public class EvenSum {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese un número");
        int number = sc.nextInt();
        int sum = 0;
        boolean isEven = false;
        for (int i = 1; i < number + 1; i++) {
            if (isEven) {
                sum = sum + i;
            }
            isEven = !isEven;
        }
        System.out.println("Sumatoria: " + sum);

    }
}
