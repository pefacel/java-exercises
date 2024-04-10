import java.util.Scanner;

public class NestedPatterns {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese un número: ");

     int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            squarePattern(i);
        }
        for (int i = 1; i <= number; i++) {
            zetaPattern(i);
        }
        for (int i = 1; i <= number; i++) {
            xPattern(i);
        }
        for (int i = 1; i <= number; i++) {
            stuffedZetaPattern(i);
        }
    }

    private static void squarePattern(int number) {

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (i == 1 || j == 1 || i == number || j == number) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        System.out.println("n=" + number + "\n");

    }

    private static void zetaPattern(int number) {

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (i == 1 || j + i == number + 1 || i == number) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        System.out.println("n=" + number + "\n");

    }

    private static void xPattern(int number) {

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (i == j || j + i == number + 1) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        System.out.println("n=" + number + "\n");

    }

    private static void stuffedZetaPattern(int number) {

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (j == 1 && i == 1) {
                    System.out.print("*");
                } else if (j == number && i == number) {
                    System.out.print("*");
                } else if (j == number | j == 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
        System.out.println("n=" + number + "\n");

    }
}
