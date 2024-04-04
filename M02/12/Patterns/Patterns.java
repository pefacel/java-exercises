import java.util.Scanner;

public class Patterns {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese un número: ");

        int number = sc.nextInt();

        String patternOne = "";
        String patternTwo = "";
        String patternThree = "";

        for (int i = 1; i < number + 1; i++) {
            patternOne += getPatternOne(i);
            patternTwo += getPatternTwo(i);
            patternThree += getPatternThree(i);

        }
        System.out.println(patternOne);
        System.out.println(patternTwo);
        System.out.println(patternThree);

    }

    static String getPatternOne(int index) {
        return index % 2 == 0 ? "." : "*";
    };

    static String getPatternTwo(int index) {
        if (index % 4 == 0) {
            return "4";
        }
        if (index % 3 == 0) {
            return "3";
        }
        if (index % 2 == 0) {
            return "2";
        }
        return "1";
    };

    static String getPatternThree(int index) {
        return index % 3 == 0 ? "*" : "|";

    };

}
