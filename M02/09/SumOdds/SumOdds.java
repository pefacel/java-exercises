package SumOdds;

import java.util.Scanner;

public class SumOdds {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese un número: ");

        int number = sc.nextInt();
        int sum = 0;

        boolean isOdd = true;

        for (int i = 1; i < number+1; i++) {
            if (isOdd) {
                sum += i;
            }
            isOdd = !isOdd;
        }
        System.out.println(sum);

    }
}
