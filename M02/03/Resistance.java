import java.util.Scanner;

public class Resistance {
    static Scanner sc = new Scanner(System.in);

    static double getResistanceFromPromt(int resistanceNumber) {
        double resistance;
        do {
            System.out.println("Ingrese resistencia " + resistanceNumber + ":");
            resistance = sc.nextLong();
            if (resistance <= 0) {
                System.out.println("Resistencia debe se mayor a 0.");
            }
        } while (resistance <= 0);
        return resistance;
    }

    public static void main(String[] args) {

        double resistanceOne = getResistanceFromPromt(1);
        double resistanceTwo = getResistanceFromPromt(2);
        double resistanceThree = getResistanceFromPromt(3);

        double resistanceTotal = (1 / (1 / resistanceOne) + (1 / resistanceTwo) + (1 / resistanceThree));
        System.out.println("La resistencia total es de " +resistanceTotal );
      
    }

}