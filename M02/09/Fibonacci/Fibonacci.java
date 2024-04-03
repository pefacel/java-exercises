package Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese un número: ");

        int number = sc.nextInt();
        for (int i = 0; i < number + 1; i++) {
            System.out.println(getFibonacciNumber(i));
        }

    }

    static int getFibonacciNumber(int number) {

        if (number == 0 || number == 1) {
            return number;
        }

        else {
            return getFibonacciNumber(number - 1) + getFibonacciNumber(number - 2);
        }
    }
}
