import java.util.Scanner;

public class NestedPatterns {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // int number = sc.nextInt();
        // int number = 8;

        // for (int i = 1; i <= number; i++) {
        //     patternOne(i, "*");
        // }
        squarePattern(8);
    }

    public static int Factorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; ++i) {
          factorial *= i;
        }
        return factorial;
      }
 

    static String patternOne(int number, String sign) {
        int initialRow = 8;
        String[][] matrix = new String[number][number];

        for (int row = initialRow-number; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = " ";
                matrix[0][col] = sign;
                matrix[number - 1][col] = sign;
                matrix[row][0] = sign;
                matrix[row][number - 1] = sign;
            }

        }

        printMatrix(matrix);

        return "";
    }
    private static void squarePattern(int userNumber ) {

        for ( int i = 1; i <= userNumber; i++ ) {
            for ( int j = 1; j <= userNumber; j++ ) {
                if ( i == 1 || j == 1 || i == userNumber || j == userNumber ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("Patron finalizado con exito! \n \n");

    }
    static void printMatrix(String[][] matrix) {
        String pattern = "";

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                pattern += matrix[row][col];

            }

            pattern = pattern + "\n";
        }
        // pattern += "n=" + matrix.length + "\n";

        System.out.printf(pattern);

    }
}
