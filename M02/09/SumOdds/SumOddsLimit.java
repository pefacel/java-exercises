package SumOdds;

import java.util.Scanner;

public class SumOddsLimit {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese límite inferior: ");
        int minNumber = sc.nextInt();

        System.out.println("Ingrese límite superior: ");
        int maxNumber = sc.nextInt();

        int sum = 0;

        boolean isOddMinNumber = minNumber % 2 != 0;

        for (int i = minNumber; i < maxNumber + 1; i++) {
            if (isOddMinNumber) {
                sum += i;
            }
            isOddMinNumber = !isOddMinNumber;
        }
        System.out.println(sum);

    }
}
