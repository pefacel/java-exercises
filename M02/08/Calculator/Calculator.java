package Calculator;

import java.util.Scanner;

public class Calculator {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese el primer número");
        Double firstNumber = sc.nextDouble();
        System.out.println("Ingrese el primer número");
        Double secondNumber = sc.nextDouble();

        System.out.println(
                "Eliga una opcion:" +
                        "\n a. Sumar." +
                        "\n b. Restar." +
                        "\n c. Multiplicar." +
                        "\n d. Dividir." +
                        "\n e. Salir.");

        String option = sc.next();

        switch (option) {
            case "a":
                System.out.println(firstNumber + secondNumber);
                break;

            case "b":
                System.out.println(firstNumber - secondNumber);
                break;
            case "c":
                System.out.println(firstNumber * secondNumber);
                break;
            case "d":
                System.out.println(firstNumber / secondNumber);
                break;
            case "e":
                System.exit(0);
                break;

            default:
                break;
        }

    }
}