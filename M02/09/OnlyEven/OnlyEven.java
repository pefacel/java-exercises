import java.util.Scanner;

public class OnlyEven {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese un número: ");

        int number = sc.nextInt();

        boolean isEven = true;

        for (int i = 0; i < number * 2; i++) {
            if (isEven) {
                System.out.println(i);
            }
            isEven = !isEven;
        }

    }
}
