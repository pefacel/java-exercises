import java.util.ArrayList;

public class MultiplosDeTres {
    // TODO: RECIBIR VARIABLES DE LA CONSOLA

    public static void main(String[] args) {
        ArrayList<Integer> arrayInt = new ArrayList<Integer>();

        arrayInt.add(10);
        arrayInt.add(20);
        arrayInt.add(30);
        arrayInt.add(60);

        System.out.println("La suma es: " + suma(arrayInt));
        System.out.println("El promedio es " + promedio(arrayInt));

    }

    public static Integer suma(ArrayList<Integer> arrayInt) {

        int suma = 0;

        for (int e : arrayInt) {
            if (e % 3 == 0) {
                suma += e;
            }
        }

        return suma;

    }

    public static Integer promedio(ArrayList<Integer> arrayInt) {

        int suma = 0;
        int cantidad = 0;

        for (int e : arrayInt) {
            if (e % 3 == 0) {
                suma += e;
                cantidad++;
            }
        }

        return suma / cantidad;

    }
}
