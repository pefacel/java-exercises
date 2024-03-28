
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Dates {
    static Scanner sc = new Scanner(System.in);

    static Calendar validateDateFromPromt() {
        while (true) {
            try {
                String dateFromPromp = sc.nextLine();

                int day = Integer.parseInt(dateFromPromp.substring(0, 2));
                int month = Integer.parseInt(dateFromPromp.substring(3, 5));
                int year = Integer.parseInt(dateFromPromp.substring(6, 10));

                Calendar calendar = new GregorianCalendar(year, month, day);

                return calendar;

            } catch (Exception e) {
                System.out.println(
                        "Error. La fecha debe tener como formato fecha como DD/MM/AAAA o es una fecha inválida. Vuelva a ingresarla.");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Ingrese la primera fecha como DD/MM/AAAA");
        Calendar firstDate = validateDateFromPromt();
        
        System.out.println("Ingrese la segunda fecha como DD/MM/AAAA");
        Calendar secondDate = validateDateFromPromt();

        int compareDates = firstDate.compareTo(secondDate);

        switch (compareDates) {
            case 1:
                System.out.println("La persona 2 es mayor");
                break;
            case -1:
                System.out.println("La persona 1 es mayor");
                break;

            default:
                System.out.println(" Tienen la misma edad");
                break;
        }

    }

}